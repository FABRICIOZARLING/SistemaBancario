package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controladores.Funcoes;

import javax.swing.JLabel;
import java.awt.Font;

public class FormularioExtrato extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public FormularioExtrato( int conta) {
		//setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setSize( 600, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		Funcoes f = new Funcoes();
		
	
		JTable tabela = new JTable(f.geraExtrato(conta));
		
		// JScrollPane - Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(0, 0, 592, 284);
		contentPane.add(barraRolagem);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSaldo.setBounds(24, 295, 142, 31);
		contentPane.add(lblSaldo);
		
		JLabel lblNewLabel = new JLabel("R$");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(333, 303, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblValorSaldo = new JLabel();
		lblValorSaldo.setText((String)tabela.getValueAt(0, 3));
		lblValorSaldo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValorSaldo.setBounds(418, 303, 149, 14);
		contentPane.add(lblValorSaldo);
		
		
	}

}
