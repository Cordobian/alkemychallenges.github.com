package com.Alkemy.Icons.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "`Iconos`")

public class IconoGeograficoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String imagen;

    @Column
    private String denominacion;

    @Column
    private Date fechaCreacion;

    @Column
    private float altura;

    @Column
    private String historia;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ciudadPais_id")
    private CiudadPaisEntity ciudadPais;
}
