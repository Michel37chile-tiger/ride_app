package cl.rideapp.vehiculo_service.model;

import java.lang.annotation.Inherited;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long conductorId;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String patente;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private int anio;

    @Column(nullable = false)
    private String estado; // ACTIVO, INACTIVO, EN_MANTENCION

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(Long conductorId, String marca, String modelo, String patente, String color, int anio,
            String estado) {
        this.conductorId = conductorId;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
        this.anio = anio;
        this.estado = estado;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getConductorId() {
        return conductorId;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setConductorId(Long conductorId) {
        this.conductorId = conductorId;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
