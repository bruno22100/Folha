package projeto;
import java.util.Scanner;

public class Sistema {
	public Empregado adicionar()
	{
		String nome, endereco, tipo;
		Scanner input = new Scanner(System.in);
		System.out.print("Insina o nome do Empregado:\n");
		nome = input.nextLine();
		System.out.print("Insina o endereco do Empregado\n");
		endereco = input.nextLine();
		System.out.print("Insina o tipo do Empregado\n");
		tipo = input.nextLine();
		
		Empregado empregado = new Empregado(nome, endereco, tipo);
		return empregado;
	}

}
