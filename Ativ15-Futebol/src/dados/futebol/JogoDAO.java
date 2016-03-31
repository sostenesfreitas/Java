package dados.futebol;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import dados.futebol.interfaces.IJogoDAO;
import dados.generico.DAOGenerico;
import futebol.Jogo;
import futebol.Time;

public class JogoDAO extends DAOGenerico<Jogo> implements IJogoDAO {

	public JogoDAO(EntityManager em) {
		super(em);
	}

	@Override
	public List<Jogo> pesquisarJogosPorTimePeriodo(Time time, Date dataInicio,
			Date dataFim) {
		TypedQuery<Jogo> query = this.entityManager.createNamedQuery(
				"Jogo.findByTimeData", this.classePersistente);
		query.setParameter("time", time);
		query.setParameter("dataInicio", dataInicio);
		query.setParameter("dataFim", dataFim);
		return query.getResultList();
	}

	@Override
	public List<Jogo> pesquisarJogosNaoRealizados() {
		TypedQuery<Jogo> query = this.entityManager.createNamedQuery(
				"Jogo.findByRealizacao", this.classePersistente);
		return query.getResultList();
	}

	@Override
	public List<Object[]> listarQuantidadeJogosPorEstadio() {
		Query query = this.entityManager.createNamedQuery("Jogo.listQtdJogos");
		return query.getResultList();
	}

}
