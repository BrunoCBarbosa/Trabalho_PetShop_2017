package br.edu.univas.tp4.petshop.panel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.tp4.petshop.model.FuncionarioException;
import br.edu.univas.tp4.petshop.model.PessoaDAO;
import br.edu.univas.tp4.petshop.model.PessoaTO;

public class VerFuncionarioPanel extends JPanel{

	private static final long serialVersionUID = 2502094201704071824L;

	private JTable tableFuncionario;
	private JScrollPane funcionarioScrollPane;
	
	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	public VerFuncionarioPanel(){
		initialize();
	}
	
	public void initialize(){
		setLayout(new FlowLayout());
		add(getTableFuncionario());
		add(getFuncionarioScrollPane());
	}

	/*================== GETTERS ===========================*/
	public JTable getTableFuncionario() {
		if(tableFuncionario == null){
			DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"CPF", "Nome","Sexo","Endereço","Bairro","Cidade","Email"});
			tableFuncionario = new JTable(modelo);
			Object[] dados = new Object[7];
			
			try {
				ArrayList<PessoaTO> listafuncionario = pessoaDAO.listarFuncionarios();
				for(PessoaTO to : listafuncionario){
					dados[0] = to.getCpf();
					dados[1] = to.getNome();
					dados[2] = to.getSexo();
					dados[3] = to.getEndereco();
					dados[4] = to.getBairro();
					dados[5] = to.getCidade();
					dados[6] = to.getEmail();
					modelo.addRow(dados);
				}
			} catch (FuncionarioException e) {
				System.out.println("Erro ao apresentar a lista de funcionários.");
				e.printStackTrace();
			}
		}
		return tableFuncionario;
	}

	public JScrollPane getFuncionarioScrollPane() {
		if(funcionarioScrollPane == null){
			funcionarioScrollPane = new JScrollPane(tableFuncionario);
			funcionarioScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			funcionarioScrollPane.setPreferredSize(new Dimension(670, 355));
		}
		return funcionarioScrollPane;
	}
	
	
}
