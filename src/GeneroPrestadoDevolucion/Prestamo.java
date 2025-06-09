package GeneroPrestadoDevolucion;

import Persona.Libro.libro.Libro;
import Usario.Usario;
import java.util.Date;
import java.util.List;

public class Prestamo {
    String codigoPrestamo;
    List<Libro> librosPrestados;
    Usario usarioPrestando;
    Date fechaPrestamo;
    Date fechaDevolucion;

    public Prestamo(String codigoPrestamo, List<Libro> librosPrestados, Usario usarioPrestando, Date fechaPrestamo, Date fechaDevolucion) {
        this.codigoPrestamo = codigoPrestamo;
        this.librosPrestados = librosPrestados;
        this.usarioPrestando = usarioPrestando;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Usario getUsarioPrestando() {
        return usarioPrestando;
    }

    public void setUsarioPrestando(Usario usarioPrestando) {
        this.usarioPrestando = usarioPrestando;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean realizarPrestamo(){
        // TODO
        return false;
    }
}

