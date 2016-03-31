package dados.futebol;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import dados.futebol.interfaces.ITimeDAO;
import dados.generico.DAOGenerico;
import futebol.Time;

public class TimeDAO extends DAOGenerico<Time> implements ITimeDAO {

	public TimeDAO(EntityManager em) {
		super(em);
	}

	public List<Time> pesquisarPorNome(String nome) {
		TypedQuery<Time> query = this.entityManager.createNamedQuery("Time.findByNome", this.classePersistente);
		query.setParameter("nome", "%" + nome + "%");
		return query.getResultList();
	}

	@Override
	public List<Time> pesquisarTimesComTecnicosRepetidos() {
		TypedQuery<Time> query = this.entityManager.createNamedQuery("Time.findByTecnicoRepetido2", this.classePersistente);
		return query.getResultList();
	}
	
	@Override
	public List<Object[]> listarDadosTimes() {
		Query query = this.entityManager.createNamedQuery("Time.listDados2");
		return query.getResultList();
	}

}
