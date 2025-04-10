package ec.ups.edu.poo.clases;

public class Estudiante extends Persona{
    private String carrera;

    //Constructor
    public Estudiante(){}

    public Estudiante(String cedula, String nombre, String apellido, String celular, String email, String carrera) {
        super(cedula, nombre, apellido, celular, email);
        this.carrera = carrera;
    }

    //Getter y setter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n\t\tCarrera: " + carrera;
    }
}
