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


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ciudadPais_id")
    private CiudadPaisEntity ciudadPais;
}
