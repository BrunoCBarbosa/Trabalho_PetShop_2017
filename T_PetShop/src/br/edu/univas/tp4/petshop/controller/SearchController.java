package br.edu.univas.tp4.petshop.controller;

import javax.swing.JOptionPane;

import br.edu.univas.tp4.petshop.frame.CadastroFuncionarioFrame;
import br.edu.univas.tp4.petshop.frame.CadastroProdutoFrame;
import br.edu.univas.tp4.petshop.frame.EditaFuncionarioFrame;
import br.edu.univas.tp4.petshop.frame.EditaProdutoFrame;
import br.edu.univas.tp4.petshop.frame.RelatorioProdutosFrame;
import br.edu.univas.tp4.petshop.frame.RelatorioVendasFrame;
import br.edu.univas.tp4.petshop.frame.TelaPrincipalFrame;
import br.edu.univas.tp4.petshop.frame.VendasFrame;
import br.edu.univas.tp4.petshop.model.FuncionarioException;
import br.edu.univas.tp4.petshop.model.PessoaDAO;
import br.edu.univas.tp4.petshop.model.PessoaTO;
import br.edu.univas.tp4.petshop.model.ProdutoDAO;
import br.edu.univas.tp4.petshop.model.ProdutoException;
import br.edu.univas.tp4.petshop.model.ProdutoTO;

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
	
	public void cadastroFuncionario(){
		cadastroFuncionarioFrame = new CadastroFuncionarioFrame(this);
		cadastroFuncionarioFrame.setVisible(true);
	}
	
	public void editaFuncionario(){
		editaFuncionarioFrame = new EditaFuncionarioFrame(this);
		editaFuncionarioFrame.setVisible(true);
	}
	
	public void cadastroProduto(){
		cadastroProdutoFrame = new CadastroProdutoFrame(this);
		cadastroProdutoFrame.setVisible(true);
	}
	
	public void editaProduto(){
		editaProdutoFrame = new EditaProdutoFrame(this);
		editaProdutoFrame.setVisible(true);
	}
	
	public void relatorioProduto(){
		relatorioProdutosFrame = new RelatorioProdutosFrame(this);
		relatorioProdutosFrame.setVisible(true);
	}
	
	public void relatorioVendas(){
		relatorioVendasFrame = new RelatorioVendasFrame(this);
		relatorioVendasFrame.setVisible(true);
	}
	
	public void cadastrarFuncionarioClicked(){
		PessoaDAO pessoaDAO = new PessoaDAO();
		PessoaTO pessoaTO = new PessoaTO();
		pessoaTO = cadastroFuncionarioFrame.getFuncionarioPanel().getPessoa();
		try {
			pessoaDAO.insertNewFuncionario(pessoaTO);
		} catch (FuncionarioException e) {
			System.out.println("Erro ao Cadastrar.");
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(cadastroFuncionarioFrame, "Salvo com sucesso.");
	}
	
	public void cadastrarProdutoClicked(){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		ProdutoTO produtoTO = new ProdutoTO();
		produtoTO = cadastroProdutoFrame.getProdutoPanel().getProduto();
		
		try {
			produtoDAO.insertNewProduto(produtoTO);
		} catch (ProdutoException e) {
			System.out.println("Erro ao Cadastrar");
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(cadastroProdutoFrame, "Salvo com sucesso.");
	}
}
