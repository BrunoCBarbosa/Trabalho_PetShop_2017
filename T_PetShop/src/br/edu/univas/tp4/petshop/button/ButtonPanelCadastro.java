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
	
	private ArrayList<SalvarSairButtonListener> listeners = new ArrayList<>();
	
	/*====================== CONSTRUTOR ==========================*/
	public ButtonPanelCadastro(){
		initialize();
	}
	
	/*========================= ADDS ==============================*/
	private void initialize(){
		add(getSalvarButton());
	}
	
	/*======================= GETTERS ============================*/
	public JButton getSalvarButton() {
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
	
	/*=================== LISTENERS ============================*/
	public void addButtonsListener(SalvarSairButtonListener listener){
		listeners.add(listener);
	}
	
	public void salvarClicked(){
		for(SalvarSairButtonListener listener : listeners){
			listener.salvarPerformed();
		}
	}
	
}
	
	

