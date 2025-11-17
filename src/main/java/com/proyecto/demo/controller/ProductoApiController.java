package com.proyecto.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.model.Producto;
import com.proyecto.demo.repository.ProductoRepository;

@RestController
public class ProductoApiController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/api/productos")
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }
}