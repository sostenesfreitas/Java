package futebol;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({
	@NamedQuery(name="Jogo.findByTimeData", query="Select jg from Jogo jg where (jg.timeCasa = :time or jg.timeVisitante = :time) and jg.dataJogo between :dataInicio and :dataFim"),
	@NamedQuery(name="Jogo.findByRealizacao", query="Select jg from Jogo jg where (jg.placarTimeCasa is null or jg.placarTimeVisitante is null) and jg.juiz.dataNascimento is null order by jg.dataJogo"),
	@NamedQuery(name="Jogo.listQtdJogos", query="Select jg.estadio, count(distinct jg) from Jogo jg where size(jg.timeCasa.jogadores) > 1 group by jg.estadio"),
})
public class Jogo extends ObjetoGeral {

	@ManyToOne
	private Time timeCasa;
	@ManyToOne
	private Time timeVisitante;
	@Column(length = 70)
	private String estadio;
	@ManyToOne
	private Juiz juiz;
	private Integer placarTimeCasa;
	private Integer placarTimeVisitante;
	@Temporal(TemporalType.DATE)
	private Date dataJogo;

	public Jogo() {
		super();
	}

	public Jogo(Time timeCasa, Time timeVisitante, String estadio, Juiz juiz,
			Date dataJogo) {
		super();
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
		this.estadio = estadio;
		this.juiz = juiz;
		this.dataJogo = dataJogo;
	}

	public Jogo(Time timeCasa, Time timeVisitante, String estadio, Juiz juiz,
			Date dataJogo, Integer placarTimeCasa, Integer placarTimeVisitante) {
		super();
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
		this.estadio = estadio;
		this.juiz = juiz;
		this.placarTimeCasa = placarTimeCasa;
		this.placarTimeVisitante = placarTimeVisitante;
		this.dataJogo = dataJogo;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public Integer getPlacarTimeCasa() {
		return placarTimeCasa;
	}

	public void setPlacarTimeCasa(Integer placarTimeCasa) {
		this.placarTimeCasa = placarTimeCasa;
	}

	public Integer getPlacarTimeVisitante() {
		return placarTimeVisitante;
	}

	public void setPlacarTimeVisitante(Integer placarTimeVisitante) {
		this.placarTimeVisitante = placarTimeVisitante;
	}

	public Date getDataJogo() {
		return dataJogo;
	}

	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}

	@Override
	public String toString() {
		return "Jogo [timeCasa=" + timeCasa + ", timeVisitante="
				+ timeVisitante + ", nomeCampo=" + estadio + ", juiz=" + juiz
				+ ", placarTimeCasa=" + placarTimeCasa
				+ ", placarTimeVisitante=" + placarTimeVisitante
				+ ", dataJogo=" + dataJogo + "]";
	}
}
