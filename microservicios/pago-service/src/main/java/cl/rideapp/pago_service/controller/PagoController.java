package cl.rideapp.pago_service.controller;

import cl.rideapp.pago_service.model.Pago;
import cl.rideapp.pago_service.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    // GET - listar todos
    @GetMapping
    public List<Pago> listarTodos() {
        return pagoService.listarTodos();
    }

    // GET - buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Pago> buscarPorId(@PathVariable Long id) {
        return pagoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET - buscar por viaje
    @GetMapping("/viaje/{viajeId}")
    public List<Pago> buscarPorViaje(@PathVariable Long viajeId) {
        return pagoService.buscarPorViaje(viajeId);
    }

    // GET - buscar por usuario
    @GetMapping("/usuario/{usuarioId}")
    public List<Pago> buscarPorUsuario(@PathVariable Long usuarioId) {
        return pagoService.buscarPorUsuario(usuarioId);
    }

    // GET - buscar por estado
    @GetMapping("/estado/{estado}")
    public List<Pago> buscarPorEstado(@PathVariable String estado) {
        return pagoService.buscarPorEstado(estado);
    }

    // POST - crear pago
    @PostMapping
    public Pago crear(@RequestBody Pago pago) {
        return pagoService.guardar(pago);
    }

    // DELETE - eliminar pago
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        pagoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
