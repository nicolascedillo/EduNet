package ec.ups.edu.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String email;
    private List<Direccion> direcciones;

    //Constructores
    public Persona(){
        direcciones = new ArrayList<>();
    }

    public Persona(String cedula, String nombre, String apellido, String celular,
                   String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.direcciones = new ArrayList<>();
    }

    //Getter y setter

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addDireccion(Direccion direccion){
        direcciones.add(direccion);
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", celular='" + celular + '\'' +
                ", email='" + email + '\'' +
                ", direcciones=" + direcciones +
                '}';
    }
}
