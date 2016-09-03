import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UNA FORMA DE GUARDAR LOS DATOS DE ENTRADA A LA VEZ QUE SE MUESTRA LO QUE SE PIDE
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");	//JOptionPane, es una clase estática, por lo que no es necesario instanciar un objeto de la misma mediante new.
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);	// Debido a que JOptionPane nos retorna un string, tenemos que parsear ese resultado a int, para luego poder sumarle un número
		
		System.out.println("Hola "+nombre_usuario+". El año que viende tendras "+(edad_usuario+1)+" años");
	}

}
