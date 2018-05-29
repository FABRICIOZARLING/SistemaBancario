package controladores;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

import formularios.FormularioAdministrador;
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
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								FormularioAdministrador frame = new FormularioAdministrador();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}else {
					//alerta("Senha: "+password);
					FormularioLogin fl = new FormularioLogin();
					fl.setVisible(true);
				}
			}else if(x==us.size()-1) {
				System.out.println("TRAVOU AQUI");
				alerta("Usuário: "+user);
			}
		}
		
	}
	
	private void criaAdm() {
		Usuario u = new Usuario();
		u.setUsuario("administrador");
		char[] senha = {'s','e','n','h','a'};
		u.setSenha(senha);
		ArrayList<Usuario> us = u.getU();
		us.add(u);
		u.setU(us);
	}
	private void alerta(String texto) {
		JOptionPane.showMessageDialog(null, "Dado digitado incorreto "+texto);
		
	}
}


