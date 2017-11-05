
package br.edu.univas.tp4.petshop.view;

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

import br.edu.univas.tp4.petshop.controller.SalvarSairButtonListener;
import br.edu.univas.tp4.petshop.controller.SearchController;

public class CadastroClienteFrame extends JFrame{
	private static final long serialVersionUID = -4221091737850320808L;
	
	private SearchController controller;
	
	private CadastroClientePanel clientePanel;
	private ButtonPanelCadastro buttonPanel; 
	
	//Construtor
	public CadastroClienteFrame(SearchController controller){
		super("Informações do Cliente");
		this.controller = controller;
		
		initialize();
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void initialize(){
		add(getClientePanel(),BorderLayout.CENTER);
		add(getButtonPanel(),BorderLayout.PAGE_END);
	}

	private CadastroClientePanel getClientePanel() {
		if(clientePanel == null){
			clientePanel = new CadastroClientePanel();
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
				public void CancelPerformed() {
					cancelClicked();
				}
			});
		}
		return buttonPanel;
	}
	
	public void salvarClicked(){
		JOptionPane.showMessageDialog(this, "Salvo com sucesso");
	}
	
	public void cancelClicked(){
		//TODO:implementar
	}
	
	
	
	
	
	
	
	
	
}
