package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.controller.SearchController;
import br.edu.univas.tp4.petshop.listener.GerarRelat�rioListener;
import br.edu.univas.tp4.petshop.panel.RelatorioProdutosPanel;
import br.edu.univas.tp4.petshop.panel.TabelaProdutosPanel;

public class RelatorioProdutosFrame extends JFrame{

	private static final long serialVersionUID = 7566013816297779961L;
	
	private SearchController controller;
	
	private RelatorioProdutosPanel relatorioPanel;
	private TabelaProdutosPanel tabelaPanel;
	
	/*===================== CONSTRUTOR ======================*/
	public RelatorioProdutosFrame(SearchController controller){
		super("Relat�rio de Produtos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void initialize(){
		add(getRelat�rioPanel(), BorderLayout.NORTH);
		add(getTabelaPanel(), BorderLayout.CENTER);
	}

	private RelatorioProdutosPanel getRelat�rioPanel() {
		if(relatorioPanel == null){
			relatorioPanel = new RelatorioProdutosPanel();
			relatorioPanel.addButtonListener(new GerarRelat�rioListener() {
				
				@Override
				public void gerarRelat�rioPerformed() {
					gerarRelatorioClicked();
					
				}
				
				@Override
				public void cancelarPerformed() {
					cancelarClicked();
					
				}
			});
		}
		return relatorioPanel;
	}

	private TabelaProdutosPanel getTabelaPanel() {
		if(tabelaPanel == null){
			tabelaPanel = new TabelaProdutosPanel();
		}
		return tabelaPanel;
	}
	
	public void gerarRelatorioClicked(){
		//TODO: Implementar
	}
	
	public void cancelarClicked(){
		//TODO : Implementar
	}
}
