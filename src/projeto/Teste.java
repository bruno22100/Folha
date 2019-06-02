package projeto;

public class Teste {
	public static void main(String[] args) {
		System.out.print("OI\n");
		Empregado empregado1 = new Empregado("Bruno","Pilar","hourly");
		Empregado empregado2 = new Empregado("Rafael","Maceio","salaried");
		Empregado empregado3 = new Empregado("Severo","Satuba","commissioned");
		System.out.printf("%s\n", empregado1.getNome());
		System.out.printf("%s\n", empregado2.getNome());
		System.out.printf("%s\n", empregado3.getNome());
	}

}
