package futebol;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Juiz extends Pessoa {

	public Juiz() {
		super();
	}

	public Juiz(String nome, Date dataNascimento, Double salario) {
		super(nome, dataNascimento, salario);
	}


}
