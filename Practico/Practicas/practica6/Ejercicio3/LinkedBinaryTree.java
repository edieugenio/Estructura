	public class LinkedBinaryTree implements BinaryTreeBasics{
	
	// raiz del arbol
	private TreeNode root;

	// constructor por defecto de LinkedBinaryTree
	public LinkedBinaryTree(){
		root = null;
	}
	
	// constructor que setea un valor a la raiz
	public LinkedBinaryTree(TreeNode root){
		this.root = root;
	}
	
	//Devuelve el elemento de la raiz. Es de tipo Object
	public Object getRoot(){
		return root;
	}
	
	// setea la raiz con un NodoArbol
	public void setRoot(TreeNode node){
		root = node;
	}
	
	// retorna el hijo izquierdo de la raiz. Es un NodoArbol
	public TreeNode getLeft(){
		return root.getNodeLeft();
	}
	
	// inserta un NodoArbol al final del subarbol izquierdo de la raiz
	public void insertLeft(TreeNode node){
		if(root.getNodeLeft() == null){
			root.setNodeLeft(node);
		}else{
			root.getNodeLeft().insertLeft(node);
		}
	}
	
	// inserta un NodoArbol al final del subarbol derecho de la raiz
	public void insertRigth(TreeNode node){
		if(root.getNodeRigth() == null){
			root.setNodeRigth(node);
		}else{
			root.getNodeRigth().insertRigth(node);
		}
	}
	
	// dice si el arbol está vacio o no
	public boolean isEmpty(){
		return root.isEmptyNode();
	}

	// imprime el arbol de modo raiz hi hd
	public void printPreOrder(){
		root.printPreOrderNode();
	}

	// imprime el arbol de modo  hi raiz hd
	public void printInOrder(){
		root.printInOrderNode();
	}

	// imprime el arbol de modo  hi hd raiz 
	public void printPostOrder(){
		root.printPostOrderNode();
	}
}