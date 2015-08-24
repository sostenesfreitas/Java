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
public class Categoria {

    int codigoCategoria;
    String descricao;

    public Categoria() {
        this.codigoCategoria = 8901;
        this.descricao = "acao";
    }

    String f() {
        Categoria categoria = new Categoria();
        JOptionPane.showMessageDialog(null, "codigo categoria " + categoria.codigoCategoria + "descircao : " + categoria.descricao);
        return null;
    }
}
