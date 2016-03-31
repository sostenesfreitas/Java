package futebol;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ClassificacaoPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Campeonato campeonato;
	@ManyToOne
	private Time time;
	
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
}
