/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 var
 numero:inteiro
 iptu :inteiro
 compesa :inteiro
 energia :inteiro
 soma1,soma2,soma3:inteiro
 media1,media2,media3:real
 maior:inteiro
 menor:inteiro
 total : real
 percentual:real
 mediageral:real
 qtd1,qtd2,qtd3,qtdmaior:inteiro
 m:inteiro
 */
package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author sostenes
 */
public class Casa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, iptu, compesa, energia, maior, menor, qtd1, qtd2, qtd3, qtdmaior, m;
        double soma1, soma2, soma3, percentual, mediageral;
        String entrada;

        menor = 9999999;
        soma1 = 0;
        soma2 = 0;
        soma3 = 0;
        qtd1 = 0;
        qtd2 = 0;
        qtd3 = 0;
        maior = 0;
        qtdmaior = 0;
        entrada = JOptionPane.showInputDialog("Informe numero");
        numero = Integer.parseInt(entrada);

        for (m = 0; m < 2; m++) {
            entrada = JOptionPane.showInputDialog("Informe IPTU");
            iptu = Integer.parseInt(entrada);
            soma1 = iptu + soma1;
            qtd1++;
            while (iptu < 0) {
                entrada = JOptionPane.showInputDialog("Informe IPTU");
                iptu = Integer.parseInt(entrada);
            }
            entrada = JOptionPane.showInputDialog("Informe numero da compesa");
            compesa = Integer.parseInt(entrada);
            soma2 = soma2 + compesa;
            qtd2++;
            while (compesa < 0) {
                entrada = JOptionPane.showInputDialog("Informe compesa");
                compesa = Integer.parseInt(entrada);

            }
            entrada = JOptionPane.showInputDialog("Informe Energia");
            energia = Integer.parseInt(entrada);
            soma3 = soma3 + energia;
            qtd3++;
            while (energia < 0) {
                entrada = JOptionPane.showInputDialog("Informe energia");
                energia = Integer.parseInt(entrada);

            }
            if (energia > maior) {
                maior = energia;
            }
            if (compesa < menor) {
                menor = compesa;
            }
            if (soma1 > 200 || soma2 > 200 || soma3 > 200) {
                qtdmaior++;
            }
        }
        JOptionPane.showMessageDialog(null, "numero"+numero );
    }
}
