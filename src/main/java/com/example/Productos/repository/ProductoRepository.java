package com.example.Productos.repository;

import com.example.Productos.entidades.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ProductoRepository extends JpaRepository<Producto, Long> {



}
