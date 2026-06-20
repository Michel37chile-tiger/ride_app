package cl.rideapp.viaje_service.repository;

import cl.rideapp.viaje_service.model.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> {
    // Acá los 3 Roles
    List<Viaje> findByUsuarioId(Long usuarioId);

    List<Viaje> findByConductorId(Long conductorId);

    List<Viaje> findByEstado(String estado);

}
