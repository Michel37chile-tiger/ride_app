package cl.rideapp.pago_service.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long viajeId;

    @Column(nullable = false)
    private Long usuarioId;

    @Column(nullable = false)
    private Double monto;

    @Column(nullable = false)
    private String metodoPago; // Modos de pagar: Efectivo, Tarjeta, Transferencia

    @Column(nullable = false)
    private String estado; // Estado: Pendiente, Completado, Fallido

    @Column(nullable = false)
    private LocalDateTime fechaHora;

    // Constructor vacío
    public Pago() {
    }

    // Mi constructor con los parámetros
    public Pago(Long viajeId, Long usuarioId, Double monto, String metodoPago, String estado, LocalDateTime fechaHora) {
        this.viajeId = viajeId;
        this.usuarioId = usuarioId;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = estado;
        this.fechaHora = fechaHora;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getViajeId() {
        return viajeId;
    }

    public Long getUsarioId() {
        return usuarioId;
    }

    public Double getMonto() {
        return monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    // mis Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setViajeId(Long viajeId) {
        this.viajeId = viajeId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

}
