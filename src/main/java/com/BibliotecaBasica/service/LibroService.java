package com.BibliotecaBasica.service;

import com.BibliotecaBasica.model.Libro;
import com.BibliotecaBasica.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public void createBook(Libro libro){
        libroRepository.save(libro);
    }

    public List<Libro> getBook() {
        List<Libro> libros = new ArrayList<Libro>();
        libros.addAll(libroRepository.findAll());
        return libros;
    }

    public void updateBook(Integer id){
        libroRepository.deleteById(id);
    }

    public void deleteBook(Integer id){
        libroRepository.deleteById(id);
    }
}
