package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.rtf.RTFEditorKit;

import controladores.Correntista;
import controladores.Funcoes;
import controladores.Limites;
import controladores.Movimentacao;
import controladores.Taxas;

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
import javax.swing.JTable;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


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
	private JTextField tfPais;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfRenda;
	private JTextField tfCelular;
	private JTextField tfBuscarM;
	private JTextField tfValorMoviment;
	private JTextField tfBuscarEAdm;
	private JTextField tfValorEmprestado;
	private JTable table;
	private JTextField tfNovoUser;
	private JPasswordField pfNovoUser;
	private JTextField tfNovaTaxa;
	private JTextField tfNovoLimite;
	private JTextField tfBuscarE;
	private JTextField tfBuscarMt;

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal(boolean adm) {
		Funcoes f = new Funcoes();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Painel conta corrente
		JPanel panel_conta = new JPanel();
		panel_conta.setBounds(0, 22, 888, 540);
		contentPane.add(panel_conta);
		panel_conta.setLayout(null);
		
		JButton btnBuscarConta = new JButton("Buscar");
		btnBuscarConta.setBounds(635, 10, 224, 23);
		panel_conta.add(btnBuscarConta);
		
		JComboBox comboBusca = new JComboBox();
		comboBusca.setModel(new DefaultComboBoxModel(new String[] {"Buscar por CPF ", "N\u00FAmero da conta"}));
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
		
		tfPais = new JTextField();
		tfPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfPais.setBounds(635, 329, 224, 20);
		panel_conta.add(tfPais);
		tfPais.setColumns(10);
		
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
		panel_conta.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!lblNconta.getText().equals("")) {
					f.alterarCorrentista(
							Integer.parseInt(lblNconta.getText())-1,
							tfNome.getText(), 
							tfCpf.getText(), 
							tfNasc.getText(), 
							tfRua.getText(), 
							tfNum.getText(), 
							tfBairro.getText(), 
							tfCidade.getText(), 
							tfCep.getText(), 
							tfEstado.getText(), 
							tfPais.getText(), 
							tfTelefone.getText(), 
							tfCelular.getText(), 
							tfEmail.getText(), 
							tfRenda.getText());
							
				}else {
					f.cadastrarCorrentista(
							tfNome.getText(), 
							tfCpf.getText(), 
							tfNasc.getText(), 
							tfRua.getText(), 
							tfNum.getText(), 
							tfBairro.getText(), 
							tfCidade.getText(), 
							tfCep.getText(), 
							tfEstado.getText(), 
							tfPais.getText(), 
							tfTelefone.getText(), 
							tfCelular.getText(), 
							tfEmail.getText(), 
							tfRenda.getText());
				}

			}
		});
		btnBuscarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int dado = Integer.parseInt(tfBusca.getText().replaceAll("[^0-9]", ""));
					Correntista c = new Correntista();
					if(c.getC().size()>0) {
						for(int x = 0; x<c.getC().size(); x++) {
							if(c.getC().get(x).getCpf()==dado||c.getC().get(x).getNumero_conta()==dado) {
								tfBairro.setText(c.getC().get(x).getBairro());
								tfBairro.setEnabled(false);
								tfCelular.setText(c.getC().get(x).getCelular());
								tfCelular.setEnabled(false);
								tfCep.setText(c.getC().get(x).getCep());
								tfCep.setEnabled(false);
								tfCidade.setText(c.getC().get(x).getCidade());
								tfCidade.setEnabled(false);
								tfCpf.setText(""+c.getC().get(x).getCpf());
								tfCpf.setEnabled(false);
								tfEmail.setText(c.getC().get(x).getEmail());
								tfEmail.setEnabled(false);
								tfEstado.setText(c.getC().get(x).getEstado());
								tfEstado.setEnabled(false);
								tfNasc.setText(c.getC().get(x).getData_nascimento());
								tfNasc.setEnabled(false);
								tfNome.setText(c.getC().get(x).getNome());
								tfNome.setEnabled(false);
								tfRua.setText(c.getC().get(x).getRua());
								tfRua.setEnabled(false);
								tfTelefone.setText(c.getC().get(x).getTelefone());
								tfTelefone.setEnabled(false);
								tfNum.setText(c.getC().get(x).getNumero());
								tfNum.setEnabled(false);
								tfPais.setText(c.getC().get(x).getPais());
								tfPais.setEnabled(false);
								tfRenda.setText(String.format("%.2f", c.getC().get(x).getRenda()));
								tfRenda.setEnabled(false);
								lblNconta.setText(""+c.getC().get(x).getNumero_conta());
								x=c.getC().size();
							}
						}
					}
				} catch (Exception e2) {
					f.alerta("Número da conta ou CPF "+tfBusca.getText());
				}	
			}
		});
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.enbleText(panel_conta, true);
			}
		});
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
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setBounds(580, 75, 280, 23);
		panel_movimento.add(btnExtrato);
		btnExtrato.setEnabled(false);

		
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
		
		JLabel lblContanumM = new JLabel("Conta N\u00BA");
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
		
		tfValorMoviment = new JTextField();
		tfValorMoviment.setBounds(335, 213, 210, 20);
		panel_movimento.add(tfValorMoviment);
		tfValorMoviment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfValorMoviment.setColumns(10);
		
		JLabel lblConfirmacaoM = new JLabel("N");
		lblConfirmacaoM.setBounds(110, 502, 680, 14);
		panel_movimento.add(lblConfirmacaoM);
		lblConfirmacaoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_m_deposito = new JPanel();
		panel_m_deposito.setBounds(24, 251, 836, 240);
		panel_movimento.add(panel_m_deposito);
		
		JButton btnRegitrarDeposito = new JButton("Registrar Dep\u00F3sito");

		panel_m_deposito.add(btnRegitrarDeposito);
		btnRegitrarDeposito.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
		JPanel panel_m_transferir = new JPanel();
		panel_m_transferir.setBounds(24, 251, 836, 240);
		panel_movimento.add(panel_m_transferir);
		panel_m_transferir.setLayout(null);
		
		JComboBox comboBuscarMT = new JComboBox();
		comboBuscarMT.setBounds(67,21,210, 20);
		panel_m_transferir.add(comboBuscarMT);
		comboBuscarMT.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBuscarMT.setModel(new DefaultComboBoxModel(new String[] {"Numero da conta", "Buscar por CPF"}));
		
		tfBuscarMt = new JTextField();
		tfBuscarMt.setBounds(311,21,210, 20);
		panel_m_transferir.add(tfBuscarMt);
		tfBuscarMt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfBuscarMt.setColumns(10);
		
		JButton btnBuscarMt = new JButton("Buscar");
		btnBuscarMt.setBounds(556,20,210,23);
		panel_m_transferir.add(btnBuscarMt);
		btnBuscarMt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContanumMt = new JLabel("Conta N\u00BA");
		lblContanumMt.setBounds(70,66,120,14);
		panel_m_transferir.add(lblContanumMt);
		lblContanumMt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContaMt = new JLabel("00");
		lblContaMt.setBounds(225, 66, 55, 14);
		panel_m_transferir.add(lblContaMt);
		lblContaMt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNomeMt = new JLabel("Nome");
		lblNomeMt.setBounds(312,66,440,14);
		panel_m_transferir.add(lblNomeMt);
		lblNomeMt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnMTransferencia = new JButton("Confirmar Transferencia");
		btnMTransferencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMTransferencia.setBounds(311, 126, 210, 23);
		panel_m_transferir.add(btnMTransferencia);
		
		JPanel panel_m_sacar = new JPanel();
		panel_m_sacar.setBounds(24, 251, 836, 240);
		panel_movimento.add(panel_m_sacar);

		JButton btnRegitrarSaque = new JButton("Registrar Saque");
		btnRegitrarSaque.setBounds(0, 0, 0, 0);
		panel_m_sacar.add(btnRegitrarSaque);
		btnRegitrarSaque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblSaldo = new JLabel("Saldo             R$");
		lblSaldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSaldo.setBounds(94, 91, 120, 14);
		panel_movimento.add(lblSaldo);
		
		JLabel lblValorSaldo = new JLabel("00,00");
		lblValorSaldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorSaldo.setBounds(249, 91, 163, 14);
		panel_movimento.add(lblValorSaldo);
		
		panel_m_sacar.setVisible(false);
		panel_m_transferir.setVisible(false);
		panel_m_deposito.setVisible(false);
		
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_m_sacar.setVisible(false);
				panel_m_transferir.setVisible(false);
				panel_m_deposito.setVisible(true);
			}
		});
		btnTransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_m_sacar.setVisible(false);
				panel_m_transferir.setVisible(true);
				panel_m_deposito.setVisible(false);
			}
		});
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_m_sacar.setVisible(true);
				panel_m_transferir.setVisible(false);
				panel_m_deposito.setVisible(false);
			}
		});
		btnBuscarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int dado = Integer.parseInt(tfBuscarM.getText().replaceAll("[^0-9]", ""));
					Correntista c = new Correntista();
					Movimentacao m = new Movimentacao();
					if(c.getC().size()>0) {
						for(int x = 0; x<c.getC().size(); x++) {
							if(c.getC().get(x).getCpf()==dado||c.getC().get(x).getNumero_conta()==dado) {
								lblContaM.setText(""+c.getC().get(x).getNumero_conta());
								lblNomeM.setText(c.getC().get(x).getNome());
								lblValorSaldo.setText(String.format("%.2f", f.verificarSaldo(Integer.parseInt(lblContaM.getText()))));
								btnExtrato.setEnabled(true);
								x=c.getC().size();
							}
						}
					}
				} catch (Exception e2) {
					f.alerta("Número da conta ou CPF "+tfBusca.getText());
				}
			}
		});
		btnExtrato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FormularioExtrato fe = new FormularioExtrato(Integer.parseInt(lblContaM.getText()));
				fe.setVisible(true);
				
			}
		});
		
		btnRegitrarDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Movimentacao m = new Movimentacao();
				f.movimentarConta(tfValorMoviment.getText(), "credito", "Depósito", Integer.parseInt(lblContaM.getText()));
				lblValorSaldo.setText(String.format("%.2f", f.verificarSaldo(Integer.parseInt(lblContaM.getText()))));

			}
		});
		btnRegitrarSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Movimentacao m = new Movimentacao();
				f.movimentarConta(tfValorMoviment.getText(), "debito", "Saque", Integer.parseInt(lblContaM.getText()));
				lblValorSaldo.setText(String.format("%.2f", f.verificarSaldo(Integer.parseInt(lblContaM.getText()))));

			}
		});
		btnBuscarMt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int dado = Integer.parseInt(tfBuscarMt.getText().replaceAll("[^0-9]", ""));
					Correntista c = new Correntista();
					if(c.getC().size()>0) {
						for(int x = 0; x<c.getC().size(); x++) {
							if(c.getC().get(x).getCpf()==dado||c.getC().get(x).getNumero_conta()==dado) {
								lblContaMt.setText(""+c.getC().get(x).getNumero_conta());
								lblNomeMt.setText(c.getC().get(x).getNome());
								x=c.getC().size();
							}
						}
					}
				} catch (Exception e2) {
					f.alerta("Número da conta ou CPF "+tfBusca.getText());
				}
			}
		});
		btnMTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Movimentacao m = new Movimentacao();
				if(f.movimentarConta(tfValorMoviment.getText(),"debito", "Transferência", Integer.parseInt(lblContaM.getText()))==true) {
					f.movimentarConta(tfValorMoviment.getText(), "credito", "Transferência", Integer.parseInt(lblContaMt.getText()));
					lblValorSaldo.setText(String.format("%.2f", f.verificarSaldo(Integer.parseInt(lblContaM.getText()))));
				};

			}
		});

	
		//Painel Emprestimos
		JPanel panel_emprestimo = new JPanel();
		panel_emprestimo.setBounds(0, 22, 888, 540);
		contentPane.add(panel_emprestimo);
		panel_emprestimo.setLayout(null);
		
		JComboBox comboBuscarE = new JComboBox();
		comboBuscarE.setBounds(67,21,226, 20);
		panel_emprestimo.add(comboBuscarE);
		comboBuscarE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBuscarE.setModel(new DefaultComboBoxModel(new String[] {"Numero da conta", "Buscar por CPF"}));
		
		tfBuscarE = new JTextField();
		tfBuscarE.setBounds(347,21,210, 20);
		panel_emprestimo.add(tfBuscarE);
		tfBuscarE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfBuscarE.setColumns(10);
		
		JButton btnBuscarE = new JButton("Buscar");
		btnBuscarE.setBounds(608,20,210,23);
		panel_emprestimo.add(btnBuscarE);
		btnBuscarE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContanumE = new JLabel("Conta N\u00BA");
		lblContanumE.setBounds(67,66,120,14);
		panel_emprestimo.add(lblContanumE);
		lblContanumE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContaE = new JLabel("00");
		lblContaE.setBounds(238, 66, 55, 14);
		panel_emprestimo.add(lblContaE);
		lblContaE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNomeE = new JLabel("Nome");
		lblNomeE.setBounds(347,66,440,14);
		panel_emprestimo.add(lblNomeE);
		lblNomeE.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblValorEmprestado = new JLabel("Valor Emprestado");
		lblValorEmprestado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorEmprestado.setBounds(67, 163, 226, 14);
		panel_emprestimo.add(lblValorEmprestado);
		
		tfValorEmprestado = new JTextField();
		tfValorEmprestado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfValorEmprestado.setBounds(347, 160, 210, 20);
		panel_emprestimo.add(tfValorEmprestado);
		tfValorEmprestado.setColumns(10);
		
		JLabel lblTaxaDeJuros = new JLabel("Taxa de Juros ao M\u00EAs");
		lblTaxaDeJuros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTaxaDeJuros.setBounds(67, 227, 226, 14);
		panel_emprestimo.add(lblTaxaDeJuros);
		
		JComboBox comboBoxPrazo = new JComboBox();
		comboBoxPrazo.setModel(new DefaultComboBoxModel(new String[] {"6 Meses", "12 Meses", "18 Meses", "24 Meses", "30 Meses", "36 Meses", "42 Meses", "48 Meses", "54 Meses", "60 Meses"}));
		comboBoxPrazo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxPrazo.setBounds(347, 286, 210, 22);
		panel_emprestimo.add(comboBoxPrazo);
		
		JLabel lblPrazoR = new JLabel("Prazo");
		lblPrazoR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrazoR.setBounds(67, 290, 226, 14);
		panel_emprestimo.add(lblPrazoR);
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSimular.setBounds(608, 286, 210, 23);
		panel_emprestimo.add(btnSimular);
		
		JPanel panel_emprestimo_proposta = new JPanel();
		panel_emprestimo_proposta.setBounds(67, 367, 751, 102);
		panel_emprestimo.add(panel_emprestimo_proposta);
		panel_emprestimo_proposta.setLayout(null);
		
		DefaultTableModel exibirDados = new DefaultTableModel();
		
		//Criar colunas
		exibirDados.addColumn("Valor do Empréstimo");
		exibirDados.addColumn("Prazo de Pagamento");
		exibirDados.addColumn("Valor da Parcela");
		exibirDados.addColumn("Taxa de Juros");
		
	
		JTable tabela = new JTable(exibirDados);
		
		// JScrollPane - Barra de rolagem englobando o JTable
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 10, 731, 40);
		panel_emprestimo_proposta.add(barraRolagem);
		
		JButton btnAprovarEmprestimo = new JButton("Aprovar Empr\u00E9stimo");
		btnAprovarEmprestimo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAprovarEmprestimo.setBounds(376, 68, 365, 23);
		panel_emprestimo_proposta.add(btnAprovarEmprestimo);
		
		JComboBox comboBoxTaxadejuros = new JComboBox(new String[] {"Empr\u00E9stimo Pessoal", "Financiamento Autom\u00F3vel", "Financiamento Im\u00F3vel"});
		comboBoxTaxadejuros.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxTaxadejuros.setBounds(347, 223, 210, 22);
		panel_emprestimo.add(comboBoxTaxadejuros);
		
		JLabel lblTaxaEmprestimo = new JLabel("Taxa");
		lblTaxaEmprestimo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTaxaEmprestimo.setBounds(608, 227, 210, 14);
		panel_emprestimo.add(lblTaxaEmprestimo);
		
		JLabel lblLimiteDeCredito = new JLabel("Limite de Cr\u00E9dito     R$");
		lblLimiteDeCredito.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLimiteDeCredito.setBounds(67, 91, 155, 14);
		panel_emprestimo.add(lblLimiteDeCredito);
		
		JLabel lblValorLimite = new JLabel("00,00");
		lblValorLimite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValorLimite.setBounds(238, 91, 61, 14);
		panel_emprestimo.add(lblValorLimite);
		
		
		//Painel Usuarios
		JPanel panel_user = new JPanel();
		panel_user.setBounds(10, 22, 888, 540);
		contentPane.add(panel_user);
		panel_user.setLayout(null);
		
		JLabel lblNovoUsurio = new JLabel("Novo Usu\u00E1rio");
		lblNovoUsurio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNovoUsurio.setBounds(87, 64, 157, 14);
		panel_user.add(lblNovoUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(87, 102, 157, 14);
		panel_user.add(lblSenha);
		
		tfNovoUser = new JTextField();
		tfNovoUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNovoUser.setBounds(254, 61, 238, 20);
		panel_user.add(tfNovoUser);
		tfNovoUser.setColumns(10);
		
		pfNovoUser = new JPasswordField();
		pfNovoUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pfNovoUser.setBounds(254, 99, 238, 20);
		panel_user.add(pfNovoUser);
		
		JComboBox comboBoxNovoUser = new JComboBox();
		comboBoxNovoUser.setModel(new DefaultComboBoxModel(new String[] {"Operador", "Administrador"}));
		comboBoxNovoUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxNovoUser.setBounds(546, 60, 251, 22);
		panel_user.add(comboBoxNovoUser);
		
		JButton btnGravarPerfil = new JButton("Gravar");

		btnGravarPerfil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGravarPerfil.setBounds(546, 93, 251, 23);
		panel_user.add(btnGravarPerfil);
		
		JLabel lblCadastroDeNovo = new JLabel("Cadastro de Novo Usu\u00E1rio");
		lblCadastroDeNovo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeNovo.setBounds(87, 21, 342, 14);
		panel_user.add(lblCadastroDeNovo);
		
		JLabel lblAtualizarTaxasDe = new JLabel("Atualizar Taxas de Juros");
		lblAtualizarTaxasDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAtualizarTaxasDe.setBounds(87, 169, 342, 14);
		panel_user.add(lblAtualizarTaxasDe);
		
		JLabel lblAtualizarLimite = new JLabel("Atualizar Limite de Cr\u00E9dito");
		lblAtualizarLimite.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAtualizarLimite.setBounds(87, 341, 342, 14);
		panel_user.add(lblAtualizarLimite);
		
		JComboBox comboBoxtaxa = new JComboBox();
		comboBoxtaxa.setModel(new DefaultComboBoxModel(new String[] {"Empr\u00E9stimo Pessoal", "Financiamento Autom\u00F3vel", "Financiamento Im\u00F3vel"}));
		comboBoxtaxa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxtaxa.setBounds(87, 236, 251, 22);
		panel_user.add(comboBoxtaxa);
		
		JButton btnGravarTaxa = new JButton("Gravar");
		btnGravarTaxa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGravarTaxa.setBounds(588, 236, 209, 23);
		panel_user.add(btnGravarTaxa);
		
		tfNovaTaxa = new JTextField();
		tfNovaTaxa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNovaTaxa.setBounds(386, 237, 163, 20);
		panel_user.add(tfNovaTaxa);
		tfNovaTaxa.setColumns(10);
		
		JComboBox comboBuscarEAdm = new JComboBox();
		comboBuscarEAdm.setBounds(87,391,226, 20);
		panel_user.add(comboBuscarEAdm);
		comboBuscarEAdm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBuscarEAdm.setModel(new DefaultComboBoxModel(new String[] {"Numero da conta", "Buscar por CPF"}));
		
		tfBuscarEAdm = new JTextField();
		tfBuscarEAdm.setBounds(347,391,210, 20);
		panel_user.add(tfBuscarEAdm);
		tfBuscarEAdm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfBuscarEAdm.setColumns(10);
		
		JButton btnBuscarEAdm = new JButton("Buscar");

		btnBuscarEAdm.setBounds(588,390,210,23);
		panel_user.add(btnBuscarEAdm);
		btnBuscarEAdm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContanumEAdm = new JLabel("Conta N\u00BA");
		lblContanumEAdm.setBounds(87,435,120,14);
		panel_user.add(lblContanumEAdm);
		lblContanumEAdm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblContaEAdm = new JLabel("00");
		lblContaEAdm.setBounds(254, 435, 55, 14);
		panel_user.add(lblContaEAdm);
		lblContaEAdm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNomeEAdm = new JLabel("Nome");
		lblNomeEAdm.setBounds(347,435,440,14);
		panel_user.add(lblNomeEAdm);
		lblNomeEAdm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNovoLimite = new JLabel("Limite                                R$");
		lblNovoLimite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNovoLimite.setBounds(87, 481, 226, 14);
		panel_user.add(lblNovoLimite);
		
		tfNovoLimite = new JTextField();
		tfNovoLimite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNovoLimite.setBounds(347, 478, 210, 20);
		panel_user.add(tfNovoLimite);
		tfNovoLimite.setColumns(10);
		
		JButton btnNAtualizarLimite = new JButton("Atualizar");

		btnNAtualizarLimite.setBounds(588, 479, 209, 23);
		panel_user.add(btnNAtualizarLimite);
		
		panel_conta.setVisible(false);
		panel_movimento.setVisible(false);
		panel_emprestimo.setVisible(false);
		panel_user.setVisible(false);
		
		Button conta = new Button("Conta Corrente");
		conta.setBounds(0, 0, 177, 22);
		contentPane.add(conta);
		
		btnBuscarE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int dado = Integer.parseInt(tfBuscarE.getText().replaceAll("[^0-9]", ""));
					Correntista c = new Correntista();
					Limites l = new Limites();
					if(c.getC().size()>0) {
						for(int x = 0; x<c.getC().size(); x++) {
							if(c.getC().get(x).getCpf()==dado||c.getC().get(x).getNumero_conta()==dado) {
								lblContaE.setText(""+c.getC().get(x).getNumero_conta());
								lblNomeE.setText(c.getC().get(x).getNome());
								lblValorLimite.setText(String.format("%.2f", l.getL().get(x).getLimite()));
								x=c.getC().size();
							}
						}
					}
				} catch (Exception e2) {
					f.alerta("Número da conta ou CPF "+tfBusca.getText()+" e2 "+e2.getMessage());
				}
				
			}
		});
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double taxa = Double.parseDouble(lblTaxaEmprestimo.getText().replaceAll(",", "."));
				String[] linhas = {
						tfValorEmprestado.getText(),
						""+((comboBoxPrazo.getSelectedIndex()+1)*6),
						String.format("%.2f",f.calculoParcela(tfValorEmprestado.getText(), taxa , ((comboBoxPrazo.getSelectedIndex()+1)*6))),
						""+taxa
				};
				if(exibirDados.getRowCount()>0) {
					exibirDados.removeRow(0);
				}
				exibirDados.addRow(linhas);
			}
		});
		btnAprovarEmprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double valor = Double.parseDouble(tfValorEmprestado.getText());
					double taxa = Double.parseDouble(lblTaxaEmprestimo.getText().replaceAll(",", "."));
					f.gravarEmprestimo(Integer.parseInt(lblContaE.getText()), taxa, valor, f.calculoParcela(tfValorEmprestado.getText(), taxa , ((comboBoxPrazo.getSelectedIndex()+1)*6)), ((comboBoxPrazo.getSelectedIndex()+1)*6));
					Limites l = new Limites();
					lblValorLimite.setText(String.format("%.2f", l.getL().get((Integer.parseInt(lblContaE.getText())-1)).getLimite()));
				} catch (Exception e2) {
					f.alerta("Algum dado faltante ou Valor "+tfValorEmprestado.getText());
				}
				
			}
		});
		
		conta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conta.setVisible(true);
				panel_movimento.setVisible(false);
				panel_emprestimo.setVisible(false);
				panel_user.setVisible(false);
			}
		});
		comboBoxTaxadejuros.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Taxas t = new Taxas();
				double taxa =0.0;
				if(comboBoxTaxadejuros.getSelectedIndex()==0) {
					taxa = t.getT().get(0).getTaxa_pessoal();
				}else if(comboBoxTaxadejuros.getSelectedIndex()==1) {
					taxa = t.getT().get(0).getTaxa_automovel();
				}else if(comboBoxTaxadejuros.getSelectedIndex()==2) {
					taxa = t.getT().get(0).getTaxa_imovel();
				}
				lblTaxaEmprestimo.setText(String.format("%.2f", taxa));		
			}
		});

		
		btnGravarPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean adm = false;
				if(comboBoxNovoUser.getSelectedIndex()!=0) {
					adm=true;
				}
				f.criaUsuario(tfNovoUser.getText(), pfNovoUser.getPassword(), adm);
				
			}
		});
		
		btnGravarTaxa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.atualizaTaxas(comboBoxtaxa.getSelectedIndex(), tfNovaTaxa.getText());	
			}
		});
		btnBuscarEAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int dado = Integer.parseInt(tfBuscarEAdm.getText().replaceAll("[^0-9]", ""));
					Correntista c = new Correntista();
					Limites l = new Limites();
					if(c.getC().size()>0) {
						for(int x = 0; x<c.getC().size(); x++) {
							System.out.println(x);
							if(c.getC().get(x).getCpf()==dado||c.getC().get(x).getNumero_conta()==dado) {
								lblContaEAdm.setText(""+c.getC().get(x).getNumero_conta());
								lblNomeEAdm.setText(c.getC().get(x).getNome());
								System.out.println(x);
								tfNovoLimite.setText(String.format("%.2f", l.getL().get(x).getLimite()));
								x=c.getC().size();
								System.out.println(x);
							}
						}
					}
				} catch (Exception e2) {
					f.alerta("Número da conta ou CPF "+tfBusca.getText()+" e2 "+e2.getMessage());
				}
			}
		});
		btnNAtualizarLimite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.atualizarLimite(Integer.parseInt(lblContaEAdm.getText()), tfNovoLimite.getText());
			}
		});
		
		Button movimentacao = new Button("Movimenta\u00E7\u00F5es");
		movimentacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conta.setVisible(false);
				panel_movimento.setVisible(true);
				panel_emprestimo.setVisible(false);
				panel_user.setVisible(false);
			}
		});
		movimentacao.setBounds(177, 0, 178, 22);
		contentPane.add(movimentacao);
		
		Button emprestimo = new Button("Empr\u00E9stimos");
		emprestimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_conta.setVisible(false);
				panel_movimento.setVisible(false);
				panel_emprestimo.setVisible(true);
				panel_user.setVisible(false);
		}
		});
		emprestimo.setBounds(355, 0, 178, 22);
		contentPane.add(emprestimo);
		
		Button btnAdm = new Button("Administra\u00E7\u00E3o");
		btnAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conta.setVisible(false);
				panel_movimento.setVisible(false);
				panel_emprestimo.setVisible(false);
				panel_user.setVisible(true);
			}
		});
		btnAdm.setBounds(533, 0, 178, 22);
		btnAdm.setVisible(adm);
		contentPane.add(btnAdm);
		Button btnsair = new Button("Sair");
		btnsair.setBounds(711, 0, 177, 22);
		contentPane.add(btnsair);
		
		btnsair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FormularioLogin fl = new FormularioLogin();
				fl.setVisible(true);
			}
		});
		
	}
}
