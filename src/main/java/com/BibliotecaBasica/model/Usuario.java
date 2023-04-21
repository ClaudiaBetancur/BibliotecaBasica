package com.BibliotecaBasica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @Column (name = "id", nullable = false, length = 15)
    private Integer id;

    @Column (name = "name", nullable = false)
    private String name;

    private LocalDate birthDate;

}
