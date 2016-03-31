package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import util.Datas;
import dados.futebol.JogadorDAO;
import dados.futebol.JogoDAO;
import dados.futebol.JuizDAO;
import dados.futebol.TecnicoDAO;
import dados.futebol.TimeDAO;
import dados.futebol.interfaces.IJogadorDAO;
import dados.futebol.interfaces.IJogoDAO;
import dados.futebol.interfaces.IJuizDAO;
import dados.futebol.interfaces.ITecnicoDAO;
import dados.futebol.interfaces.ITimeDAO;
import futebol.Jogador;
import futebol.Jogo;
import futebol.Juiz;
import futebol.Tecnico;
import futebol.Time;
import futebol.UF;

public class TesteFutebol_Insercao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Variaveis do JPA para gerenciar as entidades
		EntityManagerFactory emf = null;
		EntityManager em = null;
		
		// DAO�s
		ITecnicoDAO tecnicoDAO = null;
		IJogadorDAO jogadorDAO = null;
		IJuizDAO juizDAO = null;
		ITimeDAO timeDAO = null;
		IJogoDAO jogoDAO = null;
		
		// Entidades para gerenciamento
		Tecnico tecPaulo = new Tecnico("Paulo Autuori", Datas.criarData(10, 3, 1958), 102000.0);
		Tecnico tecMano = new Tecnico("Mano Menezes", Datas.criarData(21, 4, 1957), 90000.0);
		Tecnico tecMarcelo = new Tecnico("Marcelo Oliveira", Datas.criarData(10, 3, 1958), 82500.0);
		
		Time saoPaulo = new Time("S�o Paulo", UF.SP, tecPaulo, 15);
		Time cruzeiro = new Time("Cruzeiro", UF.MG, tecMarcelo, 32);
		Time flamengo = new Time("Flamengo", UF.RJ, tecMano, 30);
		
		Jogador jRogerioCeni = new Jogador("Rog�rio Ceni", Datas.criarData(28,10,1979), 88000.0, 1, true, 2, 1, saoPaulo);
		Jogador jAlexSilva = new Jogador("Alex Silva", Datas.criarData(4,1,1983), 45000.0, 2, true, 2, 1, saoPaulo);
		Jogador jFabao = new Jogador("Fab�o", Datas.criarData(22,11,1982), 52500.0, 3, true, 3, 0, cruzeiro);
		Jogador jEdCarlos = new Jogador("Edcarlos", Datas.criarData(16,5,1984), 70000.0, 4, false, 1, 0, cruzeiro);
		
		Juiz juizArmando = new Juiz("Armando Marques", Datas.criarData(6,2,1930), 24000.0);
		Juiz juizPauloCesar = new Juiz("Paulo Cesar de Oliveira", Datas.criarData(16,12,1973), 35000.0);
		
		// Transacao 01 - Tecnicos
		try {
			emf = Persistence.createEntityManagerFactory("unitPSC");
			em = emf.createEntityManager();
			
			tecnicoDAO = new TecnicoDAO(em);
			jogadorDAO = new JogadorDAO(em);
			timeDAO = new TimeDAO(em);
			juizDAO = new JuizDAO(em);
			
			tecnicoDAO.inserir(tecPaulo);
			tecnicoDAO.inserir(tecMano);
			tecnicoDAO.inserir(tecMarcelo);
			
			timeDAO.inserir(saoPaulo);
			timeDAO.inserir(cruzeiro);
			timeDAO.inserir(flamengo);
			
			jogadorDAO.inserir(jRogerioCeni);
			jogadorDAO.inserir(jAlexSilva);
			jogadorDAO.inserir(jFabao);
			jogadorDAO.inserir(jEdCarlos);
			
			juizDAO.inserir(juizArmando);
			juizDAO.inserir(juizPauloCesar);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 

		/* Para cadastrar os jogos, � preciso ter os objetos associados - Time e Juiz - com seus IDs, para isso temos 2 op��es:
		  1) A persistencia do Jogo ser na mesma transa��o da persistencia dos seus associados 
		  2) Ter os identificadores preenchidos, representando que estes objetos j� foram persistidos (isso pode ser feito por uma 
		     consulta ao banco - em.find -, ou setando o id no pr�prio objeto setId()
		
		*/
		saoPaulo = timeDAO.consultarPorId(1);
		cruzeiro = timeDAO.consultarPorId(2);
		flamengo = timeDAO.consultarPorId(3);
		
		juizArmando = juizDAO.consultarPorId(8);
		juizPauloCesar = juizDAO.consultarPorId(9);

		
		Jogo jogo1 = new Jogo(saoPaulo, cruzeiro, "Morumbi", juizPauloCesar, Datas.criarData(13, 2,2015), 2, 1);
		Jogo jogo2 = new Jogo(cruzeiro, saoPaulo, "Engenh�o", juizArmando, Datas.criarData(10,4,2015));
		Jogo jogo3 = new Jogo(flamengo, cruzeiro, "Arruda", juizPauloCesar, Datas.criarData(14, 3,2015), 1, 1);
		Jogo jogo4 = new Jogo(saoPaulo, flamengo, "Arena Fonte Nova", juizArmando, Datas.criarData(19,4,2015));


		try {
			em = emf.createEntityManager();
			jogoDAO = new JogoDAO(em);
			
			jogoDAO.inserir(jogo1);
			jogoDAO.inserir(jogo2);
			jogoDAO.inserir(jogo3);
			jogoDAO.inserir(jogo4);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (em != null){
			em.close();
		} 
		if (emf != null){
			emf.close();
		}

	}

}
