package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import br.edu.univas.tp4.petshop.listener.PrincipalButtonListener;
import br.edu.univas.tp4.petshop.listener.RelatorioListener;
import br.edu.univas.tp4.petshop.listener.TelaOpcoesListener;
import br.edu.univas.tp4.petshop.panel.ProdutoPanel;
import br.edu.univas.tp4.petshop.panel.FuncionarioPanel;
import br.edu.univas.tp4.petshop.panel.TelaPrincipalPanel;
import br.edu.univas.tp4.petshop.button.ButtonPanelTelaPrincipal;
import br.edu.univas.tp4.petshop.button.ProdutoButton;
import br.edu.univas.tp4.petshop.button.RelatorioButton;
import br.edu.univas.tp4.petshop.button.FuncionarioButton;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class TelaPrincipalFrame extends JFrame{

	private static final long serialVersionUID = 5297710416685419462L;
	
	private SearchController controller;
	
	private TelaPrincipalPanel principalPanel;
	private ButtonPanelTelaPrincipal buttonPrincipal;
	private FuncionarioPanel funcionarioPanel;
	private FuncionarioButton funcionarioButton;
	private ProdutoPanel produtoPanel;
	private ProdutoButton produtoButton;
	private RelatorioButton relatorioButton;

	public TelaPrincipalFrame(SearchController controller){
		super("Petshop");
		this.controller = controller;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	public void initialize(){
		add(getPrincipalPanel(),BorderLayout.NORTH);
		add(getButtonPrincipal(),BorderLayout.CENTER);
	}

	public TelaPrincipalPanel getPrincipalPanel() {
		if(principalPanel == null){
			principalPanel = new TelaPrincipalPanel();

		}
		return principalPanel;
	}
	
	public  ButtonPanelTelaPrincipal getButtonPrincipal() {
		if(buttonPrincipal == null){
			buttonPrincipal = new ButtonPanelTelaPrincipal();

			buttonPrincipal.addButtonListener(new PrincipalButtonListener() {
				
				@Override
				public void sairPerformed() {
					sairClicked();
					
				}
				
				@Override
				public void produtoPerformed() {
					produtoClicked();
					
				}
				
				@Override
				public void funcionarioPerformed() {
					funcionarioClicked();
					
				}
			});
		}
		return buttonPrincipal;
	}
	
	public  FuncionarioPanel getFuncionarioPanel() {
		if(funcionarioPanel == null){
			funcionarioPanel = new FuncionarioPanel();
		}
		return funcionarioPanel;
	}
	
	

	public  FuncionarioButton getFuncionarioButton() {
		if(funcionarioButton == null){
			funcionarioButton = new FuncionarioButton();
			funcionarioButton.adddButtonListener(new TelaOpcoesListener() {
				
				@Override
				public void voltarPerformed() {
				voltarClicked();
					
				}
				
				@Override
				public void editarPerformed() {
					editarClicked();
					
				}
				
				@Override
				public void cadastrarPerformed() {
					cadastrarClicked();
					
				}
			});
		}
		return funcionarioButton;
	}
	
	
	
	public  ProdutoPanel getProdutoPanel() {
		if(produtoPanel == null){
			produtoPanel = new ProdutoPanel();
		}
		return produtoPanel;
	}

	public  ProdutoButton getProdutoButton() {
		if(produtoButton == null){
			produtoButton = new ProdutoButton();
			produtoButton.adddButtonListener(new TelaOpcoesListener() {
				
				@Override
				public void voltarPerformed() {
					voltarClicked();
					
				}
				
				@Override
				public void editarPerformed() {
					editarClicked();					
				}
				
				@Override
				public void cadastrarPerformed() {
					cadastrarClicked();
					
				}
			});
		}
		return produtoButton;
	}
	
	/*====================== CLICKED ===========================*/
	public void funcionarioClicked(){
		getPrincipalPanel().removeAll();
		getPrincipalPanel().revalidate();
		getButtonPrincipal().removeAll();
		getButtonPrincipal().revalidate();
		principalPanel= null;
		buttonPrincipal = null;
		add(getFuncionarioPanel(),BorderLayout.NORTH);
		add(getFuncionarioButton(),BorderLayout.CENTER);
	}
	
	public void produtoClicked(){
		getPrincipalPanel().removeAll();
		getPrincipalPanel().revalidate();
		getButtonPrincipal().removeAll();
		getButtonPrincipal().revalidate();
		principalPanel= null;
		buttonPrincipal = null;
		add(getProdutoPanel(),BorderLayout.NORTH);
		add(getProdutoButton(),BorderLayout.CENTER);
	}
	
	public void sairClicked(){
		System.exit(0);
	}
	
	/*====================== BOT�ES FUNCION�RIOS ==================*/
	public void cadastrarClicked(){
		if(funcionarioButton != null){
			controller.cadastroFuncionario();
		}
		if(produtoButton != null){
			controller.cadastroProduto();
		}
	}
	
	public void editarClicked(){
		if(funcionarioButton != null){
			controller.editaFuncionario();
		}
		if(produtoButton != null){
			controller.editaProduto();
		}
	}
	
	public void voltarClicked(){
		getFuncionarioPanel().removeAll();
		getFuncionarioPanel().revalidate();
		getFuncionarioButton().removeAll();
		getFuncionarioButton().revalidate();
		getProdutoPanel().removeAll();
		getProdutoPanel().revalidate();
		getProdutoButton().removeAll();
		getProdutoButton().revalidate();
			relatorioButton = null;
		funcionarioPanel= null;
		funcionarioButton= null;
		produtoPanel = null;
		produtoButton = null;
		add(getPrincipalPanel(),BorderLayout.NORTH);
		add(getButtonPrincipal(),BorderLayout.CENTER);
	}
	
	
	
	
	
	

}
