package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.univas.tp4.petshop.button.ButtonPanelEdicao;
import br.edu.univas.tp4.petshop.controller.SearchController;
import br.edu.univas.tp4.petshop.listener.ExcluirButtonListener;
import br.edu.univas.tp4.petshop.listener.PesquisarListener;
import br.edu.univas.tp4.petshop.panel.CadastroProdutoPanel;
import br.edu.univas.tp4.petshop.panel.PesquisarPanel;
import br.edu.univas.tp4.petshop.panel.VerProdutoPanel;

public class VerProdutoFrame extends JFrame{

	private static final long serialVersionUID = 6046146083614895551L;
	
	private SearchController controllers;
	
	//private PesquisarPanel pesquisaPanel;
	private ButtonPanelEdicao buttonPanel;
	private VerProdutoPanel verPanel;
	
	/*================= CONSTRUTOR ========================*/
	public VerProdutoFrame(SearchController controller){
		super("Editar Produto");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		initialize();
		setSize(700,600);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/*===================== ADDS ======================*/
	private void initialize(){
		//add(getPesquisarPanel(), BorderLayout.NORTH);
		add(getVerPanel(), BorderLayout.CENTER);
		add(getButtonPanel(), BorderLayout.PAGE_END);
	}
	
	/*===================== GETTERS =====================*/
//	private PesquisarPanel getPesquisarPanel() {
//		if(pesquisaPanel == null){
//			pesquisaPanel = new PesquisarPanel();
//			pesquisaPanel.addButtonListener(new PesquisarListener() {
//				
//				@Override
//				public void pesquisarPerformed() {
//					// TODO Auto-generated method stub
//					
//				}
//				
//			
//			});
//		}
//		return pesquisaPanel;
//	}
	

	public VerProdutoPanel getVerPanel() {
		if(verPanel == null){
			verPanel = new VerProdutoPanel();
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
		int linha = verPanel.getTableProduto().getSelectedRow();
		if(linha == -1){
			JOptionPane.showMessageDialog(this, "Nenhum Item Selecionado");
		}else{
			Object valor = verPanel.getTableProduto().getValueAt(linha, 0);
			int valorInt = (int)valor;
			controllers.excluirProdutoClicked(valorInt);
		}
	}
	
	
}
