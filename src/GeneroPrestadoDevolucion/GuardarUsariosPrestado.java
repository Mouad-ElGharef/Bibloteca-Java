package GeneroPrestadoDevolucion;
import Usario.Usario;

import java.util.Iterator;
import java.util.Map;

public class GuardarUsariosPrestado {
    private Map<Usario,Prestamo> usariosPrestamdos;
    Usario usario;
    Prestamo prestamo;

    public GuardarUsariosPrestado(Map<Usario, Prestamo> usariosPrestamdos, Usario usario, Prestamo prestamo) {
        this.usariosPrestamdos = usariosPrestamdos;
        this.usario = usario;
        this.prestamo = prestamo;
    }

    public Map<Usario, Prestamo> getUsariosPrestamdos() {
        return usariosPrestamdos;
    }

    public void setUsariosPrestamdos(Map<Usario, Prestamo> usariosPrestamdos) {
        this.usariosPrestamdos = usariosPrestamdos;
    }

    public Usario getUsario() {
        return usario;
    }

    public void setUsario(Usario usario) {
        this.usario = usario;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void agregarUsario(Usario usario){
        usariosPrestamdos.put(usario,this.prestamo);
    }

    public boolean QuitarUsarioPrestamo(Usario usario, Prestamo prestamo){
        Iterator<Map.Entry<Usario,Prestamo>> it = usariosPrestamdos.entrySet().iterator();
       while (it.hasNext()){
           Map.Entry<Usario,Prestamo> entry = it.next();
           if(entry.getValue().equals(prestamo)){
               it.remove();
               return true;
           }
       }
        return false;
    }

}



