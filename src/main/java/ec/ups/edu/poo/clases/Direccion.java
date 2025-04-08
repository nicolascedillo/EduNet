package ec.ups.edu.poo.clases;

import ec.ups.edu.poo.enums.TipoDireccion;

import java.util.List;

public class Direccion {
    private TipoDireccion tipo;
    private String numero;
    private String callePrincipal;
    private String calleSecundaria;
    private String ciudad;
    private String provincia;
    private String pais;
    private List<Persona> personas;

    public Direccion() {
    }

    public Direccion(TipoDireccion tipo, String numero, String callePrincipal, String calleSecundaria,
                     String ciudad, String provincia, String pais, List<Persona> personas) {
        this.tipo = tipo;
        this.numero = numero;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.personas = personas;
    }

    public TipoDireccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDireccion tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
    public String toString(){
        return "\nTipo: " + tipo +
                "\nNumero: " + numero +
                "\nCalle principal: " + callePrincipal +
                "\nCalle secundaria: " + calleSecundaria +
                "\nCiudad: " + ciudad +
                "\nProvincia: " + provincia +
                "\nPaís: " + pais;
    }
}
