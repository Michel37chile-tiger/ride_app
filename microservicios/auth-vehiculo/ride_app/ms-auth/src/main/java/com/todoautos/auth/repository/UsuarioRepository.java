package com.todoautos.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoautos.auth.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByCorreo(String correo);

}