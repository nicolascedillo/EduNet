package ec.ups.edu.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    //Constructores
    public Profesor() {
    }

    public Profesor(String cedula, String nombre, String apellido, String celular, String email, List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        super(cedula, nombre, apellido, celular, email);
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    //Getter y setter

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
                "\n\t\tTítulos académicos: " + titulosAcademicos +
                "\n\t\tAreas de especialización: " + areasDeEspecializacion;
    }
}
