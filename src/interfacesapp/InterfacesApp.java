/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesapp;

import Pantallas.ListaDeNavegadores;

/**
 *
 * @author GIAN
 */
public class InterfacesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDeNavegadores lista = new ListaDeNavegadores();
        lista.setLocationRelativeTo(null); //Posiciona al centro
        lista.setVisible(true); //Muestra
        
    }
    
}
