package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.listener.SalvarSairButtonListener;
import br.edu.univas.tp4.petshop.panel.CadastroProdutoPanel;
import br.edu.univas.tp4.petshop.button.ButtonPanelCadastro;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class CadastroProdutoFrame extends JFrame{

	private static final long serialVersionUID = -8437564757584634441L;
	
	private SearchController controller;
	
	private CadastroProdutoPanel produtoPanel;
	private ButtonPanelCadastro buttonPanel;
	
	/*=================== CONSTRUTOR =======================*/
	public CadastroProdutoFrame(SearchController controller){
		super("Cadastrar Produto");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.controller = controller;
		
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
	public CadastroProdutoPanel getProdutoPanel() {
		if(produtoPanel == null){
			produtoPanel = new CadastroProdutoPanel();
		}
		return produtoPanel;
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
		controller.cadastrarProdutoClicked();
	}
	
	
}
