package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.listener.EditarButtonListener;
import br.edu.univas.tp4.petshop.panel.CadastroPessoaPanel;
import br.edu.univas.tp4.petshop.panel.PesquisarPanel;
import br.edu.univas.tp4.petshop.button.ButtonPanelEdicao;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class EditaFuncionarioFrame extends JFrame{

	private static final long serialVersionUID = 2521579831015123085L;
	
	private SearchController controller;
	
	private PesquisarPanel pesquisarPanel;
	private CadastroPessoaPanel editaPanel;
	private ButtonPanelEdicao buttonPanel;
	
	//CONSTRUCTOR
	public EditaFuncionarioFrame(SearchController controller){
		super("Editar Funcionário");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void initialize(){
		add(getPesquisaPanel(), BorderLayout.NORTH);
		add(getEditaPanel(),BorderLayout.WEST);
		add(getButtonPanel(),BorderLayout.PAGE_END);
	}
	
	private PesquisarPanel getPesquisaPanel(){
		if(pesquisarPanel == null){
			pesquisarPanel = new PesquisarPanel();
		}
		return pesquisarPanel;
	}

	private CadastroPessoaPanel getEditaPanel() {
		if(editaPanel == null){
			editaPanel = new CadastroPessoaPanel();
		}
		return editaPanel;
	}

	private ButtonPanelEdicao getButtonPanel() {
		if(buttonPanel == null){
			buttonPanel = new ButtonPanelEdicao();
			buttonPanel.addButtonsListener(new EditarButtonListener() {
				
				@Override
				public void salvarPerformed() {
					salvarClicked();
					
				}
				
				@Override
				public void excluirPerformed() {
					excluirClicked();
					
				}
				
			
			});
		}
		return buttonPanel;
	}
	
	public void salvarClicked(){
		//TODO : Implementar
	}
	
		public void excluirClicked(){
		//TODO : Implementar
	}
	
}
