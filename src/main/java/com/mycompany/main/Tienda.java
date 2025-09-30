package com.mycompany.main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tienda {

    ArrayList<Producto> productos = new ArrayList();

    // creamos un  metodo para iniciar cuando estemos en main 
    public void iniciar() {
        int opcion;
        do {

            String menu = """
                    ===MENU PRINCIPAL===
                    1. Gestionar Alimentos
                    2. Gestionar Electrodomésticos
                    3. Salir
                    """;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // llamamos a cada logica para implementarlas  
            switch (opcion) {
                case 1 ->
                    logicaAlimentos();

                case 2 ->
                    menu();

                default ->
                    JOptionPane.showMessageDialog(null, "opcion invalida");
            }

        } while (opcion != 3);

    }

    // creamos un menu para no duplicar  codigo
    // retornamos  el menu para llamar en otro lado el methodo
    public String menu() {
        String menu = """
                         ---- Menu Alimentos---
                         1. Agregar 
                         2. Listar
                         3. Editar 
                         4. Eliminar
                         5. Volver
                         """;

        return menu;

    }

    // creamos la logica de alimentos  y traemos el menu 
    public void logicaAlimentos() {
        int opcion;
        do {
            menu();

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

            switch (opcion) {
                case 1 ->
                    agregarAlimento();


                case 2 -> {
                }

                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                default ->
                    JOptionPane.showMessageDialog(null, "opcion invalida");
            }

        } while (opcion != 5);

    }

    public void agregarAlimento() {
        String nombre = JOptionPane.showInputDialog(this, "--Ingresa el nombre del alimento--").trim();
        if (nombre == null) {
             JOptionPane.showMessageDialog(null, "--El campo no puede estar vacio--");
            return;
        }

        String precioInput = JOptionPane.showInputDialog(this, "--Ingresa el precio del alimento--").trim();
        if (precioInput == null) {
            return;
        }
        double precio = Double.parseDouble(precioInput);
        if (precio <= 0) {
             JOptionPane.showMessageDialog(null, "--El valor debe ser mayor a 0--");
            return;
        }

        String fechaVencido = JOptionPane.showInputDialog(this, "--Ingresa la fecha de vencimiento--").trim();
        if (fechaVencido == null) {
             JOptionPane.showMessageDialog(null, "--El campo no puede estar vacio--");
            return;
        }

        String cantidadInput = JOptionPane.showInputDialog(this, "--Ingresa la cantidad del producto--").trim();
        if (cantidadInput == null) {
            return;
        }
        int stock = Integer.parseInt(cantidadInput);
        if (stock <= 0) {
             JOptionPane.showMessageDialog(null, "--El valor debe ser mayor a 0--");
            return;
        }

        Alimento alimento = new Alimento(fechaVencido, nombre, precio, stock);

        productos.add(alimento);

        JOptionPane.showMessageDialog(null, "--Producto agregado con exito--");

    }

}
