package com.mycompany.main;

public class Alimento extends Producto {

    private String fechaVencido;

    public Alimento(String nombre, Double precio, String fechaVencido) {
        super(nombre, precio);
        this.fechaVencido = fechaVencido;
    }

    public String getFechaVencido() {
        return fechaVencido;
    }

    public void setFechaVencido(String fechaVencido) {
        this.fechaVencido = fechaVencido;
    }

    @Override
    protected String getDescription() {
        return "Alimento: " + getNombre() + " - Precio: $" + getPrecio() + " - Vence: " + fechaVencido;
    }
}
