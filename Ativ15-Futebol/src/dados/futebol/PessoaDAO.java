package dados.futebol;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dados.futebol.interfaces.IPessoaDAO;
import dados.generico.DAOGenerico;
import futebol.Pessoa;

public class PessoaDAO<Entidade extends Pessoa> extends DAOGenerico<Entidade> implements
		IPessoaDAO<Entidade> {

	protected String NAMED_QUERY_BYNOME = "Pessoa.findByNome";

	public PessoaDAO(EntityManager em) {
		super(em);
	}

	@Override
	public List<Entidade> pesquisarPorNome(String nome) {
		TypedQuery<Entidade> query = this.entityManager.createNamedQuery(
				NAMED_QUERY_BYNOME, this.classePersistente);
		query.setParameter("nome", "%" + nome + "%");
		return query.getResultList();
	}

}
