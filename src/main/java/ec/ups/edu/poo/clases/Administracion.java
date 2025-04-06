package ec.ups.edu.poo.clases;

import java.util.List;

public class Administracion extends Persona{
    private List<String> cargos;
    private List<String> listaDeResponsabilidades;

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
