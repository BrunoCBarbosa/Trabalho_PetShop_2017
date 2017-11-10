package br.edu.univas.tp4.petshop.controller;

import br.edu.univas.tp4.petshop.view.CadastroFuncionarioFrame;
import br.edu.univas.tp4.petshop.view.CadastroProdutoFrame;
import br.edu.univas.tp4.petshop.view.EditaFuncionarioFrame;
import br.edu.univas.tp4.petshop.view.EditaProdutoFrame;
import br.edu.univas.tp4.petshop.view.TelaPrincipalFrame;

public class SearchController {
	
	private CadastroFuncionarioFrame cadastroFuncionarioFrame;
	private TelaPrincipalFrame telaPrincipalFrame;
	private EditaFuncionarioFrame editaFuncionarioFrame;
	private CadastroProdutoFrame cadastroProdutoFrame;
	private EditaProdutoFrame editaProdutoFrame;
	
	public SearchController(){
		editaProdutoFrame = new EditaProdutoFrame(this);
	}
	
	public void initialize(){
		editaProdutoFrame.setVisible(true);
	}
}
