package com.lichu.veterinaria.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    @ManyToOne
    @JoinColumn(name = "idDuenio")
    @JsonIgnoreProperties("listaMascotas")
    Dueño due;

    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String color, Dueño due) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.due = due;
    }
}
