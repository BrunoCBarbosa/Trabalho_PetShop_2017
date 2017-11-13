package br.edu.univas.tp4.petshop.controller;

import br.edu.univas.tp4.petshop.frame.CadastroFuncionarioFrame;
import br.edu.univas.tp4.petshop.frame.CadastroProdutoFrame;
import br.edu.univas.tp4.petshop.frame.EditaFuncionarioFrame;
import br.edu.univas.tp4.petshop.frame.EditaProdutoFrame;
import br.edu.univas.tp4.petshop.frame.RelatorioProdutosFrame;
import br.edu.univas.tp4.petshop.frame.RelatorioVendasFrame;
import br.edu.univas.tp4.petshop.frame.TelaPrincipalFrame;
import br.edu.univas.tp4.petshop.frame.VendasFrame;

public class SearchController {
	
	private CadastroFuncionarioFrame cadastroFuncionarioFrame;
	private TelaPrincipalFrame telaPrincipalFrame;
	private EditaFuncionarioFrame editaFuncionarioFrame;
	private CadastroProdutoFrame cadastroProdutoFrame;
	private EditaProdutoFrame editaProdutoFrame;
	private VendasFrame vendasFrame;
	private RelatorioProdutosFrame relatorioProdutosFrame;
	private RelatorioVendasFrame relatorioVendasFrame;
	
	public SearchController(){
		telaPrincipalFrame = new TelaPrincipalFrame(this);
	}
	
	public void initialize(){
		telaPrincipalFrame.setVisible(true);
	}
}
