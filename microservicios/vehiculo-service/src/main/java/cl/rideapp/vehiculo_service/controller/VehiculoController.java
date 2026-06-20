package cl.rideapp.vehiculo_service.controller;

import cl.rideapp.vehiculo_service.model.Vehiculo;
import cl.rideapp.vehiculo_service.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;

    // GET - listar todos
    @GetMapping
    public List<Vehiculo> listarTodos() {
        return vehiculoService.listarTodos();
    }

    // GET - buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> buscarPorId(@PathVariable Long id) {
        return vehiculoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET - buscar por conductor
    @GetMapping("/conductor/{conductorId}")
    public List<Vehiculo> buscarPorConductor(@PathVariable Long conductorId) {
        return vehiculoService.buscarPorConductor(conductorId);
    }

    // GET - buscar por patente
    @GetMapping("/patente/{patente}")
    public ResponseEntity<Vehiculo> buscarPorPatente(@PathVariable String patente) {
        return vehiculoService.buscarPorPatente(patente)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET - buscar por estado
    @GetMapping("/estado/{estado}")
    public List<Vehiculo> buscarPorEstado(@PathVariable String estado) {
        return vehiculoService.buscarPorEstado(estado);
    }

    // POST - crear vehiculo
    @PostMapping
    public Vehiculo crear(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.guardar(vehiculo);
    }

    // PUT - actualizar vehiculo
    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> actualizar(@PathVariable Long id, @RequestBody Vehiculo vehiculo) {
        return vehiculoService.buscarPorId(id)
                .map(v -> {
                    vehiculo.setId(id);
                    return ResponseEntity.ok(vehiculoService.guardar(vehiculo));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE - eliminar vehiculo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        vehiculoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
