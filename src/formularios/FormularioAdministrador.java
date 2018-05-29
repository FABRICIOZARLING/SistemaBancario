package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioAdministrador extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FormularioAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Conta Corrente");
		
		button.setBounds(0, 0, 222, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Movimenta\u00E7\u00F5es");
		button_1.setBounds(222, 0, 222, 22);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Empr\u00E9stimos");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setBounds(444, 0, 222, 22);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Usu\u00E1rios");
		button_3.setBounds(666, 0, 222, 22);
		contentPane.add(button_3);
		
		JPanel panel_conta = new JPanel();
		panel_conta.setBounds(0, 22, 888, 540);
		contentPane.add(panel_conta);
	}
}
