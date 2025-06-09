package Persona.Libro.generos;

import Persona.Autor.Autor;
import java.util.Date;
import Persona.Libro.libro.Libro;

public class LibroCulturaGeneral extends Libro {
    private String tema;

    public LibroCulturaGeneral(String titulo, String isbn, Autor autor, Date fechaPublicacion, String descpripcion, String tema) {
        super(titulo, isbn, autor, fechaPublicacion, descpripcion);
        this.tema = tema;
    }

    public LibroCulturaGeneral(String titulo, String isbn, Autor autor, Date fechaPublicacion, String tema) {
        super(titulo, isbn, autor, fechaPublicacion);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LibroCulturaGeneral(String titulo, String isbn, String tema) {
        super(titulo, isbn);
        this.tema = tema;

    }
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        String infoTema = " Tema : " + this.tema;
        return  info + infoTema;

    }
}
