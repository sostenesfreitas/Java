package dados.futebol;

import javax.persistence.EntityManager;

import dados.futebol.interfaces.IJuizDAO;
import futebol.Juiz;

public class JuizDAO extends PessoaDAO<Juiz> implements IJuizDAO {

	public JuizDAO(EntityManager em) {
		super(em);
		this.NAMED_QUERY_BYNOME = "Jogador.findByNome";
	}

}
