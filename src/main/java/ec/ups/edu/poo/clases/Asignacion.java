package ec.ups.edu.poo.clases;

import ec.ups.edu.poo.enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private Rol rol;
    private GregorianCalendar fechaDeInicio;

    //Constructor
    public Asignacion() {
    }

    public Asignacion(Persona persona, Rol rol, GregorianCalendar fechaDeInicio) {
        this.persona = persona;
        this.rol = rol;
        this.fechaDeInicio = fechaDeInicio;
    }

    //Getter y setter
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public GregorianCalendar getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(GregorianCalendar fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    @Override
    public String toString() {
        return
                "\n\t\tpersona=" + persona +
                ",\n\t\trol=" + rol +
                ",\n\t\tfechaDeInicio=" + fechaDeInicio +
                '}';
    }
}
