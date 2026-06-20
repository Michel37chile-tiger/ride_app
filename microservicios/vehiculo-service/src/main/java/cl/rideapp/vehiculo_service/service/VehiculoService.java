package cl.rideapp.vehiculo_service.service;

import cl.rideapp.vehiculo_service.model.Vehiculo;
import cl.rideapp.vehiculo_service.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> listarTodos() {
        return vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> buscarPorId(Long id) {
        return vehiculoRepository.findById(id);
    }

    public List<Vehiculo> buscarPorConductor(Long conductorId) {
        return vehiculoRepository.findByConductorId(conductorId);
    }

    public Optional<Vehiculo> buscarPorPatente(String patente) {
        return vehiculoRepository.findByPatente(patente);
    }

    public List<Vehiculo> buscarPorEstado(String estado) {
        return vehiculoRepository.findByEstado(estado);
    }

    public Vehiculo guardar(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void eliminar(Long id) {
        vehiculoRepository.deleteById(id);
    }
}
