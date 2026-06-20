package cl.rideapp.conductor_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conductores")
public class Conductor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String licencia;

    @Column(nullable = false)
    private String estado; // DisPonible, Ocupado, Inactivo

    // Constructor vacío
    public Conductor() {
    }

    // Constructor con parámetros
    public Conductor(String nombre, String email, String telefono, String licencia, String estado) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.licencia = licencia;
        this.estado = estado;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
