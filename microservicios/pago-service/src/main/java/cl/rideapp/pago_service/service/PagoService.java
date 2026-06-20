package cl.rideapp.pago_service.service;

import cl.rideapp.pago_service.model.Pago;
import cl.rideapp.pago_service.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> listarTodos() {
        return pagoRepository.findAll();
    }

    public Optional<Pago> buscarPorId(Long id) {
        return pagoRepository.findById(id);
    }

    public List<Pago> buscarPorViaje(Long viajeId) {
        return pagoRepository.findByViajeId(viajeId);
    }

    public List<Pago> buscarPorUsuario(Long usuarioId) {
        return pagoRepository.findByUsuarioId(usuarioId);
    }

    public List<Pago> buscarPorEstado(String estado) {
        return pagoRepository.findByEstado(estado);
    }

    public Pago guardar(Pago pago) {
        return pagoRepository.save(pago);
    }

    public void eliminar(Long id) {
        pagoRepository.deleteById(id);
    }
}
