package com.casichi.productos.models.dao;

import com.casichi.productos.ProductosApplication;
import com.casichi.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
