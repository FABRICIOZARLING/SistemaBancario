package controladores;

import java.util.ArrayList;

public class Limites {
	private int conta;
	private double limite;
	private static ArrayList<Limites> l = new ArrayList<>();
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}

	public static ArrayList<Limites> getL() {
		return l;
	}
	public static void setL(ArrayList<Limites> l) {
		Limites.l = l;
	}
	
}
