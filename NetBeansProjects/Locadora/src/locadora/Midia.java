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
public class Midia {

    int codigoMidia;
    String descricao;
    Filme filme;

    public Midia() {
        this.descricao = "DVD";
        this.codigoMidia = 1760;
    }

    String r() {
        Midia midia = new Midia();
        Filme filme = new Filme();
        JOptionPane.showMessageDialog(null, " codigo midia ;" + midia.codigoMidia + "descricao : " + midia.descricao + "codigo filme " + filme.codigoFilme);
        return null;
    }
}
