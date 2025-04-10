package ec.ups.edu.poo.clases;

import ec.ups.edu.poo.enums.TipoDireccion;

import java.util.List;

public class Direccion {
    private TipoDireccion tipo;
    private String numeracion;
    private String callePrincipal;
    private String calleSecundaria;
    private String ciudad;
    private String provincia;
    private String pais;

    //Constructor
    public Direccion() {
    }

    public Direccion(TipoDireccion tipo, String numeracion, String callePrincipal, String calleSecundaria,
                     String ciudad, String provincia, String pais) {
        this.tipo = tipo;
        this.numeracion = numeracion;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    //Getter y setter
    public TipoDireccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDireccion tipo) {
        this.tipo = tipo;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return  "\n\t\t\ttipo= " + tipo +
                ",\n\t\t\tnumeracion='" + numeracion + '\'' +
                ",\n\t\t\tcallePrincipal='" + callePrincipal + '\'' +
                ",\n\t\t\tcalleSecundaria='" + calleSecundaria + '\'' +
                ",\n\t\t\tciudad='" + ciudad + '\'' +
                ",\n\t\t\tprovincia='" + provincia + '\'' +
                ",\n\t\t\tpais='" + pais + '\'' +
                '}';
    }
}
