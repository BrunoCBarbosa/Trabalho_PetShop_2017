package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.button.ButtonPanelEdicao;
import br.edu.univas.tp4.petshop.controller.SearchController;
import br.edu.univas.tp4.petshop.listener.EditarButtonListener;
import br.edu.univas.tp4.petshop.panel.CadastroProdutoPanel;
import br.edu.univas.tp4.petshop.panel.PesquisarPanel;

public class EditaProdutoFrame extends JFrame{

	private static final long serialVersionUID = 6046146083614895551L;
	
	private SearchController controller;
	
	private CadastroProdutoPanel produtoPanel;
	private PesquisarPanel pesquisaPanel;
	private ButtonPanelEdicao buttonPanel;
	
	/*================= CONSTRUTOR ========================*/
	public EditaProdutoFrame(SearchController controller){
		super("Editar Produto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setSize(700,600);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/*===================== ADDS ======================*/
	private void initialize(){
		add(getPesquisaPanel(), BorderLayout.NORTH);
		add(getProdutoPanel(), BorderLayout.WEST);
		add(getButtonPanel(), BorderLayout.PAGE_END);
	}
	
	/*===================== GETTERS =====================*/
	private CadastroProdutoPanel getProdutoPanel() {
		if(produtoPanel == null){
			produtoPanel = new CadastroProdutoPanel();
		}
		return produtoPanel;
	}

	private PesquisarPanel getPesquisaPanel() {
		if(pesquisaPanel == null){
			pesquisaPanel = new PesquisarPanel();
		}
		return pesquisaPanel;
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
				
				@Override
				public void cancelPerformed() {
					cancelClicked();
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
	
	public void cancelClicked(){
		//TODO : Implementar
	}
}
