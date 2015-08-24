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
public class Jogador {
   String nome;
   int id;
  public String cadastro(){
       JOptionPane.showInputDialog("informe nome");
       JOptionPane.showInputDialog("informe id");
       JOptionPane.showMessageDialog(null,"jogador cadastrado com sucesso");
       return null;
       
       
   }
}
