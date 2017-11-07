package br.edu.univas.tp4.petshop.view;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.controller.EditarButtonListener;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class EditaFuncionarioFrame extends JFrame{

	private static final long serialVersionUID = 2521579831015123085L;
	
	private SearchController controller;
	
	private PesquisarPanel pesquisarPanel;
	private CadastroPessoaPanel editaPanel;
	private ButtonPanelEditaFuncionario buttonPanel;
	
	//CONSTRUCTOR
	public EditaFuncionarioFrame(SearchController controller){
		super("Editar Funcionário");
		this.controller = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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

	private ButtonPanelEditaFuncionario getButtonPanel() {
		if(buttonPanel == null){
			buttonPanel = new ButtonPanelEditaFuncionario();
			buttonPanel.addButtonsListener(new EditarButtonListener() {
				
				@Override
				public void salvarPerformed() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void excluirPerformed() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void cancelPerformed() {
					// TODO Auto-generated method stub
					
				}
			});
		}
		return buttonPanel;
	}
	
	public void salvarClicked(){
		//TODO : Implementar
	}
	
	public void cancelClicked(){
		//TODO : Implementar
	}
	
	public void excluirClicked(){
		//TODO : Implementar
	}
	
}
