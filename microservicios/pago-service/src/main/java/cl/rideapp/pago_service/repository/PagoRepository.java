package cl.rideapp.pago_service.repository;

import cl.rideapp.pago_service.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByViajeId(Long viajeId);

    List<Pago> findByUsuarioId(Long usuarioId);

    List<Pago> findByEstado(String estado);
}
