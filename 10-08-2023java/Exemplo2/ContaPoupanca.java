package Exemplo2;

import java.util.Date;

public class ContaPoupanca extends ContaImpl implements Conta {

	private double saldo;

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public double getSaldo() {
		
		return this.saldo;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato da conta poupança ***");
		System.out.println("=========================");
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + new Date());
		
	}

}
