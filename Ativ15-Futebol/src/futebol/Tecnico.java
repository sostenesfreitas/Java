package futebol;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Tecnico.findByNome", query="Select t from Tecnico t where t.nome like :nome")
public class Tecnico extends Pessoa {

	public Tecnico(){
		
	}
	public Tecnico(String nome, Date dataNascimento, Double salario) {
		super(nome, dataNascimento, salario);
	}
	@Override
	public String toString() {
		return "Tecnico [" + super.toString() + "]";
	}

}