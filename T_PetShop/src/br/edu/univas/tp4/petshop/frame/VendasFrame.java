package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.controller.SearchController;
import br.edu.univas.tp4.petshop.panel.TabelProdutosPanel;
import br.edu.univas.tp4.petshop.panel.VendaPanel;

public class VendasFrame extends JFrame{

	private static final long serialVersionUID = -6131704919789036023L;

	private SearchController controller;
	
	private VendaPanel vendaPanel;
	private TabelProdutosPanel tabelaProdutosPanel;
	
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
		}
		return vendaPanel;
	}
	
	public TabelProdutosPanel getTabelaProdutosPanel(){
		if(tabelaProdutosPanel == null){
			tabelaProdutosPanel = new TabelProdutosPanel();
		}
		return tabelaProdutosPanel;
	}
	
	/*====================== BUTTONS =====================*/
	public void incluirClicked(){
		//TODO : implementar
	}
	
	public void retirarClicked(){
		//TODO : implementar
	}
}
