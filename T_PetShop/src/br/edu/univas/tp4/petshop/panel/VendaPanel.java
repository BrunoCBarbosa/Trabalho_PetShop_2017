package br.edu.univas.tp4.petshop.panel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JLabel precoTotalLabel;
	private JTextField precoTotalText;
	private JLabel dinheiroLabel;
	private JTextField dinheiroText;
	private JLabel trocoLabel;
	private JTextField trocoText;
	private JButton pagarButton;
	private JButton cancelarButton;
	
	private GridBagConstraints produtoLabelConstraints;
	private GridBagConstraints comboBoxConstraints;
	private GridBagConstraints quantidadeLabelConstraints;
	private GridBagConstraints quantidadeTextConstraints;
	private GridBagConstraints incluirButtonConstraints;
	private GridBagConstraints retirarButtonConstraints;
	private GridBagConstraints precoTotalLabelConstraints;
	private GridBagConstraints precoTotalTextConstraints;
	private GridBagConstraints dinheiroLabelConstraints;
	private GridBagConstraints dinheiroTextConstraints;
	private GridBagConstraints trocoLabelConstraints;
	private GridBagConstraints trocoTextConstraints;
	private GridBagConstraints pagarButtonConstraints;
	private GridBagConstraints cancelarButtonConstraints;
	
	private ArrayList<VendaListener> listeners = new ArrayList<>();
	
	/*====================== CONSTRUTOR ==========================*/
	public VendaPanel(){
		initialize();
	}
	
	/*========================= ADDS ==============================*/
	private void initialize(){
		setLayout(new GridBagLayout());
		
		add(getProdutoLabel(),getProdutoLabelConstraints());
		add(getComboBox(),getComboBoxConstraints());
		add(getQuantidadeLabel(),getQuantidadeLabelConstraints());
		add(getQuantidadeText(), getQuantidadeTextConstraints());
		add(getIncluirButton(),getIncluirButtonConstraints());
		add(getRetirarButton(),getRetirarButtonConstraints());
		add(getCancelarButton(), getCancelarButtonConstraints());
		add(getPrecoTotalLabel(), getPrecoTotalLabelConstraints());
		add(getPrecoTotalText(), getPrecoTotalTextConstraints());
		add(getDinheiroLabel(), getDinheiroLabelConstraints());
		add(getDinheiroText(), getDinheiroTextConstraints());
		add(getTrocoLabel(), getTrocoLabelConstraints());
		add(getTrocoText(), getTrocoTextConstraints());
		add(getPagarButton(), getPagarButtonConstraints());
	}

	/*======================= GETTERS ============================*/
	private JLabel getProdutoLabel() {
		if(produtoLabel == null){
			produtoLabel = new JLabel();
			produtoLabel.setText("Produto");
		}
		return produtoLabel;
	}

	private JComboBox<String> getComboBox() {
		if(comboBox == null){
			comboBox = new JComboBox<>();
		}
		return comboBox;
	}

	private JLabel getQuantidadeLabel() {
		if(quantidadeLabel == null){
			quantidadeLabel = new JLabel();
			quantidadeLabel.setText("Quantidade");
		}
		return quantidadeLabel;
	}

	private JTextField getQuantidadeText() {
		if(quantidadeText == null){
			quantidadeText = new JTextField();
			quantidadeText.setColumns(5);
		}
		return quantidadeText;
	}

	private JButton getIncluirButton() {
		if(incluirButton == null){
			incluirButton = new JButton();
			incluirButton.setText("Incluir");
			incluirButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					incluirClicked();
					
				}
			});
		}
		return incluirButton;
	}

	private JButton getRetirarButton() {
		if(retirarButton == null){
			retirarButton = new JButton();
			retirarButton.setText("Retirar");
			retirarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					retirarClicked();
				}
			});
		}
		return retirarButton;
	}
	
	

	private JLabel getPrecoTotalLabel() {
		if(precoTotalLabel == null){
			precoTotalLabel = new JLabel();
			precoTotalLabel.setText("Preço Total");
		}
		return precoTotalLabel;
	}

	private JTextField getPrecoTotalText() {
		if(precoTotalText == null){
			precoTotalText = new JTextField();
			precoTotalText.setColumns(5);
		}
		return precoTotalText;
	}

	private JLabel getDinheiroLabel() {
		if(dinheiroLabel == null){
			dinheiroLabel = new JLabel();
			dinheiroLabel.setText("Dinheiro");
		}
		return dinheiroLabel;
	}

	private JTextField getDinheiroText() {
		if(dinheiroText == null){
			dinheiroText = new JTextField();
			dinheiroText.setColumns(5);
		}
		return dinheiroText;
	}

	private JLabel getTrocoLabel() {
		if(trocoLabel == null){
			trocoLabel = new JLabel();
			trocoLabel.setText("Troco");
		}
		return trocoLabel;
	}

	private JTextField getTrocoText() {
		if(trocoText == null){
			trocoText = new JTextField();
			trocoText.setColumns(5);
		}
		return trocoText;
	}

	private JButton getPagarButton() {
		if(pagarButton == null){
			pagarButton = new JButton();
			pagarButton.setText("Pagar");
			pagarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					pagarClicked();
					
				}
			});
		}
		return pagarButton;
	}
	
	private JButton getCancelarButton(){
		if(cancelarButton == null){
			cancelarButton = new JButton();
			cancelarButton.setText("Cancelar");
			cancelarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cancelarClicked();
					
				}
			});
		}
		return cancelarButton;
	}

	private GridBagConstraints getProdutoLabelConstraints() {
		if(produtoLabelConstraints == null){
			produtoLabelConstraints = new GridBagConstraints();
			produtoLabelConstraints.gridx = 0;
			produtoLabelConstraints.gridy = 0;
			produtoLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return produtoLabelConstraints;
	}

	private GridBagConstraints getComboBoxConstraints() {
		if(comboBoxConstraints == null){
			comboBoxConstraints = new GridBagConstraints();
			comboBoxConstraints.gridx = 1;
			comboBoxConstraints.gridy = 0;
			comboBoxConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return comboBoxConstraints;
	}

	private GridBagConstraints getQuantidadeLabelConstraints() {
		if(quantidadeLabelConstraints == null){
			quantidadeLabelConstraints = new GridBagConstraints();
			quantidadeLabelConstraints.gridx = 0;
			quantidadeLabelConstraints.gridy = 1;
			quantidadeLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return quantidadeLabelConstraints;
	}

	private GridBagConstraints getQuantidadeTextConstraints() {
		if(quantidadeTextConstraints == null){
			quantidadeTextConstraints = new GridBagConstraints();
			quantidadeTextConstraints.gridx = 1;
			quantidadeTextConstraints.gridy = 1;
			quantidadeTextConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return quantidadeTextConstraints;
	}

	private GridBagConstraints getIncluirButtonConstraints() {
		if(incluirButtonConstraints == null){
			incluirButtonConstraints = new GridBagConstraints();
			incluirButtonConstraints.gridx = 2;
			incluirButtonConstraints.gridy = 1;
			incluirButtonConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return incluirButtonConstraints;
	}

	private GridBagConstraints getRetirarButtonConstraints() {
		if(retirarButtonConstraints == null){
			retirarButtonConstraints = new GridBagConstraints();
			retirarButtonConstraints.gridx = 3;
			retirarButtonConstraints.gridy = 1;
			retirarButtonConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return retirarButtonConstraints;
	}
	
	
	
	private GridBagConstraints getPrecoTotalLabelConstraints() {
		if(precoTotalLabelConstraints == null){
			precoTotalLabelConstraints = new GridBagConstraints();
			precoTotalLabelConstraints.gridx = 0;
			precoTotalLabelConstraints.gridy = 2;
			precoTotalLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return precoTotalLabelConstraints;
	}

	private GridBagConstraints getPrecoTotalTextConstraints() {
		if(precoTotalTextConstraints == null){
			precoTotalTextConstraints = new GridBagConstraints();
			precoTotalTextConstraints.gridx = 1;
			precoTotalTextConstraints.gridy = 2;
			precoTotalTextConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return precoTotalTextConstraints;
	}

	private GridBagConstraints getDinheiroLabelConstraints() {
		if(dinheiroLabelConstraints == null){
			dinheiroLabelConstraints = new GridBagConstraints();
			dinheiroLabelConstraints.gridx = 2;
			dinheiroLabelConstraints.gridy = 2;
			dinheiroLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return dinheiroLabelConstraints;
	}

	private GridBagConstraints getDinheiroTextConstraints() {
		if(dinheiroTextConstraints == null){
			dinheiroTextConstraints = new GridBagConstraints();
			dinheiroTextConstraints.gridx = 3;
			dinheiroTextConstraints.gridy = 2;
			dinheiroTextConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return dinheiroTextConstraints;
	}

	private GridBagConstraints getTrocoLabelConstraints() {
		if(trocoLabelConstraints == null){
			trocoLabelConstraints = new GridBagConstraints();
			trocoLabelConstraints.gridx = 4;
			trocoLabelConstraints.gridy = 2;
			trocoLabelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return trocoLabelConstraints;
	}

	private GridBagConstraints getTrocoTextConstraints() {
		if(trocoTextConstraints == null){
			trocoTextConstraints = new GridBagConstraints();
			trocoTextConstraints.gridx = 5;
			trocoTextConstraints.gridy = 2;
			trocoTextConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return trocoTextConstraints;
	}

	private GridBagConstraints getPagarButtonConstraints() {
		if(pagarButtonConstraints == null){
			pagarButtonConstraints = new GridBagConstraints();
			pagarButtonConstraints.gridx = 6;
			pagarButtonConstraints.gridy = 2;
			pagarButtonConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return pagarButtonConstraints;
	}
	
	private GridBagConstraints getCancelarButtonConstraints(){
		if(cancelarButtonConstraints == null){
			cancelarButtonConstraints = new GridBagConstraints();
			cancelarButtonConstraints.gridx = 4;
			cancelarButtonConstraints.gridy = 1;
			cancelarButtonConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return cancelarButtonConstraints;
	}

	/*======================= LISTENERS ====================*/
	private void incluirClicked(){
		for(VendaListener listener : listeners){
			listener.incluirPerformed();
		}
	}
		
	private void retirarClicked(){
		for(VendaListener listener : listeners){
			listener.retirarPerformed();
		}
	}
	
	private void pagarClicked(){
		for(VendaListener listener : listeners){
			listener.pagarPerformed();
		}
	}
	
	private void cancelarClicked(){
		for(VendaListener listener : listeners){
			listener.cancelarPerformed();
		}
	}
}
