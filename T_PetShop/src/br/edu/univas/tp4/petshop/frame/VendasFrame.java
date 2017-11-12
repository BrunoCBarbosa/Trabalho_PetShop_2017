package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.controller.SearchController;
import br.edu.univas.tp4.petshop.listener.VendaListener;
import br.edu.univas.tp4.petshop.panel.TabelaProdutosPanel;
import br.edu.univas.tp4.petshop.panel.VendaPanel;

public class VendasFrame extends JFrame{

	private static final long serialVersionUID = -6131704919789036023L;

	private SearchController controller;
	
	private VendaPanel vendaPanel;
	private TabelaProdutosPanel tabelaProdutosPanel;
	
	/*======================== CONSTRUTOR ========================*/
	public VendasFrame(SearchController controller){
		super("Venda de Produto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/*=================== ADDS ========================*/
	private void initialize(){
		add(getVendaPanel(),BorderLayout.NORTH);
		add(getTabelaProdutosPanel(), BorderLayout.CENTER);
	}
	
	/*===================== GETTERS =========================*/
	public VendaPanel getVendaPanel() {
		if(vendaPanel == null){
			vendaPanel = new VendaPanel();
			vendaPanel.addButtonListener(new VendaListener() {
				
				@Override
				public void retirarPerformed() {
					retirarClicked();
					
				}
				
				@Override
				public void pagarPerformed() {
					pagarClicked();
				}
				
				@Override
				public void incluirPerformed() {
					incluirClicked();
				}
				
				@Override
				public void cancelarPerformed() {
					cancelarClicked();
				}
			});
		}
		return vendaPanel;
	}
	
	public TabelaProdutosPanel getTabelaProdutosPanel(){
		if(tabelaProdutosPanel == null){
			tabelaProdutosPanel = new TabelaProdutosPanel();
		}
		return tabelaProdutosPanel;
	}
	
	/*====================== BUTTONS =====================*/
	private void incluirClicked(){
		//TODO : implementar
	}
	
	private void retirarClicked(){
		//TODO : implementar
	}
	
	private void pagarClicked(){
		//TODO : implementar
	}
	
	private void cancelarClicked(){
		//TODO : implementar
	}
}
