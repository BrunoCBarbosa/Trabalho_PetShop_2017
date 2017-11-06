package br.edu.univas.tp4.petshop.controller;

import br.edu.univas.tp4.petshop.view.CadastroClienteFrame;
import br.edu.univas.tp4.petshop.view.TelaPrincipalFrame;

public class SearchController {
	
	private CadastroClienteFrame cadastroClienteFrame;
	private TelaPrincipalFrame telaPrincipalFrame;
	
	public SearchController(){
		cadastroClienteFrame = new CadastroClienteFrame(this);
	}
	
	public void initialize(){
		cadastroClienteFrame.setVisible(true);
	}
}
