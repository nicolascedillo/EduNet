package ec.ups.edu.poo.clases;

public class Estudiante extends Persona{
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nCarrera: " + carrera;
    }
}
