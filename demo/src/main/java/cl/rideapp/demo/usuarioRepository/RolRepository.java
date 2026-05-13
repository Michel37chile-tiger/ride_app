package cl.rideapp.demo.usuarioRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.rideapp.demo.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
    
}

