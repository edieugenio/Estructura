
public class Calculos_con_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PARA CALCULAR LA RAIZ CUADRADA DE UN NÚMERO
		double raiz=Math.sqrt(9);
		System.out.println(raiz);
		
		//PARA CALCULAR EL REDONDEO DE UN NÚMERO
		double num1=5.85;
		int resultado=(int)Math.round(num1);	//Lo que hacemos es castear la varible num1 que es un ssouble a una de tipo int, para poder almacenarlo en la variable resuiltado que es de tipo int. Hay que tener cuidado ya que esto puede genera pérdidad de información.
		System.out.println(resultado);
	
		//PARA CALCULAR LA POTENCIA DE UN NÚMERO
	
		double base=5;
		double exponente=3;
		int potencia=(int)Math.pow(base, exponente);	//Si no queremos castear, lo que debemos hacer es declarar a potencia como de tipo float y souble.
		System.out.println("El resultado de " + base + " elevado a " +exponente+ " es: "+potencia);
	}
}
