package cl.rideapp.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cl.rideapp.demo.model.Rol;
import cl.rideapp.demo.usuarioRepository.RolRepository;

@Configuration // Configuración del sistema
public class DataLoader {

    @Bean
    CommandLineRunner initRoles(RolRepository repo) {
        return args -> {
            if(repo.count() == 0) {
                repo.save(new Rol("PASAJERO"));
                repo.save(new Rol("CONDUCTOR"));
                repo.save(new Rol("ADMIN"));
            }
        };
    }
}

