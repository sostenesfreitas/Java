/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prng;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author sostenes
 */
public class Prng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Determia as letras que poderão estar presente nas chaves  
String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";  
 
Random random = new Random();  
 
String armazenaChaves = "";  
int index = -1;  
for( int i = 0; i < 9; i++ ) {  
   index = random.nextInt( letras.length() );  
   armazenaChaves += letras.substring( index, index + 1 );  

}  
JOptionPane.showMessageDialog(null, armazenaChaves);
    }  
}
