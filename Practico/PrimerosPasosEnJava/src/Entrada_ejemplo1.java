import java.util.*;	//Es un paquete que se incluye para utilizar la clase Scanner
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EN ESTE CASO, entrada ES UN OBJETO QUE LO UTILIZAMOS PARA RECIBIR INFORMACIÓN DE LA CONSOLA
		
		Scanner entrada=new Scanner(System.in);	//Declaramos una variable de tipo Scanner y le hemos dicho que sea igual a lo que se introduce por consola	 
		
		System.out.println("Introduce tu nombre, por favor ");
		
		String nombre_usuario=entrada.nextLine();	// Leemos una linea de caracteres que se introduce por consola
		
		System.out.println("Ingrese edad. por favor");
		
		int edad=entrada.nextInt();	//Leemos el entero que se introduce por consola
		
		System.out.println("Hola "+nombre_usuario+". El año que viene tendrás "+ (edad+1)+" años");
	}

}
