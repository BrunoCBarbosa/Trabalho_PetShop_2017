package br.edu.univas.tp4.petshop.controller;

import br.edu.univas.tp4.petshop.view.CadastroFuncionarioFrame;
import br.edu.univas.tp4.petshop.view.CadastroProdutoFrame;
import br.edu.univas.tp4.petshop.view.EditaFuncionarioFrame;
import br.edu.univas.tp4.petshop.view.TelaPrincipalFrame;

public class SearchController {
	
	private CadastroFuncionarioFrame cadastroFuncionarioFrame;
	private TelaPrincipalFrame telaPrincipalFrame;
	private EditaFuncionarioFrame editaFuncionarioFrame;
	private CadastroProdutoFrame cadastroProdutoFrame;
	
	public SearchController(){
		cadastroProdutoFrame = new CadastroProdutoFrame(this);
	}
	
	public void initialize(){
		cadastroProdutoFrame.setVisible(true);
	}
}
