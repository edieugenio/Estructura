//ejemplo de una interfaz básica para árboles que contiene la funcionalidad mínima para 
//este tipo de estructuras, puede ser enriqucida con más operaciones

public interface BinaryTreeBasics{

	//Devuelve el elemento de la raiz
	public Object getRoot();

	//Setea la raiz
	public void setRoot(TreeNode node);

	//Dice si el árbol es vacío
	public boolean isEmpty();

	//Remueve todos los nodos del árbol
	//public void makeEmpty();

	//Recorrido preOrder
	public void printPreOrder();

	//Recorrido postOrder
	//public void printPostOrder();

	//Recorrido inOrder 
	//public void printInOrder();
}