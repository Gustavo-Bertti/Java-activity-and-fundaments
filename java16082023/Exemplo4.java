package java16082023;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo4 {

	public static double calculaQuociente(double numerador, double denominador) {
		return numerador / denominador;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				System.out.println("Numerador: ");
				double numerador = input.nextDouble();
				
				System.out.println("Denominador: ");
				double denominador = input.nextDouble();
				
				double resultado = calculaQuociente(numerador, denominador);
				System.out.println("Resultado: "+resultado);
				
				continua = false;
			}catch(InputMismatchException e) {
				System.out.println("Informe apenas números");
				continua = true;
			}catch (ArithmeticException e) {
				System.out.println("Divisão por zero!");
			}finally {
				System.out.println("Tchau, obrigado!");
			}
			
		}while(continua);
	}
}
