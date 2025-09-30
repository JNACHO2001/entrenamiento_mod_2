package com.mycompany.main;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tienda {

    ArrayList<Producto> alimentos = new ArrayList();

    // creamos un  metodo para iniciar cuando estemos en main 
    public void iniciar() {
        int opcion;

        try {

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
                        
                        
                        
                    case 3->
                       cerrarPrograma();

                    default ->
                        JOptionPane.showMessageDialog(null, "opcion invalida");
                }

            } while (opcion != 3);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SE PRODUJO UN ERROR");
        }

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

        try {
            do {
                menu();

                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

                switch (opcion) {
                    case 1 ->
                        agregarAlimento();

                    case 2 ->
                        listarAlimentos();

                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> 
                       salirAlMenu();
                    
                    default ->
                        JOptionPane.showMessageDialog(null, "opcion invalida");
                }

            } while (opcion != 5);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SE PRODUJO UN ERROR");
        }

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

        // instanciamos un alimento y le pasamos los aprametros que recibe 
        Alimento alimento = new Alimento(fechaVencido, nombre, precio, stock);
        // agregamos un nuevo alimento a la lita de alimentos 

        alimentos.add(alimento);

        JOptionPane.showMessageDialog(null, "--Producto agregado con exito--");

    }

    public void listarAlimentos() {

        // validar que los campos no entren vacios 
        if (alimentos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "--Debe agregar productos --");

            return;

        }

        // creamos este string para concatenar objetos y cadenas de texto
        StringBuilder lista = new StringBuilder("Lista de Alimentos:\n");

        // recorremos la lista y se imprime los datos de todo el alimento,el appen es para insertar texto 
        alimentos.forEach((alimento) -> {
            lista.append(alimento.getDescription()).append("\n");

        });

        JOptionPane.showMessageDialog(null, lista);

    }

    public void salirAlMenu() {
        JOptionPane.showMessageDialog(null, "volviendo...");
        return;

    }

    public void cerrarPrograma() {
        JOptionPane.showMessageDialog(null, "Hasta pronto..");
        System.exit(0);
    }

}
