package Exemplo2;

public abstract class ContaImpl {

	//ATRIBUTOS
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void imprimirExtrato();
}
