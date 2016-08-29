
public class Libro {

    private String titulo;
    private String autor;
    private int nroPag;

    public Libro() {	//Constructor en el que no se le pasa parámetros
        titulo = null;
        autor = null;
        nroPag = 0;
    }

    public Libro(String t, String a, int p) {	//Constructor al que se le pasa 3 parámetros
        titulo = t;
        autor = a;
        nroPag = p;
    }

    public String obtenerTitulo() {
        return titulo;
    }

    public void asignarTitulo(String t) {
        titulo = t;
    }

    public String obtenerAutor() {
        return autor;
    }

    public void asignarAutor(String a) {
        autor = a;
    }

    public int obtenerNroPag() {
        return nroPag;
    }

    public void asignarNroPag(int n) {
        nroPag = n;
    }

    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + nroPag;
    }

}
