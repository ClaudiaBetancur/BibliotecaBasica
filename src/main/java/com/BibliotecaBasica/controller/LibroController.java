package com.BibliotecaBasica.controller;

import com.BibliotecaBasica.model.Libro;
import com.BibliotecaBasica.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping("/libro")
    private List<Libro> getBook(){
        return libroService.getBook();
    }

    @PostMapping("/libro")
    private void createBook(@RequestBody Libro libro){
        libroService.createBook(libro);
    }

    @DeleteMapping("/libro/{id}")
    private void deleteBook(@PathVariable ("id") Integer id) {
        libroService.deleteBook(id);
    }

    @PutMapping("/libro")
    private void updateBook(@RequestBody Libro libro){
        libroService.updateBook(libro.getId());
    }
}
