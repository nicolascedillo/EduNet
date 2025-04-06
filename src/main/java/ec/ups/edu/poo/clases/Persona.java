package ec.ups.edu.poo.clases;

import java.util.List;

public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String email;
    private List<Direccion> direcciones;
    private List<Institucion> instituciones;

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

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Institucion> getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(List<Institucion> instituciones) {
        this.instituciones = instituciones;
    }

    @Override
    public String toString(){
        return "\nCédula: " + cedula +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nCelular: " + celular +
                "\nEmail: " + email +
                "\nDirecciones: " + direcciones;
    }
}
