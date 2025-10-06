package com.mycompany.main;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    
    private String nombre;
    private List<String> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new  ArrayList<>();
    }
    
    
    public void agregarProducto(String nombreProducto) {
        this.productos.add(nombreProducto);
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getProductos() {
        return productos;
    }

    
    





}
