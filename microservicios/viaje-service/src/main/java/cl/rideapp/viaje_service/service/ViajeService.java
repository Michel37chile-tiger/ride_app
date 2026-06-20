package cl.rideapp.viaje_service.service;

import cl.rideapp.viaje_service.model.Viaje;
import cl.rideapp.viaje_service.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ViajeService {

    @Autowired
    private ViajeRepository viajeRepository;

    public List<Viaje> listarTodos() {
        return viajeRepository.findAll();
    }

    public Optional<Viaje> buscarPorId(Long id) {
        return viajeRepository.findById(id);
    }

    public List<Viaje> buscarPorUsuario(Long usuarioId) {
        return viajeRepository.findByUsuarioId(usuarioId);
    }

    public List<Viaje> buscarPorConductor(Long conductorId) {
        return viajeRepository.findByConductorId(conductorId);
    }

    public List<Viaje> buscarPorEstado(String estado) {
        return viajeRepository.findByEstado(estado);
    }

    public Viaje guardar(Viaje viaje) {
        return viajeRepository.save(viaje);
    }

    public void eliminar(Long id) {
        viajeRepository.deleteById(id);
    }

}
