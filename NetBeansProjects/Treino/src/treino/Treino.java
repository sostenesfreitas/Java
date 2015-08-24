/*
 * To change this license header, choose
package treino;
i
/**
 *
 * @author sostenes
 */
import javax.swing.JOptionPane;
public class Treino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog("Insira nome completo");
      int tamanho = nome.length();
      JOptionPane.showMessageDialog(null ,tamanho);
    }
    
}
