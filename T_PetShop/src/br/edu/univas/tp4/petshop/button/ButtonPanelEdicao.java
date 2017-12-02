package br.edu.univas.tp4.petshop.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.tp4.petshop.listener.EditarButtonListener;

public class ButtonPanelEdicao extends JPanel{

	private static final long serialVersionUID = -960778352303260242L;
	
	private JButton salvarButton;
	private JButton excluirButton;
	private JButton cancelButton;
	
	private ArrayList<EditarButtonListener> listeners = new ArrayList<>();
	
	public ButtonPanelEdicao(){
		initialize();
	}
	
	public void initialize(){
		add(getSalvarButton());
		add(getExcluirButton());
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

	private JButton getExcluirButton() {
		if(excluirButton == null){
			excluirButton = new JButton();
			excluirButton.setText("Excluir");
			excluirButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					excluirClicked();
					
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
	
	
	private void excluirClicked(){
		for(EditarButtonListener listener : listeners){
			listener.excluirPerformed();
		}
	}

}
