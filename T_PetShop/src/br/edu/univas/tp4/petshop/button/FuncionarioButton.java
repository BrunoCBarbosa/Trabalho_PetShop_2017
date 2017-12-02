package br.edu.univas.tp4.petshop.button;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.tp4.petshop.listener.TelaOpcoesListener;

public class FuncionarioButton extends JPanel{

	private static final long serialVersionUID = -7352733474149028068L;
	
	private JButton cadastrarButton;
	private JButton editarButton;
	private JButton voltarButton;
	
	private GridBagConstraints cadastrarButtonConstraints;
	private GridBagConstraints editarButtonConstraints;
	private GridBagConstraints voltarButtonConstraints;
	
	private ArrayList<TelaOpcoesListener> listeners = new ArrayList<>();
	
	public FuncionarioButton() {
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		add(getCadastrarButton(),getCadastrarButtonConstraints());
		add(getEditarButton(),getEditarButtonConstraints());
		add(getVoltarButton(),getVoltarButtonConstraints());
	}
	
	/*================== GETTERS =============================*/
	private JButton getCadastrarButton() {
		if(cadastrarButton == null){
			cadastrarButton = new JButton();
			cadastrarButton.setPreferredSize(new Dimension(110, 30));
			cadastrarButton.setText("Cadastrar");
			cadastrarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cadastrarClicked();
					
				}
			});
		}
		return cadastrarButton;
	}

	private JButton getEditarButton() {
		if(editarButton == null){
			editarButton = new JButton();
			editarButton.setPreferredSize(new Dimension(110, 30));
			editarButton.setText("Editar");
			editarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					editarClicked();
					
				}
			});
		}
		return editarButton;
	}

	private JButton getVoltarButton() {
		if(voltarButton == null){
			voltarButton = new JButton();
			voltarButton.setPreferredSize(new Dimension(110, 30));
			voltarButton.setText("Voltar");
			voltarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					voltarClicked();
					
				}
			});
		}
		return voltarButton;
	}

	private GridBagConstraints getCadastrarButtonConstraints() {
		if(cadastrarButtonConstraints == null){
			cadastrarButtonConstraints = new GridBagConstraints();
			cadastrarButtonConstraints.gridx = 0;
			cadastrarButtonConstraints.gridy = 0;
			cadastrarButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return cadastrarButtonConstraints;
	}

	private GridBagConstraints getEditarButtonConstraints() {
		if(editarButtonConstraints == null){
			editarButtonConstraints = new GridBagConstraints();
			editarButtonConstraints.gridx = 0;
			editarButtonConstraints.gridy = 1;
			editarButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return editarButtonConstraints;
	}

	private GridBagConstraints getVoltarButtonConstraints() {
		if(voltarButtonConstraints == null){
			voltarButtonConstraints = new GridBagConstraints();
			voltarButtonConstraints.gridx = 0;
			voltarButtonConstraints.gridy = 2;
			voltarButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return voltarButtonConstraints;
	}
	
	/*========================= CLICKED ====================*/
	public void adddButtonListener(TelaOpcoesListener listener){
		listeners.add(listener);
	}
	
	private void cadastrarClicked(){
		for(TelaOpcoesListener listener : listeners){
			listener.cadastrarPerformed();
		}
	}
	
	private void editarClicked(){
		for(TelaOpcoesListener listener : listeners){
			listener.editarPerformed();
		}
	}
	
	private void voltarClicked(){
		for(TelaOpcoesListener listener : listeners){
			listener.voltarPerformed();
		}
	}
	
}
