package cl.rideapp.conductor_service.controller;

import cl.rideapp.conductor_service.model.Conductor;
import cl.rideapp.conductor_service.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/conductores")
public class ConductorController {

    @Autowired
    private ConductorService conductorService;

    // GET - listar todos
    @GetMapping
    public List<Conductor> listarTodos() {
        return conductorService.listarTodos();
    }

    // GET - buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Conductor> buscarPorId(@PathVariable Long id) {
        return conductorService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET - buscar por estado
    @GetMapping("/estado/{estado}")
    public List<Conductor> buscarPorEstado(@PathVariable String estado) {
        return conductorService.buscarPorEstado(estado);
    }

    // POST - crear conductor
    @PostMapping
    public Conductor crear(@RequestBody Conductor conductor) {
        return conductorService.guardar(conductor);
    }

    // PUT - actualizar conductor
    @PutMapping("/{id}")
    public ResponseEntity<Conductor> actualizar(@PathVariable Long id, @RequestBody Conductor conductor) {
        return conductorService.buscarPorId(id)
                .map(c -> {
                    conductor.setId(id);
                    return ResponseEntity.ok(conductorService.guardar(conductor));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE - eliminar conductor
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        conductorService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
