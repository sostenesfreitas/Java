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
public class Filme {

    int codigoFilme;
    String nomeFilme;
    Categoria categoria;

    public Filme() {
        this.codigoFilme = 8787087;
        this.nomeFilme = "KINGS MAN";
    }

    String o() {
        Filme filme = new Filme();
        Categoria categoria = new Categoria();
        JOptionPane.showMessageDialog(null, "Codigo do filme " + filme.codigoFilme + "nome filme" + filme.nomeFilme + "codigo categoria" + categoria.codigoCategoria);
        return null;
    }

}
