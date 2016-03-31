package futebol;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name="Pessoa.findByNome", query="Select p from Pessoa p where p.nome like :nome")
public class Pessoa extends ObjetoGeral {

	@Column(length = 80)
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private Double salario;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, Date dataNascimento, Double salario) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", salario=" + salario + ", getCodigo()=" + getCodigo() + "]";
	}

}
