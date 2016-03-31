package dados.futebol;

import javax.persistence.EntityManager;

import dados.futebol.interfaces.ITecnicoDAO;
import futebol.Tecnico;

public class TecnicoDAO extends PessoaDAO<Tecnico> implements ITecnicoDAO {

	public TecnicoDAO(EntityManager em) {
		super(em);
		this.NAMED_QUERY_BYNOME = "Tecnico.findByNome";
	}

}
