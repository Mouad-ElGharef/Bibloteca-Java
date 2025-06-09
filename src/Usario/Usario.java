package Usario;

public class Usario {
    private String dni;
    private String telefono;
    private String direccion;
    private String poblacion;

    public Usario(String dni, String telefono, String direccion, String poblacion) {
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.poblacion = poblacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void recomendarGeneros(){
        // TODO
    }
}
