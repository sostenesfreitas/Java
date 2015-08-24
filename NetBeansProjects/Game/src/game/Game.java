/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.JOptionPane;

/**
 *
 * @author sostenes
 */
public class Game {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Jogador g = new Jogador();
       g.cadastro();
       new FormGame().setVisible(true);
    }
    
}
