package br.edu.univas.tp4.petshop.panel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastroProdutoPanel extends JPanel {

	private static final long serialVersionUID = 2906081987222262723L;
	
	/*======================= DECLARAÇÕES =======================*/
	private JLabel labelCod;
	private JTextField textCod;
	private JLabel labelNome;
	private JTextField textNome;
	private JLabel labelDesc;
	private JTextArea textDesc;
	private JLabel labelQuant;
	private JTextField textQuant;
	private JLabel labelCompra;
	private JTextField textCompra;
	private JLabel labelVenda;
	private JTextField textVenda;
	
	private JScrollPane scroll;
	
	private GridBagConstraints labelCodConstraints;
	private GridBagConstraints textCodConstraints;
	private GridBagConstraints labelNomeConstraints;
	private GridBagConstraints textNomeConstraints;
	private GridBagConstraints labelDescConstraints;
	private GridBagConstraints textDesConstraints;
	private GridBagConstraints labelQuantConstraints;
	private GridBagConstraints textQuantConstraints;
	private GridBagConstraints labelCompraConstraints;
	private GridBagConstraints textCompraConstraints;
	private GridBagConstraints labelVendaConstraints;
	private GridBagConstraints textVendaConstraints;
	
	/*========================== CONSTRUTOR==================*/
	public CadastroProdutoPanel(){
		initialize();
	}
	
	/*==================== ADDS ============================*/
	private void initialize(){
		setLayout(new GridBagLayout());
		
		add(getLabelCod(),getLabelCodConstraints());
		add(getTextCod(), getTextCodConstraints());
		add(getLabelNome(), getLabelNomeConstraints());
		add(getTextNome(), getTextNomeConstraints());
		add(getLabelDesc(), getLabelDescConstraints());
		add(getScrollPane(), getTextDesConstraints());
		add(getLabelQuant(), getLabelQuantConstraints());
		add(getTextQuant(), getTextQuantConstraints());
		add(getLabelCompra(), getLabelCompraConstraints());
		add(getTextCompra(), getTextCompraConstraints());
		add(getLabelVenda(), getLabelVendaConstraints());
		add(getTextVenda(), getTextVendaConstraints());
	}

	/*===================== GETTERS =======================*/
	private JLabel getLabelCod() {
		if(labelCod == null){
			labelCod = new JLabel();
			labelCod.setText("Código");
		}
		return labelCod;
	}

	private JTextField getTextCod() {
		if(textCod == null){
			textCod = new JTextField();
			textCod.setColumns(20);
		}
		return textCod;
	}

	private JLabel getLabelNome() {
		if(labelNome == null){
			labelNome = new JLabel();
			labelNome.setText("Nome");
		}
		return labelNome;
	}

	private JTextField getTextNome() {
		if(textNome == null){
			textNome = new JTextField();
			textNome.setColumns(20);
		}
		return textNome;
	}

	private JLabel getLabelDesc() {
		if(labelDesc == null){
			labelDesc = new JLabel();
			labelDesc.setText("Descrição");
		}
		return labelDesc;
	}

	private JTextArea getTextDesc() {
		if(textDesc == null){
			textDesc = new JTextArea();
		}
		return textDesc;
	}
	
	private JScrollPane getScrollPane(){
		if(scroll == null){
			scroll = new JScrollPane(getTextDesc());
			scroll.setPreferredSize(new Dimension(70, 100));
		}
		return scroll;
	}

	private JLabel getLabelQuant() {
		if(labelQuant == null){
			labelQuant= new JLabel();
			labelQuant.setText("Quantidade");
		}
		return labelQuant;
	}

	private JTextField getTextQuant() {
		if(textQuant == null){
			textQuant = new JTextField();
			textQuant.setColumns(20);
		}
		return textQuant;
	}

	private JLabel getLabelCompra() {
		if(labelCompra == null){
			labelCompra = new JLabel();
			labelCompra.setText("Preço de Compra(R$)");
		}
		return labelCompra;
	}

	private JTextField getTextCompra() {
		if(textCompra == null){
			textCompra = new JTextField();
			textCompra.setColumns(20);
		}
		return textCompra;
	}

	private JLabel getLabelVenda() {
		if(labelVenda == null){
			labelVenda = new JLabel();
			labelVenda.setText("Preço de Venda(R$)");
		}
		return labelVenda;
	}

	private JTextField getTextVenda() {
		if(textVenda == null){
			textVenda = new JTextField();
			textVenda.setColumns(20);
		}
		return textVenda;
	}

	private GridBagConstraints getLabelCodConstraints() {
		if(labelCodConstraints == null){
			labelCodConstraints = new GridBagConstraints();
			labelCodConstraints.gridx = 0;
			labelCodConstraints.gridy = 0;
			labelCodConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelCodConstraints;
	}

	private GridBagConstraints getTextCodConstraints() {
		if(textCodConstraints == null){
			textCodConstraints = new GridBagConstraints();
			textCodConstraints.gridx = 1;
			textCodConstraints.gridy = 0;
			textCodConstraints.ipadx = 100;
			textCodConstraints.weightx = 1.0;
			textCodConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textCodConstraints;
	}

	private GridBagConstraints getLabelNomeConstraints() {
		if(labelNomeConstraints == null){
			labelNomeConstraints = new GridBagConstraints();
			labelNomeConstraints.gridx = 0;
			labelNomeConstraints.gridy = 1;
			labelNomeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelNomeConstraints;
	}

	private GridBagConstraints getTextNomeConstraints() {
		if(textNomeConstraints == null){
			textNomeConstraints = new GridBagConstraints();
			textNomeConstraints.gridx = 1;
			textNomeConstraints.gridy = 1;
			textNomeConstraints.ipadx = 100;
			textNomeConstraints.weightx = 1.0;
			textNomeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textNomeConstraints;
	}

	private GridBagConstraints getLabelDescConstraints() {
		if(labelDescConstraints == null){
			labelDescConstraints = new GridBagConstraints();
			labelDescConstraints.gridx = 0;
			labelDescConstraints.gridy = 2;
			labelDescConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelDescConstraints;
	}

	private GridBagConstraints getTextDesConstraints() {
		if(textDesConstraints == null){
			textDesConstraints = new GridBagConstraints();
			textDesConstraints.gridx = 1;
			textDesConstraints.gridy = 2;
			textDesConstraints.ipadx = 100;
			textDesConstraints.weightx = 1.0;
			textDesConstraints.insets = new Insets(15, 15, 15, 150);
		}
		return textDesConstraints;
	}

	private GridBagConstraints getLabelQuantConstraints() {
		if(labelQuantConstraints == null){
			labelQuantConstraints = new GridBagConstraints();
			labelQuantConstraints.gridx = 0;
			labelQuantConstraints.gridy = 3;
			labelQuantConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelQuantConstraints;
	}

	private GridBagConstraints getTextQuantConstraints() {
		if(textQuantConstraints == null){
			textQuantConstraints  = new GridBagConstraints();
			textQuantConstraints .gridx = 1;
			textQuantConstraints .gridy = 3;
			textQuantConstraints .ipadx = 100;
			textQuantConstraints .weightx = 1.0;
			textQuantConstraints .insets = new Insets(15, 15, 15, 15);
		}
		return textQuantConstraints ;
	}

	private GridBagConstraints getLabelCompraConstraints() {
		if(labelCompraConstraints == null){
			labelCompraConstraints = new GridBagConstraints();
			labelCompraConstraints.gridx = 0;
			labelCompraConstraints.gridy = 4;
			labelCompraConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelCompraConstraints;
	}

	private GridBagConstraints getTextCompraConstraints() {
		if(textCompraConstraints == null){
			textCompraConstraints = new GridBagConstraints();
			textCompraConstraints.gridx = 1;
			textCompraConstraints.gridy = 4;
			textCompraConstraints.ipadx = 100;
			textCompraConstraints.weightx = 1.0;
			textCompraConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textCompraConstraints;
	}

	private GridBagConstraints getLabelVendaConstraints() {
		if(labelVendaConstraints == null){
			labelVendaConstraints = new GridBagConstraints();
			labelVendaConstraints.gridx = 0;
			labelVendaConstraints.gridy = 5;
			labelVendaConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelVendaConstraints;
	}

	private GridBagConstraints getTextVendaConstraints() {
		if(textVendaConstraints == null){
			textVendaConstraints = new GridBagConstraints();
			textVendaConstraints.gridx = 1;
			textVendaConstraints.gridy = 5;
			textVendaConstraints.ipadx = 100;
			textVendaConstraints.weightx = 1.0;
		}
		return textVendaConstraints;
	}
	
}
