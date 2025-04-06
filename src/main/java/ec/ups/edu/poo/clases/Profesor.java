package ec.ups.edu.poo.clases;

import java.util.List;

public class Profesor extends Persona{
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
        this.areasDeEspecializacion = areasDeEspecializacion;
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nTítulos académicos: " + titulosAcademicos +
                "\nAreas de especialización: " + areasDeEspecializacion;
    }
}
