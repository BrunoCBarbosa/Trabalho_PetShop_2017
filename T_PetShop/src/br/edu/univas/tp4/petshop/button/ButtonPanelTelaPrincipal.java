package br.edu.univas.tp4.petshop.button;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.univas.tp4.petshop.listener.PrincipalButtonListener;

public class ButtonPanelTelaPrincipal extends JPanel{

	private static final long serialVersionUID = -8809379158798135022L;
	
	private JButton clientesButton;
	private JButton estoqueButton;
	private JButton relatorioButton;
	private JButton sairButton;
	
	private GridBagConstraints clienteButtonConstraints;
	private GridBagConstraints estoqueButtonConstraints;
	private GridBagConstraints relatorioButtonConstraints;
	private GridBagConstraints sairButtonConstraints;

	
	private ArrayList<PrincipalButtonListener> listeners = new ArrayList<>();
	
	public ButtonPanelTelaPrincipal(){
		initialize();
	}
	
	private void initialize(){
		setLayout(new GridBagLayout());
		//setBorder(new EmptyBorder(10, 10, 10, 10));
		
		add(getClientesButton(),getClienteButtonConstraints());
		add(getEstoqueButton(),getEstoqueButtonConstraints());
		add(getRelatorioButton(),getRelatorioButtonConstraints());
		add(getSairButton(),getSairButtonConstraints());
	}
	
	/*================== CRIAÇÃO DE BOTÕES ====================*/
	private JButton getClientesButton() {
		if(clientesButton == null){
			clientesButton = new JButton();
			clientesButton.setPreferredSize(new Dimension(110, 30));
			clientesButton.setText("Funcionários");
			clientesButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					funcionarioClicked();
					
				}
			});
		}
		return clientesButton;
	}

	private JButton getEstoqueButton() {
		if(estoqueButton == null){
			estoqueButton = new JButton();
			estoqueButton.setPreferredSize(new Dimension(110, 30));
			estoqueButton.setText("Estoque");
			estoqueButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					estoqueClicked();
				}
			});
		}
		return estoqueButton;
	}

	private JButton getRelatorioButton() {
		if(relatorioButton == null){
			relatorioButton = new JButton();
			relatorioButton.setPreferredSize(new Dimension(110, 30));
			relatorioButton.setText("Relatórios");
			relatorioButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					relatorioClicked();					
				}
			});
		}
		return relatorioButton;
	}

	private JButton getSairButton() {
		if(sairButton == null){
			sairButton = new JButton();
			sairButton.setPreferredSize(new Dimension(110, 30));
			sairButton.setText("Sair");
			sairButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					sairClicked();
				}
			});
		}
		return sairButton;
	}
	
	/*===================== CONSTRAINTS =======================*/
	private GridBagConstraints getClienteButtonConstraints() {
		if(clienteButtonConstraints == null){
			clienteButtonConstraints = new GridBagConstraints();
			clienteButtonConstraints.gridx = 0;
			clienteButtonConstraints.gridy = 0;
			clienteButtonConstraints.insets = new Insets(5, 5, 5, 5);
	}
		return clienteButtonConstraints;
	}

	private GridBagConstraints getEstoqueButtonConstraints() {
		if(estoqueButtonConstraints == null){
			estoqueButtonConstraints = new GridBagConstraints();
			estoqueButtonConstraints.gridx = 0;
			estoqueButtonConstraints.gridy = 1;
			estoqueButtonConstraints.insets = new Insets(5, 5, 5, 5);
			
		}
		return estoqueButtonConstraints;
	}

	private GridBagConstraints getRelatorioButtonConstraints() {
		if(relatorioButtonConstraints == null){
			relatorioButtonConstraints = new GridBagConstraints();
			relatorioButtonConstraints.gridx = 0;
			relatorioButtonConstraints.gridy = 2;
			relatorioButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return relatorioButtonConstraints;
	}

	private GridBagConstraints getSairButtonConstraints() {
		if(sairButtonConstraints == null){
			sairButtonConstraints = new GridBagConstraints();
			sairButtonConstraints.gridx = 0;
			sairButtonConstraints.gridy = 3;
			sairButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return sairButtonConstraints;
	}

	public void addButtonListener(PrincipalButtonListener listener){
		listeners.add(listener);
	}
	
	public void funcionarioClicked(){
		for(PrincipalButtonListener listener : listeners){
			listener.funcionarioPerformed();
		}
	}
	
	public void estoqueClicked(){
		for(PrincipalButtonListener listener : listeners){
			listener.estoquePerformed();
		}
	}
	
	public void relatorioClicked(){
		for(PrincipalButtonListener listener : listeners){
			listener.relatorioPerformed();
		}
	}	
		
	public void sairClicked(){
		for(PrincipalButtonListener listener : listeners){
				listener.sairPerformed();
		}
	}
}

