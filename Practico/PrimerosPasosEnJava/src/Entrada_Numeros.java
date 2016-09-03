import javax.swing.*;

public class Entrada_Numeros {
	public static void main (String[] args){
		
		//ALGUNAS VECES PRECISAMOS MOSTRAR UN NÚMERO CON UN NUMERO ACOTADO DE LUGARES DESPUÉS DE LA COMA
		double x=1000.0;
		
		System.out.printf("%1.2f", x/3);	
		System.out.println();

		//CALCULO DE LA RAIZ CUADRADA DE UN NUMERO +
		
		String num1=JOptionPane.showInputDialog("Introduce un número: ");
		
		//Como el método parseDouble es estático, necesitamos ponerle el nombre de la clase adelante
		double num2=Double.parseDouble(num1);	//Tenemos que convertirlo a double ya que el metodo sqrt nos exije que sea de ese tipo
		
		System.out.print("La raiz cuadrada de "+num2+ " es ");
		System.out.printf("%1.8f",Math.sqrt(num2));
	}

}
