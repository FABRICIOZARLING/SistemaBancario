package controladores;

import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import formularios.FormularioPrincipal;
import formularios.FormularioLogin;

public class Funcoes {
	public void confereLogin(String user, char[] password) {
		Usuario u = new Usuario();
		if(u.getU().size()==0) {
			char [] senha = {'s','e','n','h','a'};
			criaUsuario("administrador",senha, true);
		}
		ArrayList<Usuario> us = u.getU();
		for(int x = 0; x<us.size();x++) {
			if(user.equals(us.get(x).getUsuario())) {
				if(Arrays.equals(password, us.get(x).getSenha())) {
					FormularioPrincipal frame = new FormularioPrincipal(us.get(x).isAdm());
					frame.setVisible(true);
					x=us.size();
						
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
	
	public void criaUsuario(String user, char[] senha, boolean adm) {
		Usuario u = new Usuario();
		u.setUsuario(user);
		u.setSenha(senha);
		u.setAdm(adm);
		ArrayList<Usuario> us = u.getU();
		us.add(u);
		u.setU(us);
	}
	public void atualizaTaxas(int index, String percentual) {
		percentual = percentual.replaceAll(",", ".");
		try {
			double taxa = Double.parseDouble(percentual);
			Taxas t = new Taxas();
			ArrayList<Taxas> ta = t.getT();
			if(ta.size()<1) {
				t.setTaxa_automovel(0.00);
				t.setTaxa_imovel(0.00);
				t.setTaxa_pessoal(0.00);
			}
			ta.add(t);
			if(index==0) {
				ta.get(0).setTaxa_pessoal(taxa);
			}else if(index==1) {
				ta.get(0).setTaxa_automovel(taxa);
			}else {
				ta.get(0).setTaxa_imovel(taxa);
			}
			t.setT(ta);
		} catch (Exception e) {
			alerta("Taxa "+percentual);
		}
		
	}
	public void alerta(String texto) {
		JOptionPane.showMessageDialog(null, "Dado digitado incorreto "+texto);
		
	}
	public void mensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	public void cadastrarCorrentista(String nome, String cpf_s, String data_nascimento,String rua, String numero, String bairro, String cidade, String cep, String estado, String pais, String telefone,String celular,String email, String r) {
		Correntista c = new Correntista();
		r = r.replaceAll(",", ".");
		try {
			double renda = Double.parseDouble(r);
			cpf_s = cpf_s.replaceAll("[^0-9]", "");
			try {
				long cpf = Long.parseLong(cpf_s);
				c.setNome(nome);
				c.setCpf(cpf);
				c.setData_nascimento(data_nascimento);
				c.setRua(rua);
				c.setNumero(numero);
				c.setBairro(bairro);
				c.setCidade(cidade);
				c.setCep(cep);
				c.setEstado(estado);
				c.setPais(pais);
				c.setTelefone(telefone);
				c.setCelular(celular);
				c.setEmail(email);
				c.setRenda(renda);
				ArrayList<Correntista> cor = c.getC();
				c.setNumero_conta(cor.size()+1);
				movimentarConta("0,00", "credito", "abertura", c.getNumero_conta());
				atualizarLimite(c.getNumero_conta(), "0.00");
				cor.add(c);
				c.setC(cor);
			} catch (Exception e) {
				alerta("CPF: "+cpf_s+" "+e.getMessage());
			}
			
		} catch (Exception e) {
			alerta("renda: "+r);
		}
 
	}
	public void atualizarLimite(int conta, String li) {
		li = li.replace(",",".");
		try {
			double limite =  Double.parseDouble(li);
			Limites l = new Limites();
			ArrayList<Limites> limites = l.getL();
			if(limites.size()<conta) {
					l.setConta(conta);
					l.setLimite(limite);
					limites.add(l);
			}else {
				for(int x=0; x<limites.size();x++) {
					if(limites.get(x).getConta()==conta) {
						limites.get(x).setLimite(limite);	
					}
				}
			}
			l.setL(limites);
		} catch (Exception e) {
			alerta("Limite: "+li);
		}
	}
	public void alterarCorrentista(int index, String nome, String cpf_s, String data_nascimento,String rua, String numero, String bairro, String cidade, String cep, String estado, String pais, String telefone,String celular,String email, String r) {
		Correntista c = new Correntista();
		r = r.replace(",",".");
		try {
			double renda = Double.parseDouble(r);
			cpf_s = cpf_s.replaceAll("[^0-9]", "");
			try {
				long cpf = Long.parseLong(cpf_s);
				ArrayList<Correntista> cor = c.getC();
				cor.get(index).setNome(nome);
				cor.get(index).setCpf(cpf);
				cor.get(index).setData_nascimento(data_nascimento);
				cor.get(index).setRua(rua);
				cor.get(index).setNumero(numero);
				cor.get(index).setBairro(bairro);
				cor.get(index).setCidade(cidade);
				cor.get(index).setCep(cep);
				cor.get(index).setEstado(estado);
				cor.get(index).setPais(pais);
				cor.get(index).setTelefone(telefone);
				cor.get(index).setCelular(celular);
				cor.get(index).setEmail(email);
				cor.get(index).setRenda(renda);
				cor.get(index).setNumero_conta(cor.get(index).getNumero_conta());
				c.setC(cor);
			} catch (Exception e) {
				alerta("CPF: "+cpf_s+" "+e.getMessage());
			}
			
		} catch (Exception e) {
			alerta("renda: "+r);
		}
 
	}
	public boolean movimentarConta(String valor, String natureza, String operacao, int conta) {
		boolean valida=false;
		try {
			valor = valor.replace(",",".");
			double movimentacao = Double.parseDouble(valor);
			Movimentacao m = new Movimentacao();
			ArrayList<Movimentacao> mov =m.getM();
			if(mov.size()<conta) {
				m.setMovimentacao(movimentacao);
				m.setNatureza(natureza);
				m.setOperacao(operacao);
				m.setSaldo(movimentacao);
				m.setConta(conta);
				mov.add(m);
			}else {

				double saldo=verificarSaldo(conta);
				if(natureza.equals("credito")) {
					saldo+=movimentacao;
					m.setNatureza(natureza);
					m.setOperacao(operacao);
					m.setMovimentacao(movimentacao);
					m.setConta(conta);
					m.setSaldo(saldo);
					mov.add(m);
				}else {
					if(saldo<movimentacao) {
						mensagem("Saldo insuficiente");
					}else {
						saldo-=movimentacao;
						m.setNatureza(natureza);
						m.setOperacao(operacao);
						m.setMovimentacao(movimentacao);
						m.setConta(conta);
						m.setSaldo(saldo);
						mov.add(m);
						valida=true;
					}

				}

			}
			m.setM(mov);
			
		} catch (Exception e) {
			alerta("Valor: "+valor+" "+e.getMessage());
		}
		return valida;
	}
	public double calculoParcela(String valor, double taxa, int meses) {
		double parcela = 0.00;
		valor = valor.replace(",",".");
		try {
			double v = Double.parseDouble(valor);
			taxa=taxa/100.00;
			parcela = v*(taxa/(1-(1/Math.pow((1+taxa),meses))));
		} catch (Exception e) {
			alerta("Valor "+valor);
		}
				
		return parcela;
	}
	public void gravarEmprestimo(int conta, double taxa, double valor, double parcela, int prazo) {
		Limites l = new Limites();
		if(l.getL().get(conta-1).getLimite()<valor) {
			mensagem("Limite não disponível para está operação, gentileza conversar com seu gerente");
		}else {
			Emprestimo e = new Emprestimo();
			e.setConta(conta);
			e.setParcela(parcela);
			e.setPrazo(prazo);
			e.setTaxa(taxa);
			e.setValor(valor);
			ArrayList<Emprestimo> emprestimo = e.getE();
			emprestimo.add(e);
			e.setE(emprestimo);
			movimentarConta(""+valor, "credito", "Empréstimo", conta);
			l.getL().get(conta-1).setLimite(l.getL().get(conta-1).getLimite()-valor);

		}
		
	}
	public double verificarSaldo(int conta) {
		double saldo = 0.0;
		Movimentacao m = new Movimentacao();
		for(int x = (m.getM().size()-1); x>=0; x--) {
			if(m.getM().get(x).getConta()== conta) {
				saldo = m.getM().get(x).getSaldo();
				break;
			}
		}
		
		return saldo;
	}
	
	public DefaultTableModel geraExtrato(int conta) {
		DefaultTableModel exibirDados = new DefaultTableModel();
		
		//Criar colunas
		exibirDados.addColumn("Movimetação");
		exibirDados.addColumn("Natureza");
		exibirDados.addColumn("Operação");
		exibirDados.addColumn("Saldo");
		String[] linhas = new String[4];
		Movimentacao m = new Movimentacao();
		for(int x = (m.getM().size()-1); x>=0; x--) {
			if(m.getM().get(x).getConta()== conta) {
				linhas[0]=String.format("%.2f", m.getM().get(x).getMovimentacao());
				linhas[1]=m.getM().get(x).getNatureza();
				linhas[2]=m.getM().get(x).getOperacao();
				linhas[3]=String.format("%.2f", m.getM().get(x).getSaldo());
				exibirDados.addRow(linhas);
			}
		}

		
		
		return exibirDados;
	}
	public void enbleText(JPanel j, boolean acao) {
		Component[] c = j.getComponents();	
		for (Component component : c) {
			System.out.println(component.getName());
			System.out.println(component.getClass());
			if((""+component.getClass()).equals("class javax.swing.JTextField")) {
				component.setEnabled(acao);
			}
		}
		
	}

}


