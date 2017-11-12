package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.controller.SearchController;
import br.edu.univas.tp4.petshop.listener.PesquisarListener;
import br.edu.univas.tp4.petshop.panel.RelatorioVendasPanel;
import br.edu.univas.tp4.petshop.panel.RelatorioVendasTabela;

public class RelatorioVendasFrame extends JFrame{

	private static final long serialVersionUID = 5870964697511347123L;
	
	private SearchController controller;
	
	private RelatorioVendasPanel relatorioPanel;
	private RelatorioVendasTabela relatorioTabela;
	
	/*====================== CONSTRUTOR ========================*/
	public RelatorioVendasFrame(SearchController controller){
		super("Relatório de Vendas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/*========================= ADDS ===============================*/
	private void initialize(){
		add(getRelatorioPanel(), BorderLayout.NORTH);
		add(getRelatorioTabela(), BorderLayout.CENTER);
	}
	
	/*===================== GETTERS =============================*/
	private RelatorioVendasPanel getRelatorioPanel() {
		if(relatorioPanel == null){
			relatorioPanel = new RelatorioVendasPanel();
			relatorioPanel.addButtonListener(new PesquisarListener() {
				
				@Override
				public void pesquisarPerformed() {
					pesquisarClicked();
					
				}
				
				@Override
				public void cancelarPerformed() {
					cancelarClicked();
					
				}
			});
		}
		return relatorioPanel;
	}

	private RelatorioVendasTabela getRelatorioTabela() {
		if(relatorioTabela == null){
			relatorioTabela = new RelatorioVendasTabela();
		}
		return relatorioTabela;
	}
	
	public void pesquisarClicked(){
		//TODO : Implementar
	}
	
	public void cancelarClicked(){
		//TODO : Implementar
	}

}
