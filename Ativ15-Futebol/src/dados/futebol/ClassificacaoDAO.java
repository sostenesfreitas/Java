package dados.futebol;

import javax.persistence.EntityManager;

import dados.futebol.interfaces.IClassificacaoDAO;
import dados.generico.DAOGenerico;
import futebol.Classificacao;

public class ClassificacaoDAO extends DAOGenerico<Classificacao> implements
		IClassificacaoDAO {

	public ClassificacaoDAO(EntityManager em) {
		super(em);
	}

}
