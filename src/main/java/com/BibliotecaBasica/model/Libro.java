package com.BibliotecaBasica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "author", nullable = false, length = 26)
    private String author;

    @Column(name = "date_publication", nullable = false)
    private LocalDate datePublication;

    @Column(name = "book_name", nullable = false, length = 50)
    private String bookName;

    private Integer numberOfTimeBorrowed;

}
