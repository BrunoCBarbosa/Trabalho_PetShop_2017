package br.edu.univas.tp4.petshop.view;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.controller.SalvarSairButtonListener;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class CadastroProdutoFrame extends JFrame{

	private static final long serialVersionUID = -8437564757584634441L;
	
	private SearchController controller;
	
	private CadastroProdutoPanel produtoPanel;
	private ButtonPanelCadastro buttonPanel;
	
	/*=================== CONSTRUTOR =======================*/
	public CadastroProdutoFrame(SearchController controller){
		super("Cadastrar Produto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setSize(700,600);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/*================= ADDS =====================*/
	private void initialize(){
		add(getProdutoPanel(), BorderLayout.WEST);
		add(getButtonPanel(), BorderLayout.PAGE_END);
	}
	
	/*=================== GETTERS ================*/
	private CadastroProdutoPanel getProdutoPanel() {
		if(produtoPanel == null){
			produtoPanel = new CadastroProdutoPanel();
		}
		return produtoPanel;
	}

	private ButtonPanelCadastro getButtonPanel() {
		if(buttonPanel == null){
			buttonPanel = new ButtonPanelCadastro();
			buttonPanel.addButtonsListener(new SalvarSairButtonListener() {
				
				@Override
				public void salvarPerformed() {
					salvarClicked();
					
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
	
	public void cancelClicked(){
		//TODO:implementar
	}

}
