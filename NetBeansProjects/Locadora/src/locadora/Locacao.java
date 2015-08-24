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
public class Locacao {

    int codigo;
    String data;
    Cliente cliente;

    public Locacao() {
        this.codigo = 000010;
        this.data = "2015";
    }

    String n() {
        Locacao locacao = new Locacao();
        Cliente cliente = new Cliente();
        JOptionPane.showMessageDialog(null, "codigo da locacao" + locacao.codigo + "data :" + locacao.data + "cpf " + cliente.cpf);
        return null;
    }
}
