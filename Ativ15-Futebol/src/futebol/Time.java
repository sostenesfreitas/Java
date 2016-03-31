package futebol;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
@NamedQueries({
		@NamedQuery(name = "Time.findByTecnicoRepetido", query = "Select t from Time t where exists (select t2 from Time t2 where t2.tecnico = t.tecnico and t <> t2)"),
		@NamedQuery(name = "Time.findByTecnicoRepetido2", query = "Select t from Time t where t.tecnico in (select t2.tecnico from Time t2 group by t2.tecnico having count(t2.tecnico) > 1)"),
		@NamedQuery(name = "Time.listDados", query = "Select t.nome, t.tecnico.nome, size(t.jogadores),"
				+ " (select max(j.dataJogo) from Jogo j where j.timeCasa = t), t.numeroPontos from Time t order by t.numeroPontos"),
		@NamedQuery(name = "Time.listDados2", query = "Select t.nome, t.tecnico.nome, (select count(j) from Jogador j where j.time = t),"
				+ " (select max(j.dataJogo) from Jogo j where j.timeCasa = t), t.numeroPontos from Time t order by t.numeroPontos") })
public class Time extends ObjetoGeral {

	@Column(length = 50, nullable = false)
	private String nome;
	@Enumerated(EnumType.STRING)
	@Column(length = 2, nullable = false)
	private UF estado;
	@OneToOne(cascade = CascadeType.REMOVE)
	@Cascade({org.hibernate.annotations.CascadeType.DELETE})
	private Tecnico tecnico;
	private Integer numeroPontos;
	@OneToMany(mappedBy = "time", cascade = CascadeType.REMOVE)
	private List<Jogador> jogadores;

	public Time() {

	}

	public Time(String nome, UF estado, Tecnico tecnico, Integer numeroPontos) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.tecnico = tecnico;
		this.numeroPontos = numeroPontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UF getEstado() {
		return estado;
	}

	public void setEstado(UF estado) {
		this.estado = estado;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Integer getNumeroPontos() {
		return numeroPontos;
	}

	public void setNumeroPontos(Integer numeroPontos) {
		this.numeroPontos = numeroPontos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", getCodigo()=" + getCodigo() + "]";
	}

}
