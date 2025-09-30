package com.mycompany.main;

import javax.swing.JOptionPane;

public class Tienda {

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
                case 1 -> logicaAlimentos();

                case 2 -> menu();
                
                default -> JOptionPane.showMessageDialog(null, "opcion invalida");
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
                case 1 -> {
                }

                case 2 -> {
                }

                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                default -> throw new AssertionError();
            }
            
            

        } while (opcion != 5);

    }
    
    

}
