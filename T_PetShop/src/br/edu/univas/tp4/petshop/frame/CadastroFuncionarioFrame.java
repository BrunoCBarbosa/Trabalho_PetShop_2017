
package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.listener.SalvarSairButtonListener;
import br.edu.univas.tp4.petshop.panel.CadastroPessoaPanel;
import br.edu.univas.tp4.petshop.button.ButtonPanelCadastro;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class CadastroFuncionarioFrame extends JFrame{
	private static final long serialVersionUID = -4221091737850320808L;
	
	private SearchController controllers;
	
	private CadastroPessoaPanel cadastroFuncionarioPanel;
	private ButtonPanelCadastro buttonPanel; 
	
	/*====================== CONSTRUTOR ========================*/

	public CadastroFuncionarioFrame(SearchController controller){
		super("Informações do Cliente");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		controllers = controller;
		
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/*========================= ADDS ===============================*/
	private void initialize(){
		add(getFuncionarioPanel(),BorderLayout.WEST);
		add(getButtonPanel(),BorderLayout.PAGE_END);
	}

	/*====================== GETTERS ================================*/
	public CadastroPessoaPanel getFuncionarioPanel() {
		if(cadastroFuncionarioPanel == null){
			cadastroFuncionarioPanel = new CadastroPessoaPanel();
		}
		return cadastroFuncionarioPanel;
	}

	public ButtonPanelCadastro getButtonPanel() {
		if(buttonPanel == null){
			buttonPanel = new ButtonPanelCadastro();
			buttonPanel.addButtonsListener(new SalvarSairButtonListener() {
				
				@Override
				public void salvarPerformed() {
					salvarClicked();
				}
				
			});
		}
		return buttonPanel;
	}
	
	public void salvarClicked(){
		controllers.cadastrarFuncionarioClicked();
	}
	
	
}
