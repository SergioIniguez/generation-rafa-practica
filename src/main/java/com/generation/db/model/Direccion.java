package com.generation.db.model;

import javax.persistence.*;

@Entity(name = "direccion")
public class Direccion {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String calle;

    private String noEx;

    private String noInt;

    private String cp;

    private String colonia;

    private String estado;

    private String pais;

    private String formatted;

    public Direccion() {
        super();
    }

    public Direccion(String calle, String noEx, String noInt, String cp, String colonia, String estado, String pais, String formatted) {
        this.calle = calle;
        this.noEx = noEx;
        this.noInt = noInt;
        this.cp = cp;
        this.colonia = colonia;
        this.estado = estado;
        this.pais = pais;
        this.formatted = formatted;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoEx() {
        return noEx;
    }

    public void setNoEx(String noEx) {
        this.noEx = noEx;
    }

    public String getNoInt() {
        return noInt;
    }

    public void setNoInt(String noInt) {
        this.noInt = noInt;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }
}
