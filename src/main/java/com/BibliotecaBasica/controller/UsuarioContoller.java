package com.BibliotecaBasica.controller;

import com.BibliotecaBasica.model.Usuario;
import com.BibliotecaBasica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UsuarioContoller {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    private List<Usuario> getUser(){
        return usuarioService.getUser();
    }

    @PostMapping("/usuario")
    private void  createUser(@RequestBody Usuario usuario) {
        usuarioService.createUser(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    private void deleteUser(@PathVariable ("id") Integer id) {
        usuarioService.deleteUser(id);
    }

}
