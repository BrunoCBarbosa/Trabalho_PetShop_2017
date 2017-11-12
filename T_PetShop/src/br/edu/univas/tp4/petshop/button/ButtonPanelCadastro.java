package br.edu.univas.tp4.petshop.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.edu.univas.tp4.petshop.listener.SalvarSairButtonListener;

public class ButtonPanelCadastro extends JPanel{

	private static final long serialVersionUID = 4349390655740753228L;
	
	private JButton salvarButton;
	private JButton cancelButton;
	
	private ArrayList<SalvarSairButtonListener> listeners = new ArrayList<>();
	
	/*====================== CONSTRUTOR ==========================*/
	public ButtonPanelCadastro(){
		initialize();
	}
	
	/*========================= ADDS ==============================*/
	private void initialize(){
		add(getSalvarButton());
		add(getCancelButoon());
	}
	
	/*======================= GETTERS ============================*/
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
	
	/*=================== LISTENERS ============================*/
	public void addButtonsListener(SalvarSairButtonListener listener){
		listeners.add(listener);
	}
	
	private void salvarClicked(){
		for(SalvarSairButtonListener listener : listeners){
			listener.salvarPerformed();
		}
	}
	
	private void cancelClicked(){
		for(SalvarSairButtonListener listener : listeners){
			listener.cancelPerformed();
		}
	}
	
	
}
