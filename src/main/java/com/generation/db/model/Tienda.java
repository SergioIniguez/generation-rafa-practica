package com.generation.db.model;

import javax.persistence.*;

@Entity(name = "tienda")
public class Tienda {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreTienda;

    private String categoria;

    private String noEmpleados;

    private String horario;

    private String telefono;

    // Relaciones

    @ManyToOne(targetEntity = Direccion.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "id_direccion", foreignKey = @ForeignKey(name = "FK_DIRECCION_TIENDA"))
    Direccion direccion;

    public Tienda() {
        super();
    }

    public Tienda(String nombreTienda, String categoria, String noEmpleados, String horario, String telefono, Direccion direccion) {
        this.nombreTienda = nombreTienda;
        this.categoria = categoria;
        this.noEmpleados = noEmpleados;
        this.horario = horario;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNoEmpleados() {
        return noEmpleados;
    }

    public void setNoEmpleados(String noEmpleados) {
        this.noEmpleados = noEmpleados;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
