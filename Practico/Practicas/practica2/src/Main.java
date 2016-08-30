
public class Main {
    
    public static void main(String args[]) {

        Libro l1 = new Libro();		//Es un tipo de Constructor
        l1.asignarTitulo("Harry Potter");
        l1.asignarAutor("J. K. Rowling");
        l1.asignarNroPag(600); 
        System.out.println(l1.toString());

        Libro l2 = new Libro("The Lord of the Rings", "J. R. R. Tolkien", 1000); //Es un segundo tipo de constructor
        System.out.println(l2.toString());
       
        // TODO: Crear un libro nuevo y mostrarlo.
        
        Libro l3 = new Libro();		//Es un tipo de Constructor
        l3.asignarTitulo("Inferno");
        l3.asignarAutor("Dan Brown");
        l3.asignarNroPag(208); 
        System.out.println(l3.toString());

    }

}
