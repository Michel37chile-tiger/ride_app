package cl.rideapp.vehiculo_service.repository;

import cl.rideapp.vehiculo_service.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    List<Vehiculo> findByConductorId(Long conductorId);

    Optional<Vehiculo> findByPatente(String patente);

    List<Vehiculo> findByEstado(String estado);
}
