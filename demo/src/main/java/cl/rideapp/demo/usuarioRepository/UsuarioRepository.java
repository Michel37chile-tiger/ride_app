package cl.rideapp.demo.usuarioRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.rideapp.demo.model.Usuario;

//ACÁ VA UNA INTERFAZ (NO UNA CLASE) <----- Corregido
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
//Se puede editar desde acá mismo igual
//Trabajar con tutorIA, Claude/ ChatGPT/ Gemini/ etc...

