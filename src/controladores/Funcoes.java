package controladores;

import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

import formularios.FormularioPrincipal;
import formularios.FormularioLogin;

public class Funcoes {
	public void confereLogin(String user, char[] password) {
		Usuario u = new Usuario();
		if(u.getU().size()==0) {
			criaAdm();
		}
		ArrayList<Usuario> us = u.getU();
		for(int x = 0; x<us.size();x++) {
			if(user.equals(us.get(x).getUsuario())) {
				if(Arrays.equals(password, us.get(x).getSenha())) {
					x=us.size();
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
						
				}else {
					String senha="";
					for (char c : password) {
						senha+=c;
					}
					alerta("Senha: "+senha);
					FormularioLogin fl = new FormularioLogin();
					fl.setVisible(true);
				}
			}else if(x==us.size()-1) {
				alerta("Usuário: "+user);
				FormularioLogin fl = new FormularioLogin();
				fl.setVisible(true);
			}
		}
		
	}
	
	private void criaAdm() {
		Usuario u = new Usuario();
		u.setUsuario("administrador");
		char[] senha = {'s','e','n','h','a'};
		u.setSenha(senha);
		u.setAdm(true);
		ArrayList<Usuario> us = u.getU();
		us.add(u);
		u.setU(us);
	}
	private void alerta(String texto) {
		JOptionPane.showMessageDialog(null, "Dado digitado incorreto "+texto);
		
	}
	public void trocaPainel(Component[] c, boolean acao, JPanel j) {
		j.setVisible(acao);	
		for (Component component : c) {
			component.setVisible(acao);
		}
		
	}
}


