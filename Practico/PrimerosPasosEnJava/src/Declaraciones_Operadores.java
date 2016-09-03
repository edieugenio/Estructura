
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;	//Declaración de variables y asignación en la misma línea
		
		int b;	//Declaración en una misma línea
		
		b=7;	// Asignación en una misma línea
		
		int c=b+a;
		
		System.out.println(c);	// Se muestra por consola o por el terminal el valor de c
		
		double e=2.3;	//Para usar reales
		
		System.out.println(e);

		
		final int w=5; 	//Declaración de una constante
		System.out.println(w);
		
		//----------------------------------------
		
		final double apulgadas=2.54;
		
		double cm=6;
		double resultado=cm/apulgadas;
		
		System.out.println("En "+ cm + " cm hay " + resultado + " pulgadas");
	}

}
