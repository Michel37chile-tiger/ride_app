package cl.rideapp.viaje_service.controller;

import cl.rideapp.viaje_service.model.Viaje;
import cl.rideapp.viaje_service.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    private ViajeService viajeService;

    // GET - listar todos
    @GetMapping
    public List<Viaje> listarTodos() {
        return viajeService.listarTodos();
    }

    // GET - buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Viaje> buscarPorId(@PathVariable Long id) {
        return viajeService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET - buscar por usuario
    @GetMapping("/usuario/{usuarioId}")
    public List<Viaje> buscarPorUsuario(@PathVariable Long usuarioId) {
        return viajeService.buscarPorUsuario(usuarioId);
    }

    // GET - buscar por conductor
    @GetMapping("/conductor/{conductorId}")
    public List<Viaje> buscarPorConductor(@PathVariable Long conductorId) {
        return viajeService.buscarPorConductor(conductorId);
    }

    // GET - buscar por estado
    @GetMapping("/estado/{estado}")
    public List<Viaje> buscarPorEstado(@PathVariable String estado) {
        return viajeService.buscarPorEstado(estado);
    }

    // POST - crear viaje
    @PostMapping
    public Viaje crear(@RequestBody Viaje viaje) {
        return viajeService.guardar(viaje);
    }

    // DELETE - eliminar viaje
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        viajeService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
