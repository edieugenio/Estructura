
public class Main {
    
    public static void main(String args[]) {

        Libro l1 = new Libro();	//Se hace uso de uno de los constructores
        l1.asignarTitulo("Harry Potter");
        l1.asignarAutor("J. K. Rowling");
        l1.asignarNroPag(600); 
        System.out.println(l1.toString());

        Libro l2 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000);	// Se hace uso del segundo constructor
        System.out.println(l2.toString());
       
        // TODO: Crear un libro nuevo y mostrarlo.

        Libro l3 = new Libro();	//Crea una instancia de la clase Libro
        l3.asignarTitulo("Inferno");
        l3.asignarAutor("Dan Brown");
        l3.asignarNroPag(208); 
        System.out.println(l3.toString());

    }

}
