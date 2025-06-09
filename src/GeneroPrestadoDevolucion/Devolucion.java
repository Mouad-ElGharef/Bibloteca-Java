package GeneroPrestadoDevolucion;

import Persona.Libro.libro.Libro;
import Usario.Usario;

import java.util.Date;
import java.util.List;

public class Devolucion {
    String codigoDevolucion;
    Usario usarioDevolucinando;
    Prestamo prestamo;
    List<Libro> librosDevolucionados;
    Date fechaDevolucionLibros;
    Date fechaDevolucionContrato;

    public Devolucion(String codigoDevolucion,Usario usarioDevolucinando, Prestamo prestamo, List<Libro> librosDevolucionados, Date fechaDevolucionLibros, Date fechaDevolucionContrato) {
        this.codigoDevolucion = codigoDevolucion;
        this.usarioDevolucinando = usarioDevolucinando;
        this.prestamo = prestamo;
        this.librosDevolucionados = librosDevolucionados;
        this.fechaDevolucionLibros = fechaDevolucionLibros;
        this.fechaDevolucionContrato = fechaDevolucionContrato;
    }

    public String getCodigoDevolucion() {
        return codigoDevolucion;
    }

    public void setCodigoDevolucion(String codigoDevolucion) {
        this.codigoDevolucion = codigoDevolucion;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public List<Libro> getLibrosDevolucionados() {
        return librosDevolucionados;
    }

    public void setLibrosDevolucionados(List<Libro> librosDevolucionados) {
        this.librosDevolucionados = librosDevolucionados;
    }

    public Date getFechaDevolucionLibros() {
        return fechaDevolucionLibros;
    }

    public void setFechaDevolucionLibros(Date fechaDevolucionLibros) {
        this.fechaDevolucionLibros = fechaDevolucionLibros;
    }

    public Date getFechaDevolucionContrato() {
        return fechaDevolucionContrato;
    }

    public void setFechaDevolucionContrato(Date fechaDevolucionContrato) {
        this.fechaDevolucionContrato = fechaDevolucionContrato;
    }

    public Usario getUsarioDevolucinando() {
        return usarioDevolucinando;
    }

    public void setUsarioDevolucinando(Usario usarioDevolucinando) {
        this.usarioDevolucinando = usarioDevolucinando;
    }
    public boolean realizarDevolucion(){
        // TODO
        return false;
    }

}
