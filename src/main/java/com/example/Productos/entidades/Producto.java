package com.example.Productos.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name= "PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name= "id_Producto")
    private Long id;

    @Column(name= "Nombre")
    private String nombre;

    @Column(name= "Cantidad")
    private Integer cantidad;

    @Column(name= "Descripcion")
    private String descripcion;

}
