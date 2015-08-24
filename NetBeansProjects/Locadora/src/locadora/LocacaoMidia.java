/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import javax.swing.JOptionPane;

/**
 *
 * @author sostenes
 */
public class LocacaoMidia {

    Locacao codigo;
    Midia midia;
    double preco;

    public LocacaoMidia() {
        this.preco = 20.00;
    }

    String m() {
        Midia midia = new Midia();
        Locacao locacao = new Locacao();
        LocacaoMidia locacaoMidia = new LocacaoMidia();
        JOptionPane.showMessageDialog(null, "locacao" + locacao.codigo + "midia" + midia.codigoMidia + "preco" + locacaoMidia.preco);

        return null;
    }
}
