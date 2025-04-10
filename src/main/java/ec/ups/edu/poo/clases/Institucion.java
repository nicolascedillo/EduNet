package ec.ups.edu.poo.clases;

import ec.ups.edu.poo.enums.TipoDireccion;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Institucion {
    private int identificacion;
    private String nombre;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    //Constructores
    public Institucion() {
        asignaciones = new ArrayList<>();
    }

    public Institucion(int identificacion, String nombre, List<String> sedes, Direccion direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sedes = sedes;
        this.direccion = direccion;
        this.asignaciones = new ArrayList<>();
    }


    //Getter y setter
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

    public void addDireccion(TipoDireccion tipoDireccion, String callePrincipal, String calleSecundaria, String numeracion, String ciudad, String provincia, String pais){
        this.direccion = new Direccion(tipoDireccion, callePrincipal, calleSecundaria, numeracion, ciudad, provincia, pais);
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
                "\n\tidentificacion=" + identificacion +
                ",\n\tnombre='" + nombre + '\'' +
                ",\n\tsedes=" + sedes +
                ",\n\tdireccion=" + direccion +
                ",\n\tasignaciones=" + asignaciones +
                '}';
    }
}
