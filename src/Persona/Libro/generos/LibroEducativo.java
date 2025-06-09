package Persona.Libro.generos;
import java.util.Date;
import Persona.Libro.libro.Libro;
import Persona.Autor.Autor;
public class LibroEducativo extends Libro {
    private String nivel;

    public LibroEducativo(String titulo, String isbn) {
        super(titulo, isbn);
    }

    public LibroEducativo(String titulo, String isbn, Autor autor, Date fechaPublicacion) {
        super(titulo, isbn, autor, fechaPublicacion);
    }

    public LibroEducativo(String titulo, String isbn, Autor autor, Date fechaPublicacion, String descripcion) {
        super(titulo, isbn, autor, fechaPublicacion, descripcion);
    }

    public LibroEducativo(String titulo, String isbn, Autor autor, Date fechaPublicacion, String descpripcion, String nivel) {
        super(titulo, isbn, autor, fechaPublicacion, descpripcion);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        String infoNivel = " | NIVEL : " + this.nivel;
        return info + infoNivel;
    }
}


