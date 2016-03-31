package futebol;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Type;

@Entity
@NamedQueries({
	@NamedQuery(name = "Jogador.findByNome", query = "Select j from Jogador j where j.nome like :nome"),
	@NamedQuery(name = "Jogador.findByNumeroCamisaTime", query = "Select j from Jogador j where j.numeroCamisa = :numCam and j.time = :time"),
	@NamedQuery(name = "Jogador.findByTitularCartaoAmarelo", query = 
	"Select j from Jogador j where j.titular = :titular and j.time = :time and j.quantidadeCartoesAmarelos > 1"),
	@NamedQuery(name = "Jogador.countByUF", query = 
			"Select count(j) from Jogador j where j.time.estado = :uf and j.time.nome like :nomeTime"),
	@NamedQuery(name = "Jogador.listMediaSalarial", query = 
					"Select new futebol.relatorio.TimeMediaSalarial(j.time.nome, avg(j.salario)) from Jogador j where j.titular = true and j.time.numeroPontos > 10 group by j.time.nome"),
			
})
public class Jogador extends Pessoa {

	private int numeroCamisa;
	@Type(type = "yes_no")
	private boolean titular;
	private Integer quantidadeCartoesAmarelos;
	private Integer quantidadeCartoesVermelhos;
	@ManyToOne
	private Time time;

	public Jogador() {
		super();
	}

	public Jogador(String nome, Date dataNascimento, Double salario,
			int numeroCamisa, boolean titular,
			Integer quantidadeCartoesAmarelos,
			Integer quantidadeCartoesVermelhos, Time time) {
		super(nome, dataNascimento, salario);
		this.numeroCamisa = numeroCamisa;
		this.titular = titular;
		this.quantidadeCartoesAmarelos = quantidadeCartoesAmarelos;
		this.quantidadeCartoesVermelhos = quantidadeCartoesVermelhos;
		this.time = time;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	public Integer getQuantidadeCartoesAmarelos() {
		return quantidadeCartoesAmarelos;
	}

	public void setQuantidadeCartoesAmarelos(Integer quantidadeCartoesAmarelos) {
		this.quantidadeCartoesAmarelos = quantidadeCartoesAmarelos;
	}

	public Integer getQuantidadeCartoesVermelhos() {
		return quantidadeCartoesVermelhos;
	}

	public void setQuantidadeCartoesVermelhos(Integer quantidadeCartoesVermelhos) {
		this.quantidadeCartoesVermelhos = quantidadeCartoesVermelhos;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Jogador [" + super.toString() + ", numeroCamisa="
				+ numeroCamisa + ", titular=" + titular
				+ ", quantidadeCartoesAmarelos=" + quantidadeCartoesAmarelos
				+ ", quantidadeCartoesVermelhos=" + quantidadeCartoesVermelhos
				+ ", time=" + time + "]";
	}

}
