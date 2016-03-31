package testes;

import java.util.List;

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
import dados.generico.DAOGenerico;
import futebol.Jogador;
import futebol.Jogo;
import futebol.Tecnico;
import futebol.Time;
import futebol.UF;
import futebol.relatorio.TimeMediaSalarial;

public class TesteJPQL {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		ITecnicoDAO tecnicoDAO = null;
		IJogadorDAO jogadorDAO = null;
		ITimeDAO timeDAO = null;
		IJogoDAO jogoDAO = null;
		IJuizDAO dao = null;

		try {
			emf = Persistence.createEntityManagerFactory("unitPSC");
			em = emf.createEntityManager();

			tecnicoDAO = new TecnicoDAO(em);
			jogadorDAO = new JogadorDAO(em);
			timeDAO = new TimeDAO(em);
			jogoDAO = new JogoDAO(em);
			
			
			
			//dao = new JuizDAO(em);
			//Juiz func = dao.consultarPorId(1); 
			//System.out.println(func);

//			List<Tecnico> tecs = tecnicoDAO.pesquisarPorNome("a");
//			for (Tecnico tec : tecs) {
//				System.out.println(tec);
//			}
//
//			List<Jogador> jogs = jogadorDAO.pesquisarPorNome("e");
//			for (Jogador jog : jogs) {
//				System.out.println(jog);
//			}
//
			Time time1 = timeDAO.consultarPorId(2);
			time1.setNome("Sport");
			timeDAO.alterar(time1);
//			Jogador jog = jogadorDAO.pesquisarJogadorPeloNumeroCamisaTime(2,
//					time1);
//			System.out.println(jog);
//
//			jogs = jogadorDAO.pesquisarJogadoresTitulares(time1);
//			for (Jogador jg : jogs) {
//				System.out.println(jg);
//			}
//
//			Integer qtd1 = jogadorDAO.obterQuantidadeJogadores(UF.SP, "S");
//			System.out.println("Qtd de jogador: " + qtd1);
//
//			List<Jogo> jogos = jogoDAO.pesquisarJogosPorTimePeriodo(time1,
//					Datas.criarData(1, 4, 2015), Datas.criarData(30, 4, 2015));
//			for (Jogo j : jogos) {
//				System.out.println(j);
//			}
//
//			jogos = jogoDAO.pesquisarJogosNaoRealizados();
//			for (Jogo j : jogos) {
//				System.out.println(j);
//			}
//
//			List<Object[]> objs = jogoDAO.listarQuantidadeJogosPorEstadio();
//			for(Object[] o : objs){
//				System.out.println(o[0] + " - " + o[1]);
//			}
//			
//			List<TimeMediaSalarial> mediaSal = jogadorDAO.listarMediaSalarialTimes();
//			for(TimeMediaSalarial tms : mediaSal) {
//				System.out.println(tms);
//			}
//			
//			List<Time> times = timeDAO.pesquisarTimesComTecnicosRepetidos();
//			for(Time t : times){
//				System.out.println(t);
//			}
			
//			objs = timeDAO.listarDadosTimes();
//			for(Object[] linha : objs){
//				for (Object i : linha){
//					System.out.print(i + " | ");
//				}
//				System.out.println();
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			emf.close();
		}
	}
}
