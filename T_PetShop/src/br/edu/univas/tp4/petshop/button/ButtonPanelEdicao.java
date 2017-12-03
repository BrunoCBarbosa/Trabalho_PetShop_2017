package br.edu.univas.tp4.petshop.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.tp4.petshop.listener.ExcluirButtonListener;

public class ButtonPanelEdicao extends JPanel{

	private static final long serialVersionUID = -960778352303260242L;
	
	private JButton excluirButton;

	private ArrayList<ExcluirButtonListener> listeners = new ArrayList<>();
	
	public ButtonPanelEdicao(){
		initialize();
	}
	
	public void initialize(){
		add(getExcluirButton());
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

	public void addButtonsListener(ExcluirButtonListener listener){
		listeners.add(listener);
	}
	
	
	private void excluirClicked(){
		for(ExcluirButtonListener listener : listeners){
			listener.excluirPerformed();
		}
	}

}
