package cl.rideapp.demo.usuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import cl.rideapp.demo.model.Usuario;
import cl.rideapp.demo.usuarioRepository.UsuarioRepository;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    //Protejer la contraseña
    //private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        // Encripta nuestra pass antes de pasar a la Base datos
        /* 
        String passwordEncriptada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(passwordEncriptada);
        **/
        return repo.save(usuario);
    }

}

