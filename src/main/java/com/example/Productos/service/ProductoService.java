package com.example.Productos.service;

import com.example.Productos.entidades.Producto;
import com.example.Productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {


    @Autowired
    ProductoRepository productoRepository;

    public boolean agregar(Producto p){
        productoRepository.save(p);
        return false;
    }

    public Optional<List<Producto>> listar(){
        return Optional.of(productoRepository.findAll());
    }

    public void eliminar(Long id){
        productoRepository.deleteById(id);
    }

    public void modificar(Producto p, Long id, Integer compra){
        Optional<Producto> producto = productoRepository.findById(id);
        var productoNew = producto.get();
        productoNew.setCantidad(p.getCantidad()-compra);
        productoNew.setNombre("Producto modificado");
        productoRepository.save(productoNew);

    }
    public Producto buscarId(Long id) {
        return  productoRepository.findById(id).get();
    }

}
