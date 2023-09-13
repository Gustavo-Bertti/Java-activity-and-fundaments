package revisao;

import java.util.Date;

public class Professor extends Pessoa {

	//atributos
	private double salario;
	private String funcional;
	private String disciplina;
	public Professor(String nome, String cpf, String rg, Date dataNascimento, double salario, String funcional,String disciplina) {
		super(nome, cpf, rg, dataNascimento);
		this.salario = salario;
		this.funcional = funcional;
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", CPF: " + getCpf() + ", RG: " + getRg() + ", Data de nascimento: " + getDataNascimento()+ ", salario: " + salario + ", funcional: " + funcional + ", disciplina: " + disciplina;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getFuncional() {
		return funcional;
	}
	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
