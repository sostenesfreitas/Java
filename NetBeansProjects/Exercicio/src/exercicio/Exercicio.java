/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import javax.rmi.CORBA.Util;
import javax.swing.JOptionPane;
/**
 *
 * @author sostenes
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int idad; 
        String nome = JOptionPane.showInputDialog("insira nome");
        String idade = JOptionPane.showInputDialog("insira a idade");
       idad = Integer.parseInt(idade);
       
       JOptionPane.showMessageDialog (null , nome + " cadastrado com sucesso" );
        JOptionPane.showMessageDialog (null , idade +" viado  ");
        if (idad >= 18){
           
             JOptionPane.showMessageDialog (null ,"DE MAIOR");
        }else{
             JOptionPane.showMessageDialog (null ,"DE MENOR SAFADO");
        }
        }
    }
    
}
