package br.edu.univas.tp4.petshop.controller;

import br.edu.univas.tp4.petshop.view.CadastroClienteFrame;
import br.edu.univas.tp4.petshop.view.TelaPrincipalFrame;

public class SearchController {
	
	private CadastroClienteFrame cadastroClienteFrame;
	private TelaPrincipalFrame telaPrincipalFrame;
	
	public SearchController(){
		telaPrincipalFrame = new TelaPrincipalFrame(this);
	}
	
	public void initialize(){
		telaPrincipalFrame.setVisible(true);
	}
}
