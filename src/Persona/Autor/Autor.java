package Persona.Autor;

import java.util.Date;
import java.util.List;
import Persona.Persona;
import Persona.Libro.libro.Libro;

public class Autor extends Persona {
    private String idAutor;
    private List<Libro> librosEscritos;
    private Date fechaNacimiento;
    private String localidadNacimiento;

    public Autor(String nombre, String apellido, String idAutor, List<Libro> librosEscritos, Date fechaNacimiento, String localidadNacimiento) {
        super(nombre, apellido);
        this.idAutor = idAutor;
        this.librosEscritos = librosEscritos;
        this.fechaNacimiento = fechaNacimiento;
        this.localidadNacimiento = localidadNacimiento;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public List<Libro> getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(List<Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLocalidadNacimiento() {
        return localidadNacimiento;
    }

    public void setLocalidadNacimiento(String localidadNacimiento) {
        this.localidadNacimiento = localidadNacimiento;
    }
}
