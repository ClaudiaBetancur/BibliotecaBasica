package com.BibliotecaBasica.service;

import com.BibliotecaBasica.model.Usuario;
import com.BibliotecaBasica.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void createUser(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> getUser() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.addAll(usuarioRepository.findAll());
        return usuarios;
    }

    public void updateUser() {

    }

    public void deleteUser(Integer id){
        usuarioRepository.deleteById(id);
    }
}
