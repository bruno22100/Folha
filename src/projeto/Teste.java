package projeto;

public class Teste {
	public static void main(String[] args) {
		System.out.print("OI\n");
		Sistema sistema = new Sistema();
		Empregado  empregado = sistema.adicionar();
		System.out.printf("%s\n", empregado.getSalarioM());
	
	
	}
}
