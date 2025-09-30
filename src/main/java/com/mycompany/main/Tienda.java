package com.mycompany.main;

import javax.swing.JOptionPane;

public class Tienda {

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
                case 1:
                    
                    
                    
                case 2:
                    
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"opcion invalida");
            }

        } while (opcion != 3);

    }

}
