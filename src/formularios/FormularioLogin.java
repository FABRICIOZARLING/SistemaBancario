package formularios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Funcoes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FormularioLogin extends JFrame {

	private JPanel contentPane;
	private JTextField tFusuario;
	private JPasswordField pFsenha;

	/**
	 * Create the frame.
	 */
	public FormularioLogin() {
		Funcoes f = new Funcoes();
		setTitle("Sistema Banc\u00E1rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		setLocationRelativeTo(null);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setBounds(102, 53, 70, 30);
		contentPane.add(lblUsuario);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setBounds(102, 94, 70, 30);
		contentPane.add(lblNewLabel);
		JButton btnEntra = new JButton("Entrar");
		btnEntra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				f.confereLogin(tFusuario.getText(), pFsenha.getPassword());
				
				
			}
		});
		
		btnEntra.setBounds(149, 148, 140, 30);
		
		
		contentPane.add(btnEntra);
		
		tFusuario = new JTextField();
		tFusuario.setBounds(182, 58, 135, 20);
		contentPane.add(tFusuario);
		tFusuario.setColumns(10);
		
		pFsenha = new JPasswordField();
		pFsenha.setBounds(182, 99, 135, 20);
		contentPane.add(pFsenha);
	}
}
