package br.edu.univas.tp4.petshop.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.tp4.petshop.controller.EditarButtonListener;

public class ButtonPanelEditaFuncionario extends JPanel{

	private static final long serialVersionUID = -960778352303260242L;
	
	private JButton salvarButton;
	private JButton excluirButton;
	private JButton cancelButton;
	
	private ArrayList<EditarButtonListener> listeners = new ArrayList<>();
	
	public ButtonPanelEditaFuncionario(){
		initialize();
	}
	
	public void initialize(){
		add(getSalvarButton());
		add(getExcluirButton());
		add(getCancelButoon());
	}
	
	private JButton getSalvarButton() {
		if (salvarButton == null){
			salvarButton = new JButton();
			salvarButton.setText("Salvar");
			salvarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					salvarClicked();
				}
			});
		}	
		return salvarButton;
	}

	private JButton getCancelButoon() {
		if(cancelButton == null){
			cancelButton = new JButton();
			cancelButton.setText("Cancelar");
			cancelButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cancelClicked();
				}
			});
				
		}
		return cancelButton;
	}
	
	private JButton getExcluirButton() {
		if(excluirButton == null){
			excluirButton = new JButton();
			excluirButton.setText("Excluir");
			excluirButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		return excluirButton;
	}

	public void addButtonsListener(EditarButtonListener listener){
		listeners.add(listener);
	}
	
	private void salvarClicked(){
		for(EditarButtonListener listener : listeners){
			listener.salvarPerformed();
		}
	}
	
	private void cancelClicked(){
		for(EditarButtonListener listener : listeners){
			listener.cancelPerformed();
		}
	}
	
	private void excluirCLicked(){
		for(EditarButtonListener listener : listeners){
			listener.excluirPerformed();
		}
	}

}
