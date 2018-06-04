package controladores;

import java.util.ArrayList;

public class Movimentacao {
	private double saldo;
	private double movimentacao;
	private String natureza;
	private String operacao;
	private int conta;
	private static ArrayList<Movimentacao> m = new ArrayList<>();
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getMovimentacao() {
		return movimentacao;
	}
	public void setMovimentacao(double movimentacao) {
		this.movimentacao = movimentacao;
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public static ArrayList<Movimentacao> getM() {
		return m;
	}
	public static void setM(ArrayList<Movimentacao> m) {
		Movimentacao.m = m;
	}
	
	
}
