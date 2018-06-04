package controladores;

import java.util.ArrayList;

public class Taxas {
	private double taxa_pessoal;
	private double taxa_automovel;
	private double taxa_imovel;
	public double getTaxa_pessoal() {
		return taxa_pessoal;
	}
	public void setTaxa_pessoal(double taxa_pessoal) {
		this.taxa_pessoal = taxa_pessoal;
	}
	public double getTaxa_automovel() {
		return taxa_automovel;
	}
	public void setTaxa_automovel(double taxa_automovel) {
		this.taxa_automovel = taxa_automovel;
	}
	public double getTaxa_imovel() {
		return taxa_imovel;
	}
	public void setTaxa_imovel(double taxa_imovel) {
		this.taxa_imovel = taxa_imovel;
	}
	public static ArrayList<Taxas> getT() {
		return t;
	}
	public static void setT(ArrayList<Taxas> t) {
		Taxas.t = t;
	}
	private static ArrayList<Taxas> t = new ArrayList<>();

}
