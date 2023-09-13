package java16082023;

public class TesteString {

	public void caixaAlta() {
		String frase = null;
		String novaFrase = null;
		
		novaFrase = frase.toUpperCase();
		System.out.println("Frase Original: "+frase);
		System.out.println("Frase em caixa alta: "+novaFrase);
	}
	public static void main(String[] args) {
		TesteString ts = new TesteString();
		try {
			ts.caixaAlta();
		}catch(NullPointerException e) {
			System.out.println("Ocorreu um erro ao executar o método");
			System.out.println(e.getMessage());
		}
	}
}
