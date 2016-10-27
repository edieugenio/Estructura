public class TreeNode{

	private Object element; 	//Elemento del nodo
	private TreeNode left; 		// Hijo izquierdo 
	private TreeNode rigth; 	// Hijo derecho

	// constructor del NodoArbol por defecto
	public TreeNode(){
		element = null;
		left = null;
		rigth = null;
	}
	
	// constructor del NodoArbol que setea un elemento al mismo
	public TreeNode(Object element){
		this.element = element;
		left = null;
		rigth = null;
	}
	
	// setea un elemento al NodoArbol
	public void setElement(Object element){
		this.element = element;
	}
	
	// setea un NodoArbol al hi
	public void setNodeLeft(TreeNode node){
		left = node;
	}
	
	// setea un NodoArbol al hd
	public void setNodeRigth(TreeNode node){
		rigth = node;
	}	
	
	// retorna el elemento izquierdo de un NodoArbol 
	public TreeNode getNodeLeft(){
		return left;
	}	
	
	// retorna el elemento derecho de un NodoArbol 
	public TreeNode getNodeRigth(){
		return rigth;
	}	
	
	// dice si un NodoArbol esta vacio
	public boolean isEmptyNode(){
		return element == null && left == null && rigth == null;
	}

	// dice si un NodoArbol no tiene hijo hizquierdo
	public boolean isEmptyNodeLeft(){
		return  left == null;

	}	

	// dice si un NodoArbol no tiene hijo derecho
	public boolean isEmptyNodeRigth(){
		return  rigth == null;
	}	

	//Inserta un elemento a la izquierda del NodoArbol
	//Si a la izquierda hay una hoja, lo inserta, sino sigue buscando a la izquierda
	public void insertLeft(TreeNode node){
		if(isEmptyNode()){
			element = node;
		}else{
			if(this.isEmptyNodeLeft()){
				left = node;	
			}else{
				left.insertLeft(node);
			}
		}
	}
	//Inserta un elemento a la derecha del nodo arbol
	//Si a la derecha hay una hoja, lo inserta, sino sigue buscando a la derecha
	public void insertRigth(TreeNode node){
		if(isEmptyNode()){
			element = node;
		}else{
			if(this.isEmptyNodeRigth()){
				rigth = node;	
			}else{
				rigth.insertLeft(node);
			}
		}
	}	
	// imprime el Arbol de la forma raiz + hi + hd
	public void printPreOrderNode(){
		System.out.print(element+" ");
		if (left != null){
			left.printPreOrderNode();
		}
		if (rigth != null){
			rigth.printPreOrderNode();
		}
	}

}