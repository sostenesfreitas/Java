package dados.futebol.interfaces;

import java.util.List;

import dados.generico.IDAOGenerico;
import futebol.Pessoa;

public interface IPessoaDAO<Entidade extends Pessoa> extends IDAOGenerico<Entidade> {

	public List<Entidade> pesquisarPorNome(String nome);
}
