package Exemplo2;

import java.util.Date;

public class ContaCorrente extends ContaImpl implements Conta  {

	private double saldo;
	private double taxaOperacional = 0.5;
	@Override
	public void depositar(double valor) {
		this.saldo += valor - (valor * taxaOperacional);
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo-=valor- (valor * taxaOperacional);
		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato da conta corrente ***");
		System.out.println("=========================");
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + new Date());
		
	}

}
