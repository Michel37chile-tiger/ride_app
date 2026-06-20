package cl.rideapp.conductor_service.repository;

import cl.rideapp.conductor_service.model.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Long> {
    Optional<Conductor> findByEmail(String email);

    List<Conductor> findByEstado(String estado);
}
