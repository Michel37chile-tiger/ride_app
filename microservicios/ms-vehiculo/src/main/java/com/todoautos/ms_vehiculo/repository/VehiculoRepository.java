package com.todoautos.ms_vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoautos.ms_vehiculo.entity.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

}