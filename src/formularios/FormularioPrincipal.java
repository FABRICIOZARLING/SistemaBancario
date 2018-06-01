package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Funcoes;

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
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField tfBusca;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfNasc;
	private JTextField tfRua;
	private JTextField tfNum;
	private JTextField tfBairro;
	private JTextField tfCidade;
	private JTextField tfCep;
	private JTextField tfEstado;
	private JTextField textField;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfRenda;
	private JTextField tfCelular;
	private JTextField tfBuscarM;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		Funcoes f = new Funcoes();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Painel conta corrente
		/*JPanel panel_conta = new JPanel();
		panel_conta.setBounds(0, 22, 888, 540);
		contentPane.add(panel_conta);
		panel_conta.setLayout(null);
		
		JButton btnBuscarConta = new JButton("Buscar");
		btnBuscarConta.setBounds(635, 10, 224, 23);
		panel_conta.add(btnBuscarConta);
		
		JComboBox comboBusca = new JComboBox();
		comboBusca.setModel(new DefaultComboBoxModel(new String[] {"Cadastrar Conta Nova", "Buscar por CPF ", "N\u00FAmero da conta"}));
		comboBusca.setBounds(10, 10, 240, 20);
		panel_conta.add(comboBusca);
		
		tfBusca = new JTextField();
		tfBusca.setBounds(260, 10, 365, 21);
		panel_conta.add(tfBusca);
		tfBusca.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 77, 240, 14);
		panel_conta.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(10, 103, 240, 14);
		panel_conta.add(lblCpf);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento");
		lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataNasc.setBounds(10, 128, 240, 14);
		panel_conta.add(lblDataNasc);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereco.setBounds(10, 177, 240, 14);
		panel_conta.add(lblEndereco);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRua.setBounds(10, 202, 240, 14);
		panel_conta.add(lblRua);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmero.setBounds(10, 231, 240, 14);
		panel_conta.add(lblNmero);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBairro.setBounds(10, 262, 240, 14);
		panel_conta.add(lblBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCidade.setBounds(10, 298, 240, 14);
		panel_conta.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstado.setBounds(10, 332, 240, 14);
		panel_conta.add(lblEstado);
		
		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPas.setBounds(514, 334, 111, 14);
		panel_conta.add(lblPas);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCep.setBounds(514, 298, 111, 14);
		panel_conta.add(lblCep);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNome.setBounds(260, 74, 600, 20);
		panel_conta.add(tfNome);
		tfNome.setColumns(10);
		
		tfCpf = new JTextField();
		tfCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCpf.setBounds(260, 100, 600, 20);
		panel_conta.add(tfCpf);
		tfCpf.setColumns(10);
		
		tfNasc = new JTextField();
		tfNasc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNasc.setBounds(260, 125, 600, 20);
		panel_conta.add(tfNasc);
		tfNasc.setColumns(10);
		
		tfRua = new JTextField();
		tfRua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfRua.setBounds(260, 199, 600, 20);
		panel_conta.add(tfRua);
		tfRua.setColumns(10);
		
		tfNum = new JTextField();
		tfNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNum.setBounds(260, 228, 600, 20);
		panel_conta.add(tfNum);
		tfNum.setColumns(10);
		
		tfBairro = new JTextField();
		tfBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfBairro.setBounds(260, 259, 600, 20);
		panel_conta.add(tfBairro);
		tfBairro.setColumns(10);
		
		tfCidade = new JTextField();
		tfCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCidade.setBounds(260, 295, 244, 20);
		panel_conta.add(tfCidade);
		tfCidade.setColumns(10);
		
		tfCep = new JTextField();
		tfCep.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCep.setBounds(635, 295, 224, 20);
		panel_conta.add(tfCep);
		tfCep.setColumns(10);
		
		tfEstado = new JTextField();
		tfEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfEstado.setBounds(260, 329, 244, 20);
		panel_conta.add(tfEstado);
		tfEstado.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(635, 329, 224, 20);
		panel_conta.add(textField);
		textField.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefone.setBounds(10, 400, 240, 14);
		panel_conta.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(10, 432, 240, 14);
		panel_conta.add(lblEmail);
		
		JLabel lblRenda = new JLabel("Renda");
		lblRenda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRenda.setBounds(10, 484, 240, 14);
		panel_conta.add(lblRenda);
		
		tfTelefone = new JTextField();
		tfTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTelefone.setBounds(260, 397, 244, 20);
		panel_conta.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfEmail.setBounds(260, 429, 599, 20);
		panel_conta.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfRenda = new JTextField();
		tfRenda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfRenda.setBounds(260, 481, 244, 20);
		panel_conta.add(tfRenda);
		tfRenda.setColumns(10);
		
		tfCelular = new JTextField();
		tfCelular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCelular.setBounds(635, 397, 224, 20);
		panel_conta.add(tfCelular);
		tfCelular.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCelular.setBounds(514, 400, 111, 14);
		panel_conta.add(lblCelular);
		
		JLabel lblNumeroConta = new JLabel("N\u00FAmero Conta");
		lblNumeroConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroConta.setBounds(10, 41, 161, 14);
		panel_conta.add(lblNumeroConta);
		
		JLabel lblNconta = new JLabel("");
		lblNconta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNconta.setBounds(270, 42, 190, 14);
		panel_conta.add(lblNconta);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(635, 39, 111, 23);
		panel_conta.add(btnAlterar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(756, 39, 103, 23);
		panel_conta.add(btnSalvar);*/
		
		//Painel Movimentação
		JPanel panel_movimento = new JPanel();
		panel_movimento.setBounds(0, 22, 888, 540);
		contentPane.add(panel_movimento);
		panel_movimento.setLayout(null);
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.setBounds(24, 116, 280, 23);
		panel_movimento.add(btnDepositar);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.setBounds(304, 116, 276, 23);
		panel_movimento.add(btnTransferir);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.setBounds(580, 116, 280, 23);
		panel_movimento.add(btnSacar);
		
		JComboBox comboBuscarM = new JComboBox();
		comboBuscarM.setBounds(94, 21, 210, 20);
		panel_movimento.add(comboBuscarM);
		comboBuscarM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBuscarM.setModel(new DefaultComboBoxModel(new String[] {"Numero da conta", "Buscar por CPF"}));
		
		tfBuscarM = new JTextField();
		tfBuscarM.setBounds(335, 21, 210, 20);
		panel_movimento.add(tfBuscarM);
		tfBuscarM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfBuscarM.setColumns(10);
		
		JButton btnBuscarM = new JButton("Buscar");
		btnBuscarM.setBounds(580, 20, 210, 23);
		panel_movimento.add(btnBuscarM);
		btnBuscarM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContanumM = new JLabel("Cont N\u00BA");
		lblContanumM.setBounds(94, 66, 120, 14);
		panel_movimento.add(lblContanumM);
		lblContanumM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContaM = new JLabel("00");
		lblContaM.setBounds(249, 66, 55, 14);
		panel_movimento.add(lblContaM);
		lblContaM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNomeM = new JLabel("Nome");
		lblNomeM.setBounds(336, 66, 440, 14);
		panel_movimento.add(lblNomeM);
		lblNomeM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblValorDepositado = new JLabel("Valor");
		lblValorDepositado.setBounds(94, 216, 210, 14);
		panel_movimento.add(lblValorDepositado);
		lblValorDepositado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setBounds(335, 213, 210, 20);
		panel_movimento.add(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		
		JLabel lblConfirmacaoM = new JLabel("New label");
		lblConfirmacaoM.setBounds(110, 502, 680, 14);
		panel_movimento.add(lblConfirmacaoM);
		lblConfirmacaoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_m_deposito = new JPanel();
		panel_m_deposito.setBounds(24, 251, 836, 240);
		panel_movimento.add(panel_m_deposito);
		
		JButton btnRegitrarDeposito = new JButton("Registrar Dep\u00F3sito");
		panel_m_deposito.add(btnRegitrarDeposito);
		btnRegitrarDeposito.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		/*JPanel panel_m_transferir = new JPanel();
		panel_m_transferir.setBounds(24, 251, 836, 240);
		panel_movimento.add(panel_m_transferir);
		
		/*JPanel panel_m_sacar = new JPanel();
		panel_m_sacar.setBounds(24, 251, 836, 240);
		panel_movimento.add(panel_m_sacar);
*/
		
		//Painel Emprestimos
		JPanel panel_emprestimo = new JPanel();
		panel_emprestimo.setBounds(0, 22, 888, 540);
		contentPane.add(panel_emprestimo);
		panel_emprestimo.setLayout(null);
		
		JLabel lblPanelEmprestimo= new JLabel("Panel Emprestimo");
		lblPanelEmprestimo.setBounds(72, 45, 82, 14);
		panel_emprestimo.add(lblPanelEmprestimo);
		
		//Painel Usuarios
		JPanel panel_user = new JPanel();
		panel_user.setBounds(0, 22, 888, 540);
		contentPane.add(panel_user);
		panel_user.setLayout(null);
		
		JLabel lblPanelUser = new JLabel("Panel User");
		lblPanelUser.setBounds(72, 45, 82, 14);
		panel_user.add(lblPanelUser);
		/*
		f.trocaPainel(panel_conta.getComponents(), false, panel_conta);
		f.trocaPainel(panel_movimento.getComponents(), false, panel_movimento);
		f.trocaPainel(panel_emprestimo.getComponents(), false, panel_emprestimo);
		f.trocaPainel(panel_user.getComponents(), false, panel_user);
		
		Button conta = new Button("Conta Corrente");
		conta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.trocaPainel(panel_conta.getComponents(), true, panel_conta);
				f.trocaPainel(panel_movimento.getComponents(), false, panel_movimento);
				f.trocaPainel(panel_emprestimo.getComponents(), false, panel_emprestimo);
				f.trocaPainel(panel_user.getComponents(), false, panel_user);
			}
		});
		
		conta.setBounds(0, 0, 222, 22);
		contentPane.add(conta);
		
		Button movimentacao = new Button("Movimenta\u00E7\u00F5es");
		movimentacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.trocaPainel(panel_conta.getComponents(), false, panel_conta);
				f.trocaPainel(panel_movimento.getComponents(), true, panel_movimento);
				f.trocaPainel(panel_emprestimo.getComponents(), false, panel_emprestimo);
				f.trocaPainel(panel_user.getComponents(), false, panel_user);
			}
		});
		movimentacao.setBounds(222, 0, 222, 22);
		contentPane.add(movimentacao);
		
		Button emprestimo = new Button("Empr\u00E9stimos");
		emprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				f.trocaPainel(panel_conta.getComponents(), false, panel_conta);
				f.trocaPainel(panel_movimento.getComponents(), false, panel_movimento);
				f.trocaPainel(panel_emprestimo.getComponents(), true, panel_emprestimo);
				f.trocaPainel(panel_user.getComponents(), false, panel_user);

			}
		});
		emprestimo.setBounds(444, 0, 222, 22);
		contentPane.add(emprestimo);
		
		Button usuarios = new Button("Usu\u00E1rios");
		usuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.trocaPainel(panel_conta.getComponents(), false, panel_conta);
				f.trocaPainel(panel_movimento.getComponents(), false, panel_movimento);
				f.trocaPainel(panel_emprestimo.getComponents(), false, panel_emprestimo);
				f.trocaPainel(panel_user.getComponents(), true, panel_user);
			}
		});
		usuarios.setBounds(666, 0, 222, 22);
		contentPane.add(usuarios);
		*/
	}
}
