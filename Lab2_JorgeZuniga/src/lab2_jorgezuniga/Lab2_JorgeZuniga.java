/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_jorgezuniga;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Lab2_JorgeZuniga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char resp = 's';
        while(resp == 's'){
            int opp;
            opp = Integer.parseInt(JOptionPane.showInputDialog(null,"=====MENU=====\n"
                    +"1) Agregar detectives\n" +
                     "2) Eliminar detectives.\n" +
                     "3) Modificar Detectives\n" +
                     "4) Listar Detectives\n" +
                     "5) Registrar Casos\n" +
                     "6) Modificar Casos\n" +
                     "7) Listar Casos\n" +
                     "8) Listar casos resueltos (TODOS LOS CASOS)\n" +
                     "9) Listar casos pendientes (TODOS LOS CASOS)\n"
                    + "10)Salida"));
        }
        
    }
    
}
