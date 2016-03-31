package dados.futebol;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dados.futebol.interfaces.IJogadorDAO;
import futebol.Jogador;
import futebol.Time;
import futebol.UF;
import futebol.relatorio.TimeMediaSalarial;

public class JogadorDAO extends PessoaDAO<Jogador> implements IJogadorDAO {

	public JogadorDAO(EntityManager em) {
		super(em);
		this.NAMED_QUERY_BYNOME = "Jogador.findByNome";
	}

	@Override
	public Jogador pesquisarJogadorPeloNumeroCamisaTime(Integer numeroCamisa,
			Time time) {
		TypedQuery<Jogador> query = this.entityManager.createNamedQuery(
				"Jogador.findByNumeroCamisaTime", this.classePersistente);
		query.setParameter("numCam", numeroCamisa);
		query.setParameter("time", time);
		try {
			return query.setMaxResults(1).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Jogador> pesquisarJogadoresTitulares(Time time) {
		TypedQuery<Jogador> query = this.entityManager.createNamedQuery(
				"Jogador.findByTitularCartaoAmarelo", this.classePersistente);
		query.setParameter("titular", true);
		query.setParameter("time", time);
		return query.getResultList();
	}

	public Integer obterQuantidadeJogadores(UF uf, String nomeTimeAproximado){
		TypedQuery<Long> query = this.entityManager.createNamedQuery(
				"Jogador.countByUF", Long.class);
		query.setParameter("uf", uf);
		query.setParameter("nomeTime", nomeTimeAproximado + "%");
		return query.getSingleResult().intValue();
	}

	@Override
	public List<TimeMediaSalarial> listarMediaSalarialTimes() {
		TypedQuery<TimeMediaSalarial> query = this.entityManager.createNamedQuery(
				"Jogador.listMediaSalarial", TimeMediaSalarial.class);
		return query.getResultList();
	}
}
