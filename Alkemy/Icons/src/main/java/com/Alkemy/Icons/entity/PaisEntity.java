package com.Alkemy.Icons.entity;

import javax.persistence.*;

@Entity
@Table(name = "`pais`")
public class PaisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    @Column(name = "cant_habitantes")
    private Float cantidadHabitantes;

    @Column
    private Long superficie;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id")
    private ContinenteEntity continente;
}
