package revisao;

import java.util.Date;

public class testPessoa {
public static void main(String[] args) {
	
	Pessoa p = new Pessoa("Pessoa 1", "123.123.123-12", "1.123.231-1", new Date());
	System.out.println("Pessoa: "+ p.toString());
	
	Aluno a1 = new Aluno("Aluno 1", "234.454.656-23", "3.565.432.-3", new Date(), "ra123", 500, "ADS");
	System.out.println("Aluno: "+a1.toString());
	
	Professor pr1 = new Professor("Professor 1", "789.876.987-21", "6.765.765.6", new Date(), 5000, "pr123", "Java");
	System.out.println("Professor: "+ pr1.toString());
}
}
