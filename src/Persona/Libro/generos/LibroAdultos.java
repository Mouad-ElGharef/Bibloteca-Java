package Persona.Libro.generos;

import Persona.Autor.Autor;
import Persona.Libro.libro.Libro;

import java.util.Date;

public class LibroAdultos extends Libro {
    private int edadMin;

    public LibroAdultos(String titulo, String isbn, Autor autor, Date fechaPublicacion, String descripcion, int edadMin) {
        super(titulo, isbn, autor, fechaPublicacion, descripcion);
        this.edadMin = edadMin;
    }

    public LibroAdultos(String titulo, String isbn, Autor autor, Date fechaPublicacion, int edadMin) {
        super(titulo, isbn, autor, fechaPublicacion);
        this.edadMin = edadMin;
    }

    public LibroAdultos(String titulo, String isbn, int edadMin) {
        super(titulo, isbn);
        this.edadMin = edadMin;
    }
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        String infoTema = " | Min Edad :  " + this.edadMin;
        return info + infoTema;
    }
}
