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

            switch (opcion) {
                case 1 -> logicaAlimentos();

                case 2 -> menu();
                
                default -> JOptionPane.showMessageDialog(null, "opcion invalida");
            }

        } while (opcion != 3);

    }

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

    public void logicaAlimentos() {
        int opcion;
        do {
            menu();

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu()));

        } while (opcion != 5);

    }
    
    

}
