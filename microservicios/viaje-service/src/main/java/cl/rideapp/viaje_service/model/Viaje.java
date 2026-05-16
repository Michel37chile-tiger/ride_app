package cl.rideapp.viaje_service.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "viajes")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long usuarioId;

    @Column(nullable = false)
    private Long conductorId;

    @Column(nullable = false)
    private String origen;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false)
    private String estado; // Puede ser: PENDIENTE, EN_CURSO, COMPLETADO, CANCELADO

    // Mi constructor
    @Column(nullable = false)
    private LocalDateTime fechaHora;

    public Viaje() {
    }

    // Constructor con los parámetros
    public Viaje(Long usuarioId, Long conductorId, String origen, String destino, String estado,
            LocalDateTime fechaHora) {
        this.usuarioId = usuarioId;
        this.conductorId = conductorId;
        this.origen = origen;
        this.destino = destino;
        this.estado = estado;
        this.fechaHora = fechaHora;
    }

    // mis Getter & Setters
    public Long getId() {
        return id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public Long getConductorId() {
        return conductorId;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    // los Setters necesarios
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setConductorId(Long conductorId) {
        this.conductorId = conductorId;
    }

    // public void setId(Long id) {this.id = id;] Destino, Estado, FechaHora
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
