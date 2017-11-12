
package br.edu.univas.tp4.petshop.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.edu.univas.tp4.petshop.listener.SalvarSairButtonListener;
import br.edu.univas.tp4.petshop.panel.CadastroPessoaPanel;
import br.edu.univas.tp4.petshop.button.ButtonPanelCadastro;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class CadastroFuncionarioFrame extends JFrame{
	private static final long serialVersionUID = -4221091737850320808L;
	
	private SearchController controller;
	
	private CadastroPessoaPanel clientePanel;
	private ButtonPanelCadastro buttonPanel; 
	
	/*====================== CONSTRUTOR ========================*/

	public CadastroFuncionarioFrame(SearchController controller){
		super("Informações do Cliente");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initialize();
		setSize(700,650);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	/*========================= ADDS ===============================*/
	private void initialize(){
		add(getFuncionarioPanel(),BorderLayout.WEST);
		add(getButtonPanel(),BorderLayout.PAGE_END);
	}

	/*====================== GETTERS ================================*/
	private CadastroPessoaPanel getFuncionarioPanel() {
		if(clientePanel == null){
			clientePanel = new CadastroPessoaPanel();
		}
		return clientePanel;
	}

	private ButtonPanelCadastro getButtonPanel() {
		if(buttonPanel == null){
			buttonPanel = new ButtonPanelCadastro();
			buttonPanel.addButtonsListener(new SalvarSairButtonListener() {
				
				@Override
				public void salvarPerformed() {
					salvarClicked();
				}
				
				@Override
				public void cancelPerformed() {
					cancelClicked();
				}
			});
		}
		return buttonPanel;
	}
	
	public void salvarClicked(){
		//TODO : Implementar
	}
	
	public void cancelClicked(){
		//TODO:implementar
	}
}
