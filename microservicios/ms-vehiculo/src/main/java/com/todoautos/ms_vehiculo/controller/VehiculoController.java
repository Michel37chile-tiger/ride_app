package com.todoautos.ms_vehiculo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.todoautos.ms_vehiculo.entity.Vehiculo;
import com.todoautos.ms_vehiculo.service.VehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    // LISTAR
    @GetMapping("/listar")
    public List<Vehiculo> listar() {
        return vehiculoService.listarVehiculos();
    }

    // BUSCAR
    @GetMapping("/buscar/{id}")
    public Vehiculo buscar(@PathVariable Integer id) {
        return vehiculoService.buscarPorId(id);
    }

    // CREAR
    @PostMapping("/crear")
    public Vehiculo crear(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.crearVehiculo(vehiculo);
    }

    // ACTUALIZAR
    @PutMapping("/actualizar")
    public Vehiculo actualizar(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.actualizarVehiculo(vehiculo);
    }

    // ELIMINAR
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        vehiculoService.eliminarVehiculo(id);
    }
}