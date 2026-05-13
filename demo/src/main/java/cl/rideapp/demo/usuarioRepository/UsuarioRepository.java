package cl.rideapp.demo.usuarioRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.rideapp.demo.model.Usuario;

//ACÁ VA UNA INTERFAZ (NO UNA CLASE) <----- Corregido
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

/*
@Repository
public class UsuarioRepository {

    private List<Usuario> lista = new ArrayList<>();
    private Long contadorId = 1L;

    public List<Usuario> findAll() {
        return lista;
    }

    public Optional<Usuario> findById(Long id) {
        return lista.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    public Usuario save(Usuario usuario) {
        usuario.setId(contadorId++);
        lista.add(usuario);
        return usuario;
    }

    public void deleteById(Long id) {
        lista.removeIf(u -> u.getId().equals(id));
    }
}
 */

