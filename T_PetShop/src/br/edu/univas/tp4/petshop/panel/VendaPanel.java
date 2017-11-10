package br.edu.univas.tp4.petshop.panel;

import java.awt.GridBagConstraints;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.tp4.petshop.listener.VendaListener;

public class VendaPanel extends JPanel{

	private static final long serialVersionUID = 5591383784039675311L;
	
	private JLabel produtoLabel;
	private JComboBox<String> comboBox;
	private JLabel quantidadeLabel;
	private JTextField quantidadeText;
	private JButton incluirButton;
	private JButton retirarButton;
	
	private GridBagConstraints produtoLabelConstraints;
	private GridBagConstraints comboBoxConstraints;
	private GridBagConstraints quantidadeLabelConstraints;
	private GridBagConstraints quantidadeTextConstraints;
	private GridBagConstraints incluirButtonConstraints;
	private GridBagConstraints retirarButtonConstraints;
	
	private ArrayList<VendaListener> listeners = new ArrayList<>();
	
	/*====================== CONSTRUTOR ==========================*/
	public VendaPanel(){
		initialize();
	}
	
	/*========================= ADDS ==============================*/
	private void initialize(){
		
	}

	/*======================= GETTERS ============================*/
	private JLabel getProdutoLabel() {
		return produtoLabel;
	}

	private JComboBox<String> getComboBox() {
		return comboBox;
	}

	private JLabel getQuantidadeLabel() {
		return quantidadeLabel;
	}

	private JTextField getQuantidadeText() {
		return quantidadeText;
	}

	private JButton getIncluirButton() {
		return incluirButton;
	}

	private JButton getRetirarButton() {
		return retirarButton;
	}

	private GridBagConstraints getProdutoLabelConstraints() {
		return produtoLabelConstraints;
	}

	private GridBagConstraints getComboBoxConstraints() {
		return comboBoxConstraints;
	}

	private GridBagConstraints getQuantidadeLabelConstraints() {
		return quantidadeLabelConstraints;
	}

	private GridBagConstraints getQuantidadeTextConstraints() {
		return quantidadeTextConstraints;
	}

	private GridBagConstraints getIncluirButtonConstraints() {
		return incluirButtonConstraints;
	}

	private GridBagConstraints getRetirarButtonConstraints() {
		return retirarButtonConstraints;
	}
	
	
}
