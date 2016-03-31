package dados.futebol;

import javax.persistence.EntityManager;

import dados.futebol.interfaces.ICampeonatoDAO;
import dados.generico.DAOGenerico;
import futebol.Campeonato;

public class CampeonatoDAO extends DAOGenerico<Campeonato> implements ICampeonatoDAO {

	public CampeonatoDAO(EntityManager em) {
		super(em);
	}

}
