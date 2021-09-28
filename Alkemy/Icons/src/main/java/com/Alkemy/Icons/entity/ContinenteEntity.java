package com.Alkemy.Icons.entity;

import javax.persistence.*;

@Entity
@Table(name = "`continente`")
public class ContinenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    @Column(name = "cant_habitantes")
    private Float cantidadHabitantes;


}
