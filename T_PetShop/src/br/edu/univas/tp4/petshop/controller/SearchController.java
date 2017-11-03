package br.edu.univas.tp4.petshop.controller;

import br.edu.univas.tp4.petshop.view.CadastroClienteFrame;

public class SearchController {
	
	private CadastroClienteFrame cadastroClienteFrame;
	
	public SearchController(){
		cadastroClienteFrame = new CadastroClienteFrame(this); 
	}
	
	public void initialize(){
		cadastroClienteFrame.setVisible(true);
	}
}
