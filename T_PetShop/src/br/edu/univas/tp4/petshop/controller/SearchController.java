package br.edu.univas.tp4.petshop.controller;

import br.edu.univas.tp4.petshop.view.CadastroFuncionarioFrame;
import br.edu.univas.tp4.petshop.view.EditaFuncionarioFrame;
import br.edu.univas.tp4.petshop.view.TelaPrincipalFrame;

public class SearchController {
	
	private CadastroFuncionarioFrame cadastroFuncionarioFrame;
	private TelaPrincipalFrame telaPrincipalFrame;
	private EditaFuncionarioFrame editaFuncionarioFrame;
	
	public SearchController(){
		editaFuncionarioFrame = new EditaFuncionarioFrame(this);
	}
	
	public void initialize(){
		editaFuncionarioFrame.setVisible(true);
	}
}
