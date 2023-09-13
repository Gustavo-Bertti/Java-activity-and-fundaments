package revisao;

import java.util.Date;

public class Pessoa {
	
	//Atributos
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	
	//Construtor
	public Pessoa(String nome, String cpf, String rg, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + ", CPF: " + getCpf() + ", RG: " + getRg() + ", Data de nascimento: " + getDataNascimento();
	}
	
}
