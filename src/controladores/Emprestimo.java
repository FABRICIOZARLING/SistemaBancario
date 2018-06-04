package controladores;

import java.util.ArrayList;

public class Emprestimo {
	private int conta;
	private double taxa;
	private double valor;
	private double parcela;
	private int prazo;
	private static ArrayList<Emprestimo> e = new ArrayList<>();
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getParcela() {
		return parcela;
	}
	public void setParcela(double parcela) {
		this.parcela = parcela;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public static ArrayList<Emprestimo> getE() {
		return e;
	}
	public static void setE(ArrayList<Emprestimo> e) {
		Emprestimo.e = e;
	}
	


}
