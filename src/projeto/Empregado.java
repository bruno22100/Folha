package projeto;
import java.util.Scanner;
import java.util.Random;

public class Empregado
{
	private int id;
	private String nome;
	private String endereco;
	private String tipo;
	private double salario_horista;
	private double salario_mensal;
	private double comissao;

	public Empregado(String nome, String endereco, String tipo)
	{
		Random gerador = new Random();
        this.id = gerador.nextInt(100);
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;

		Scanner input = new Scanner(System.in);
		double aux;
		if(tipo ==  "hourly") {
			System.out.print("Entre com o valor da hora trabalhada:\n");
			aux = input.nextDouble();
			this.salario_horista = aux;
			this.salario_mensal = 0.0;
			this.comissao = 0.0;
		}
		if(tipo == "salaried") {
			System.out.print("Entre com o valor do Salário\n");
			aux = input.nextDouble();
			this.salario_horista = 0.0;
			this.salario_mensal = aux;
			this.comissao = 0.0;
		}
		if(tipo == "commissioned") {
			System.out.print("Entre com o valor do Salário\n");
			aux = input.nextDouble();
			this.salario_horista = 0.0;
			this.salario_mensal = aux;
			System.out.print("Entre com o valor da Comissão\n");
			aux = input.nextDouble();
			this.comissao = aux;
		}
	}
	
	public void setId(int num)
	{
		this.id = num;
	}
	
	public int getId()
	{
		return this.id;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getEndereco()
	{
		return this.endereco;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getTipo()
	{
		return this.tipo;
	}
	
	public void setSalarioH(double salario)
	{
		this.salario_horista = salario;
	}
	
	public double getSalarioH()
	{
		return this.salario_horista;
	}
	
	public void setSalarioM(double salario)
	{
		this.salario_mensal = salario;
	}
	
	public double getSalarioM()
	{
		return this.salario_mensal;
	}
	
	public void setSalarioC(double salario, double comissao)
	{
		this.salario_mensal = salario;
		this.comissao = comissao;
	}
	
	public double getSalarioC()
	{
		return this.comissao ;
	}
}

