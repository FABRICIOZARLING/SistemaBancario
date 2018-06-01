package controladores;

import java.util.ArrayList;

public class Usuario {
	private String usuario;
	private char[] senha;
	private boolean adm;
	private static ArrayList<Usuario> u = new ArrayList<>();
	public boolean isAdm() {
		return adm;
	}
	public void setAdm(boolean adm) {
		this.adm = adm;
	}
	public ArrayList<Usuario> getU() {
		return u;
	}
	public void setU(ArrayList<Usuario> u) {
		this.u = u;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public char[] getSenha() {
		return senha;
	}
	public void setSenha(char[] senha) {
		this.senha = senha;
	}

}
