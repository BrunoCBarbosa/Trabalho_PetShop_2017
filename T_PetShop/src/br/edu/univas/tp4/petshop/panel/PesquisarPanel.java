package br.edu.univas.tp4.petshop.panel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.tp4.petshop.listener.PesquisarListener;

public class PesquisarPanel extends JPanel {

	private static final long serialVersionUID = 1898413438510555705L;
	
	private JTextField textPesquisar;
	private JButton buttonPesquisar;
	
	private GridBagConstraints textPesquisarConstraints;
	private GridBagConstraints buttonPesquisaConstraints;
	
	private ArrayList<PesquisarListener> listeners = new ArrayList<>();
	
	public PesquisarPanel(){
		initialize();
	}
	
	private void initialize(){
		setLayout(new GridBagLayout());
		
		add(getTextPesquisar(), getTextPesquisarConstraints());
		add(getButtonPesquisar(),getButtonPesquisarConstraints());
	}
	
	private JTextField getTextPesquisar(){
		if(textPesquisar == null){
			textPesquisar = new JTextField();
			textPesquisar.setColumns(25);
		}
		return textPesquisar;
	}
	
	private JButton getButtonPesquisar(){
		if(buttonPesquisar == null){
			buttonPesquisar = new JButton();
			buttonPesquisar.setText("Pesquisar");
			buttonPesquisar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					pesquisarClicked();
					
				}
			});
		}
		return buttonPesquisar;
	}
	
	private GridBagConstraints getTextPesquisarConstraints(){
		if(textPesquisarConstraints == null){
			textPesquisarConstraints = new GridBagConstraints();
			textPesquisarConstraints.gridx = 0;
			textPesquisarConstraints.gridy = 0;
			textPesquisarConstraints.ipadx = 100;
		//	textPesquisarConstraints.weightx = 1.0;
			textPesquisarConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textPesquisarConstraints;
	}
	
	private GridBagConstraints getButtonPesquisarConstraints(){
		if(buttonPesquisaConstraints == null){
			buttonPesquisaConstraints = new GridBagConstraints();
			buttonPesquisaConstraints.gridx = 1;
			buttonPesquisaConstraints.gridy = 0;
			buttonPesquisaConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return buttonPesquisaConstraints;
	}
	
	/*======================= LISTENER ========================*/
	private void addButtonListener(PesquisarListener listener){
		listeners.add(listener);
	}
	
	private void pesquisarClicked(){
		for(PesquisarListener listener : listeners){
			listener.pesquisarPerformed();
		}
	}
	
}
