package revisao;

import java.util.Date;

public class Aluno extends Pessoa{
	
	//Atributos
	private String matricula;
	private double mensalidade;
	private String curso;
	public Aluno(String nome, String cpf, String rg, Date dataNascimento, String matricula, double mensalidade,String curso) {
		super(nome, cpf, rg, dataNascimento);
		this.matricula = matricula;
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", CPF: "+ getCpf() + ", RG: " + getRg() + ", Data de nascimento: " + getDataNascimento() +", matricula: " + matricula + ", mensalidade: " + mensalidade + ", curso: " + curso;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
