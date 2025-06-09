package Persona.Libro.libro;

import Persona.Autor.Autor;

import java.util.Date;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Date fechaPublicacion;
    private String descripcion;

    // CONSTRUCTOR SOLO QUE TITULO Y ISBN
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    // COONSTRUCTO SIN DESCPRIPCION
    public Libro(String titulo, String isbn, Autor autor, Date fechaPublicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    // CONSTRUCTOR CON DESCRIPCION
    public Libro(String titulo, String isbn, Autor autor, Date fechaPublicacion, String descripcion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String mostrarInfo(){
        String info = "TITULO : " + this.titulo + " | ISBN : " + isbn + " | AUTOR : " + evitarNulo(autor.getNombre()) + " | FECHA DE PUBLICACION: " + fechaPublicacion +
                "\n DESCPRIPCION :  " + evitarNulo(descripcion);
        return info;
    }

    public String evitarNulo(String dato){
        return (dato == null || dato.isEmpty() ? " Aun No tiene " : dato);
    }
}
