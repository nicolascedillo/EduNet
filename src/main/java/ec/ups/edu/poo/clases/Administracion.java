package ec.ups.edu.poo.clases;

import java.util.List;

public class Administracion extends Persona{
    private List<String> cargos;
    private List<String> listaDeResponsabilidades;

    //Constructores

    public Administracion() {
    }

    public Administracion(String cedula, String nombre, String apellido, String celular, String email, List<String> cargos, List<String> listaDeResponsabilidades) {
        super(cedula, nombre, apellido, celular, email);
        this.cargos = cargos;
        this.listaDeResponsabilidades = listaDeResponsabilidades;
    }

    //Getter y setter
    public List<String> getListaDeResponsabilidades() {
        return listaDeResponsabilidades;
    }

    public void setListaDeResponsabilidades(List<String> listaDeResponsabilidades) {
        this.listaDeResponsabilidades = listaDeResponsabilidades;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nCargos: " + cargos +
                "\n Responsabilidades: " + listaDeResponsabilidades;
    }
}
