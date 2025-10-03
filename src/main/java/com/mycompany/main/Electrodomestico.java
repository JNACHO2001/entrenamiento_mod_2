package com.mycompany.main;

public class Electrodomestico extends Producto {
    private String categoria;

    public Electrodomestico(String nombre, double precio, int stock, String categoria) {
        super(nombre, precio, stock);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    protected String getDescription() {
        return "Electrodoméstico: " + getNombre() + " - Precio: $" + getPrecio() +
               " - Stock: " + getStock() + " - Categoría: " + categoria;
    }
}
