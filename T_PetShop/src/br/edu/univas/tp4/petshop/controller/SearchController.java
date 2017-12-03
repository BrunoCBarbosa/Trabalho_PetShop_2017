package br.edu.univas.tp4.petshop.controller;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import br.edu.univas.tp4.petshop.frame.CadastroFuncionarioFrame;
import br.edu.univas.tp4.petshop.frame.CadastroProdutoFrame;
import br.edu.univas.tp4.petshop.frame.VerFuncionarioFrame;
import br.edu.univas.tp4.petshop.frame.VerProdutoFrame;
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
	private VerFuncionarioFrame verFuncionarioFrame;
	private CadastroProdutoFrame cadastroProdutoFrame;
	private VerProdutoFrame verProdutoFrame;
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
		verFuncionarioFrame = new VerFuncionarioFrame(this);
		verFuncionarioFrame.setVisible(true);
	}
	
	public void cadastroProduto(){
		cadastroProdutoFrame = new CadastroProdutoFrame(this);
		cadastroProdutoFrame.setVisible(true);
	}
	
	public void editaProduto(){
		verProdutoFrame = new VerProdutoFrame(this);
		verProdutoFrame.setVisible(true);
	}
	
	public void relatorioProduto(){
		relatorioProdutosFrame = new RelatorioProdutosFrame(this);
		relatorioProdutosFrame.setVisible(true);
	}
	
	public void relatorioVendas(){
		relatorioVendasFrame = new RelatorioVendasFrame(this);
		relatorioVendasFrame.setVisible(true);
	}
	
	/*======================= FUNCIONARIO ===================================*/
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
	
	public void excluirFuncionarioClicked(String cpf){
		PessoaDAO pessoaDAO = new PessoaDAO();
		try {
			pessoaDAO.deleteFuncionario(cpf);
			System.out.println("Funcionário excluído");
			JOptionPane.showMessageDialog(verFuncionarioFrame, "Funcionário excluído");
		} catch (Exception e) {
			System.out.println("Erro ao excluir o funcionário");
			JOptionPane.showMessageDialog(verFuncionarioFrame, "Erro ao excluir o funcionário");
			e.printStackTrace();
		}
		
	}
	
	/*====================== PRODUTO ===================================*/
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
	
	public void excluirProdutoClicked(int codigo){
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		try {
			produtoDAO.deleteProduto(codigo);
			System.out.println("Produto excluído");
			JOptionPane.showMessageDialog(verProdutoFrame, "Produto excluído");
		} catch (ProdutoException e) {
			System.out.println("Erro ao excluir o funcionário");
			JOptionPane.showMessageDialog(verProdutoFrame, "Erro ao excluir o funcionário");
			e.printStackTrace();
		}
		
	}
}
