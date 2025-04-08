package ec.ups.edu.poo.clases;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Institucion {
    private int identificacion;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion() {
        asignaciones = new ArrayList<>();
    }

    public Institucion(int identificacion, String nombre, List<String> sedes, Direccion direccion, List<Asignacion> asignaciones) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sedes = sedes;
        this.direccion = direccion;
        this.asignaciones = new ArrayList<>();
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void addAsignacion(Asignacion asignacion){
        asignaciones.add(asignacion);
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
