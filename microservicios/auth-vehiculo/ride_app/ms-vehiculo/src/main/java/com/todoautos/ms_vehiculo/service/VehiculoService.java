package com.todoautos.ms_vehiculo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoautos.ms_vehiculo.entity.Vehiculo;
import com.todoautos.ms_vehiculo.repository.VehiculoRepository;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    // LISTAR
    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }

    // BUSCAR
    public Vehiculo buscarPorId(Integer id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    // CREAR
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    // ACTUALIZAR
    public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    // ELIMINAR
    public void eliminarVehiculo(Integer id) {
        vehiculoRepository.deleteById(id);
    }
}