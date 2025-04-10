package ec.ups.edu.poo.clases;

import java.util.GregorianCalendar;

public class Visitante extends Persona{
    private String motivo;
    private GregorianCalendar fechaDeEntrada;
    private GregorianCalendar fechaDeSalida;

    //Constructores
    public Visitante() {
    }

    public Visitante(String cedula, String nombre, String apellido, String celular, String email, String motivo, GregorianCalendar fechaDeEntrada, GregorianCalendar fechaDeSalida) {
        super(cedula, nombre, apellido, celular, email);
        this.motivo = motivo;
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
    }

    //Getter y setter
    public GregorianCalendar getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(GregorianCalendar fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public GregorianCalendar getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(GregorianCalendar fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n\t\tMotivo: " + motivo +
                "\n\t\tFecha de entrada: " + fechaDeEntrada +
                "\n\t\tFecha de salida: " + fechaDeSalida;
    }
}
