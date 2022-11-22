package com.example.Productos.controller;


import com.example.Productos.entidades.Producto;
import com.example.Productos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public Optional<List<Producto>> listar(){
        return productoService.listar();

    }

    @PostMapping("/crear")
    public Producto guardar(@RequestBody Producto p){
        ResponseEntity.ok(productoService.agregar(p));
        return p;
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Producto> buscarId(@PathVariable Long id){
        return ResponseEntity.ok(productoService.buscarId(id));
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        String resultado = "";
        ResponseEntity.ok(productoService.buscarId(id));
        productoService.eliminar(id);
        return resultado = "Se elimino correctamente";
    }

    @PutMapping("/modificar/{id}")
    public Producto modificar(@RequestBody Producto p ,@PathVariable Long id){
        return productoService.modificar(id, p.getCantidad());
    }
}
