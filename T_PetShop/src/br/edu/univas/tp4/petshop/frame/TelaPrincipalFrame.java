package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.listener.PrincipalButtonListener;
import br.edu.univas.tp4.petshop.panel.TelaPrincipalPanel;
import br.edu.univas.tp4.petshop.button.ButtonPanelTelaPrincipal;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class TelaPrincipalFrame extends JFrame{

	private static final long serialVersionUID = 5297710416685419462L;
	
	private SearchController controller;
	
	private TelaPrincipalPanel principalPanel;
	private ButtonPanelTelaPrincipal buttonPrincipal;

	public TelaPrincipalFrame(SearchController controller){
		super("Petshop");
		this.controller = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(700,650);
	}
	
	private void initialize(){
		add(getPrincipalPanel(),BorderLayout.NORTH);
		add(getButtonPrincipal(),BorderLayout.CENTER);
	}

	private TelaPrincipalPanel getPrincipalPanel() {
		if(principalPanel == null){
			principalPanel = new TelaPrincipalPanel();
		}
		return principalPanel;
	}

	private ButtonPanelTelaPrincipal getButtonPrincipal() {
		if(buttonPrincipal == null){
			buttonPrincipal = new ButtonPanelTelaPrincipal();
			buttonPrincipal.addButtonListener(new PrincipalButtonListener() {
				
				@Override
				public void sairPerformed() {
					sairClicked();
					
				}
				
				@Override
				public void relatorioPerformed() {
					relatorioClicked();
					
				}
				
				@Override
				public void estoquePerformed() {
					estoqueClicked();
					
				}
				
				@Override
				public void funcionarioPerformed() {
					funcionarioClicked();
					
				}
			});
		}
		return buttonPrincipal;
	}
	
	public void funcionarioClicked(){
		//TODO:implementar
	}
	
	public void estoqueClicked(){
		//TODO:implementar
	}
	
	public void relatorioClicked(){
		//TODO:implementar
	}	
		
	public void sairClicked(){
		System.exit(0);
	}
	
	
	
	
	
	

}
