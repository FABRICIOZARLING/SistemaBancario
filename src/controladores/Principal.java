package controladores;

import java.awt.EventQueue;

import formularios.FormularioPrincipal;
import formularios.FormularioLogin;

public class Principal {

	public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioLogin frame = new FormularioLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
		FormularioPrincipal frame = new FormularioPrincipal();
		frame.setVisible(true);

	}

}
