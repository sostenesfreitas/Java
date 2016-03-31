package futebol;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Classificacao {

	@EmbeddedId
	private ClassificacaoPK id;
	
	private int posicao;

	public ClassificacaoPK getId() {
		return id;
	}

	public void setId(ClassificacaoPK id) {
		this.id = id;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	
}
