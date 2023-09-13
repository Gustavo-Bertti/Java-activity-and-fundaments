package java16082023;

public class Exemplo3 {

	public static void main(String[] args) {
		try {
			int[] numeros = {1, 2, 3, 4, 5};
			for(int i = 0; i < numeros.length; i++) {
				System.out.println("Numero: "+numeros[i]);
			}
		}catch(Exception e) {
			System.out.println("Algo deu errado!");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Os comandos try-catch foram finalizados!");
		}
	}
}
