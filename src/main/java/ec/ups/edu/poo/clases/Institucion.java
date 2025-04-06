package ec.ups.edu.poo.clases;

import java.util.GregorianCalendar;
import java.util.List;

public class Institucion {
    private String identificacion;
    private GregorianCalendar fechaDeInicio;
    private List<Persona> personas;

    public GregorianCalendar getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(GregorianCalendar fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString(){
        return "\nIdentificación: " + identificacion +
                "\nFecha de inicio: " + fechaDeInicio;
    }
}
