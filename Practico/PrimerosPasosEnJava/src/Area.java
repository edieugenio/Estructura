import java.util.*;	//Para hacer uso de la clase Scanner
import javax.swing.*;	//Contiene la clase JOptionPane
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);	//Para que el usuario pueda introducir información en consola
		
		System.out.println("Elige una opcion: \n1:Cuadrado \n2:Rectángulo \n3:Triángulo \n4:Círculo");
	
		int figura=entrada.nextInt();	//Se almacena el proximo entero que se introduce
		
		switch(figura){
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El área del cuadrado es "+ Math.pow(lado, 2));	
			break;
			
		}
	}

}
