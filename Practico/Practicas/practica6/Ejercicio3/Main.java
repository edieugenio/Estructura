public class Main {
    
    public static void main(String args[]) {

    	LinkedBinaryTree root = new LinkedBinaryTree(); //Creo un arbol binario basico

  		root.setRoot(new TreeNode(1)); 	//A la raiz le doy un nuevo valor
  		
  		//Para 
  		if(root.isEmpty()){
  			System.out.println("El Arbol esta vacio.");
  		}else{
  			System.out.println("El Arbol no esta vacio");
  		}
  		
  		root.insertLeft(new TreeNode(2));
  		root.insertRigth(new TreeNode(4));
  		root.insertRigth(new TreeNode(5));
  		root.insertLeft(new TreeNode(3));
  		System.out.println("El Arbol mostrado en PreOrder es: ");
  		root.printPreOrder();
      System.out.println();
      System.out.println("El Arbol mostrado en InOrder es: ");
      root.printInOrder();
      System.out.println();
      System.out.println("El Arbol mostrado en PostOrder es: ");
      root.printPostOrder();  
      System.out.println();
   }
 } 	