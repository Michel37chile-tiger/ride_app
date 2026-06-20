package cl.rideapp.conductor_service.service;

import cl.rideapp.conductor_service.model.Conductor;
import cl.rideapp.conductor_service.repository.ConductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ConductorService {

    @Autowired
    private ConductorRepository conductorRepository;

    public List<Conductor> listarTodos() {
        return conductorRepository.findAll();
    }

    public Optional<Conductor> buscarPorId(Long id) {
        return conductorRepository.findById(id);
    }

    public Optional<Conductor> buscarPorEmail(String email) {
        return conductorRepository.findByEmail(email);
    }

    public List<Conductor> buscarPorEstado(String estado) {
        return conductorRepository.findByEstado(estado);
    }

    public Conductor guardar(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    public void eliminar(Long id) {
        conductorRepository.deleteById(id);
    }
}
