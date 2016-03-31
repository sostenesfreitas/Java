package dados.futebol.interfaces;

import java.util.List;

import futebol.Jogador;
import futebol.Time;
import futebol.UF;
import futebol.relatorio.TimeMediaSalarial;

public interface IJogadorDAO extends IPessoaDAO<Jogador> {
	
	public Jogador pesquisarJogadorPeloNumeroCamisaTime(Integer numeroCamisa, Time time);
	
	public List<Jogador> pesquisarJogadoresTitulares(Time time);
	
	public Integer obterQuantidadeJogadores(UF uf, String nomeTimeAproximado);
	
	public List<TimeMediaSalarial> listarMediaSalarialTimes();
}
