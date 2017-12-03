package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.tp4.petshop.listener.ExcluirButtonListener;
import br.edu.univas.tp4.petshop.model.PessoaDAO;
import br.edu.univas.tp4.petshop.model.PessoaTO;
import br.edu.univas.tp4.petshop.panel.CadastroPessoaPanel;
import br.edu.univas.tp4.petshop.panel.PesquisarPanel;
import br.edu.univas.tp4.petshop.panel.VerFuncionarioPanel;
import br.edu.univas.tp4.petshop.button.ButtonPanelEdicao;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class VerFuncionarioFrame extends JFrame{

	private static final long serialVersionUID = 2521579831015123085L;
	
	private SearchController controllers;
	
	//private PesquisarPanel pesquisarPanel;
	private ButtonPanelEdicao buttonPanel;
	private VerFuncionarioPanel verPanel;
	
	//CONSTRUCTOR
	public VerFuncionarioFrame(SearchController controller){
		super("Lista de Funcionários");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		controllers = controller;
		
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void initialize(){
		//add(getPesquisaPanel(), BorderLayout.NORTH);
		add(getVerPanel(), BorderLayout.CENTER);
		add(getButtonPanel(),BorderLayout.PAGE_END);
	}
	
//	private PesquisarPanel getPesquisaPanel(){
//		if(pesquisarPanel == null){
//			pesquisarPanel = new PesquisarPanel();
//		}
//		return pesquisarPanel;
//	}
	
	public VerFuncionarioPanel getVerPanel() {
		if(verPanel == null){
			verPanel = new VerFuncionarioPanel();
		}
		return verPanel;
	}

	public ButtonPanelEdicao getButtonPanel() {
		if(buttonPanel == null){
			buttonPanel = new ButtonPanelEdicao();
			buttonPanel.addButtonsListener(new ExcluirButtonListener() {
				
				@Override
				public void excluirPerformed() {
					excluirClicked();
					
				}
				
			
			});
		}
		return buttonPanel;
	}
	
	

	public void excluirClicked(){
		int linha = verPanel.getTableFuncionario().getSelectedRow();
		if(linha == -1){
			JOptionPane.showMessageDialog(this, "Nenhum Item Selecionado","ERRO", JOptionPane.ERROR_MESSAGE);
		}else{
			Object valor = verPanel.getTableFuncionario().getValueAt(linha, 0);
			String valorString = (String)valor;
			controllers.excluirFuncionarioClicked(valorString);
			getVerPanel().removeAll();
			getVerPanel().revalidate();
			verPanel = null;
			add(getVerPanel(), BorderLayout.CENTER);
		}
		
		
	}
	
}
