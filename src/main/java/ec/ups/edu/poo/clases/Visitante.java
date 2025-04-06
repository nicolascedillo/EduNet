package ec.ups.edu.poo.clases;
import java.util.GregorianCalendar;

public class Visitante extends Persona{
    private String motivo;
    private GregorianCalendar fechaDeEntrada;
    private GregorianCalendar fechaDeSalida;

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
                "\nMotivo: " + motivo +
                "\nFecha de entrada: " + fechaDeEntrada +
                "\nFecha de salida: " + fechaDeSalida;
    }
}
