package com.casichi.productos.models.service;

import com.casichi.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
}
