package dados.futebol.interfaces;

import java.util.List;

import dados.generico.IDAOGenerico;
import futebol.Time;

public interface ITimeDAO extends IDAOGenerico<Time> {

	public List<Time> pesquisarPorNome(String nome);
	
	public List<Time> pesquisarTimesComTecnicosRepetidos();
	
	public List<Object[]> listarDadosTimes();
}
