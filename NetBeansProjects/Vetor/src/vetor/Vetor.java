/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sostenes
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList(); 
        String entrada,nome,sobrenome,idade;
        idade = "0";
        while(idade == "0"){
            nome = JOptionPane.showInputDialog("insira nome : ");
            lista.add(nome);
            sobrenome = JOptionPane.showInputDialog("insira sobrenome : ");
            lista.add(sobrenome);
            idade = JOptionPane.showInputDialog("insira idade : ");
            lista.add(idade);
        }
        for(int i = 0;i<3;i++){
        System.out.println(lista.get(i));
        }
    }
    
}
