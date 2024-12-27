package com.lichu.veterinaria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Dueño {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long idDuenio;
    private int dni;
    private String nombre;
    private String apellido;
    private int celular;
    @OneToMany(mappedBy = "due")
    private List<Mascota> listaMascotas;

    public Dueño(Long idDuenio, int dni, String nombre, String apellido, int celular, List<Mascota> listaMascotas) {
        this.idDuenio = idDuenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.listaMascotas = listaMascotas;
    }

    public Dueño() {
    }
}
