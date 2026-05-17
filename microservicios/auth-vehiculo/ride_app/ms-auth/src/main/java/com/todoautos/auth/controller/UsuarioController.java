package com.todoautos.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.todoautos.auth.entity.LoginRequest;
import com.todoautos.auth.entity.Usuario;
import com.todoautos.auth.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // LISTAR
    @GetMapping("/listar")
    public List<Usuario> listar() {
        return usuarioService.listarUsuarios();
    }

    // BUSCAR
    @GetMapping("/buscar/{id}")
    public Usuario buscar(@PathVariable Integer id) {
        return usuarioService.buscarPorId(id);
    }

    // CREAR
    @PostMapping("/crear")
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }

    // ACTUALIZAR
    @PutMapping("/actualizar")
    public Usuario actualizar(@RequestBody Usuario usuario) {
        return usuarioService.actualizarUsuario(usuario);
    }

    // ELIMINAR
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        usuarioService.eliminarUsuario(id);
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

    Usuario usuario = usuarioService.buscarPorCorreo(request.getCorreo());

    if(usuario == null) {
        return "Usuario no encontrado";
    }

    if(!usuario.getPassword().equals(request.getPassword())) {
        return "Contraseña incorrecta";
    }

    return "Login correcto";
}
}
