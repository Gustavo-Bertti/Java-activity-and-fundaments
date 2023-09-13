package Exemplo2;

public class TesteContas {
	
	public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente();
	cc.depositar(3000);
	System.out.println(cc.getSaldo());
	
	ContaPoupanca cp = new ContaPoupanca();
	cp.depositar(800);
	System.out.println("Saldo: "+ cp.getSaldo());
	cp.sacar(200);
	System.out.println("Saldo: "+ cp.getSaldo());
	
	GeradorExtratos gerador = new GeradorExtratos();
	gerador.geradorConta(cc);
	gerador.geradorConta(cp);
	cc.imprimirExtrato();
	System.out.println("");
	cp.imprimirExtrato();
	}
}
