package java09_08_2023;

public class TesteOperacoesMatematicas {
	public void realizaOperacao(OperacoesMatematicas op, double x, double y) {
		System.out.println(op.calcular(x, y));
	}
	public static void main(String[] args) {
	 TesteOperacoesMatematicas teste = new TesteOperacoesMatematicas();
	 teste.realizaOperacao(new Soma(), 10, 10);
	 teste.realizaOperacao(new Multiplica(), 5, 10);
	 teste.realizaOperacao(new OperacoesMatematicas(), 110, 110);
	}
}
