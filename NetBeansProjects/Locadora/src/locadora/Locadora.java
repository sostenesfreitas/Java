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
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Locacao locacao = new Locacao();
        Categoria categoria = new Categoria();
        Filme filme = new Filme();
        Midia midia = new Midia();
        LocacaoMidia locacaoMidia = new LocacaoMidia();
       
        
       
        String lista;
        lista = "Nome Cliente : " + cliente.nome +"\n"
              + "Cpf do Cliente : " + cliente.cpf  +"\n"
              + "Nome do Filme : " + filme.nomeFilme +"\n"
              + "Categoria do Filme : " + categoria.descricao +"\n"
              + "Tipo de Midia : " + midia.descricao +"\n"
              + "Preco da Locacão : " + locacaoMidia.preco +"\n"
              + "Codigo da Locacão : " + locacao.codigo +"\n"
              + "Codigo da Midia : " + midia.codigoMidia +"\n"
              + "Codigo do Filme : " + filme.codigoFilme +"\n"
              + "Codigo da Categoria : " + categoria.codigoCategoria  ;
        JOptionPane.showMessageDialog(null, lista);
     
    }

}
