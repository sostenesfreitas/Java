package dados.futebol.interfaces;

import java.util.Date;
import java.util.List;

import dados.generico.IDAOGenerico;
import futebol.Jogo;
import futebol.Time;

public interface IJogoDAO extends IDAOGenerico<Jogo> {

	public List<Jogo> pesquisarJogosPorTimePeriodo(Time time, Date dataInicio, Date dataFim); 
	
	public List<Jogo> pesquisarJogosNaoRealizados();
	
	public List<Object[]> listarQuantidadeJogosPorEstadio();
}
