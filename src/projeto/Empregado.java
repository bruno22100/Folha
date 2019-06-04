package projeto;
import java.util.Date;

public class Empregado
{
	int id;
	String nome;
	String endereco;
	int tipo; // 0: Assalariado, 1: Comissionado, 2: Horistas
	double salario;
	double comissao;
	int metodo_de_pagamento; // 0: Cheque pelos correios, 1: Cheque em mãos, 2: Depósito
	boolean sindicato;
	double taxaSindicato;
	Date proximoPagamento;
	int agendaPagamentoID; // As agendas default são 0: semanal, 1: bi-semanal, 2: mensal
	String sindicatoID;
	boolean ativo;
	
	Ponto[] ponto = new Ponto[365];
	int pontoIndex = 0;
	int pontoUltimoPagamento = 0;

}

