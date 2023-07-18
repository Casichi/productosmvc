package com.casichi.productos.models.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity ity
@Table ble(name = "productos")
public class Producto implements Serializable{
    @Id
    @GeneratedValue atedValue(strategy =GenerationType.IDENTITY)
    private Long id;
}
