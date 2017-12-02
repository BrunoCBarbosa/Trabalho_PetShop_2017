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

import br.edu.univas.tp4.petshop.model.ProdutoTO;

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
	private JLabel labelValorBruto;
	private JTextField textValorBruto;
	private JLabel labelValorVenda;
	private JTextField textValorVenda;
	
	private JScrollPane scroll;
	
	private GridBagConstraints labelCodConstraints;
	private GridBagConstraints textCodConstraints;
	private GridBagConstraints labelNomeConstraints;
	private GridBagConstraints textNomeConstraints;
	private GridBagConstraints labelDescConstraints;
	private GridBagConstraints textDesConstraints;
	private GridBagConstraints labelQuantConstraints;
	private GridBagConstraints textQuantConstraints;
	private GridBagConstraints labelValorBrutoConstraints;
	private GridBagConstraints textCompraConstraints;
	private GridBagConstraints labelValorVendaConstraints;
	private GridBagConstraints textValorVendaConstraints;
	
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
	public JLabel getLabelCod() {
		if(labelCod == null){
			labelCod = new JLabel();
			labelCod.setText("Código");
		}
		return labelCod;
	}

	public JTextField getTextCod() {
		if(textCod == null){
			textCod = new JTextField();
			textCod.setColumns(20);
		}
		return textCod;
	}

	public  JLabel getLabelNome() {
		if(labelNome == null){
			labelNome = new JLabel();
			labelNome.setText("Nome");
		}
		return labelNome;
	}

	public  JTextField getTextNome() {
		if(textNome == null){
			textNome = new JTextField();
			textNome.setColumns(20);
		}
		return textNome;
	}

	public  JLabel getLabelDesc() {
		if(labelDesc == null){
			labelDesc = new JLabel();
			labelDesc.setText("Descrição");
		}
		return labelDesc;
	}

	public  JTextArea getTextDesc() {
		if(textDesc == null){
			textDesc = new JTextArea();
		}
		return textDesc;
	}
	
	public  JScrollPane getScrollPane(){
		if(scroll == null){
			scroll = new JScrollPane(getTextDesc());
			scroll.setPreferredSize(new Dimension(70, 100));
		}
		return scroll;
	}

	public  JLabel getLabelQuant() {
		if(labelQuant == null){
			labelQuant= new JLabel();
			labelQuant.setText("Quantidade");
		}
		return labelQuant;
	}

	public  JTextField getTextQuant() {
		if(textQuant == null){
			textQuant = new JTextField();
			textQuant.setColumns(20);
		}
		return textQuant;
	}

	public  JLabel getLabelCompra() {
		if(labelValorBruto == null){
			labelValorBruto = new JLabel();
			labelValorBruto.setText("Preço de Compra(R$)");
		}
		return labelValorBruto;
	}

	public  JTextField getTextCompra() {
		if(textValorBruto == null){
			textValorBruto = new JTextField();
			textValorBruto.setColumns(20);
		}
		return textValorBruto;
	}

	public  JLabel getLabelVenda() {
		if(labelValorVenda == null){
			labelValorVenda = new JLabel();
			labelValorVenda.setText("Preço de Venda(R$)");
		}
		return labelValorVenda;
	}

	public  JTextField getTextVenda() {
		if(textValorVenda == null){
			textValorVenda = new JTextField();
			textValorVenda.setColumns(20);
		}
		return textValorVenda;
	}

	public  GridBagConstraints getLabelCodConstraints() {
		if(labelCodConstraints == null){
			labelCodConstraints = new GridBagConstraints();
			labelCodConstraints.gridx = 0;
			labelCodConstraints.gridy = 0;
			labelCodConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelCodConstraints;
	}

	public  GridBagConstraints getTextCodConstraints() {
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

	public  GridBagConstraints getLabelNomeConstraints() {
		if(labelNomeConstraints == null){
			labelNomeConstraints = new GridBagConstraints();
			labelNomeConstraints.gridx = 0;
			labelNomeConstraints.gridy = 1;
			labelNomeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelNomeConstraints;
	}

	public  GridBagConstraints getTextNomeConstraints() {
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

	public GridBagConstraints getLabelDescConstraints() {
		if(labelDescConstraints == null){
			labelDescConstraints = new GridBagConstraints();
			labelDescConstraints.gridx = 0;
			labelDescConstraints.gridy = 2;
			labelDescConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelDescConstraints;
	}

	public  GridBagConstraints getTextDesConstraints() {
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

	public  GridBagConstraints getLabelQuantConstraints() {
		if(labelQuantConstraints == null){
			labelQuantConstraints = new GridBagConstraints();
			labelQuantConstraints.gridx = 0;
			labelQuantConstraints.gridy = 3;
			labelQuantConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelQuantConstraints;
	}

	public  GridBagConstraints getTextQuantConstraints() {
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

	public  GridBagConstraints getLabelCompraConstraints() {
		if(labelValorBrutoConstraints == null){
			labelValorBrutoConstraints = new GridBagConstraints();
			labelValorBrutoConstraints.gridx = 0;
			labelValorBrutoConstraints.gridy = 4;
			labelValorBrutoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelValorBrutoConstraints;
	}

	public  GridBagConstraints getTextCompraConstraints() {
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

	public  GridBagConstraints getLabelVendaConstraints() {
		if(labelValorVendaConstraints == null){
			labelValorVendaConstraints = new GridBagConstraints();
			labelValorVendaConstraints.gridx = 0;
			labelValorVendaConstraints.gridy = 5;
			labelValorVendaConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelValorVendaConstraints;
	}

	public  GridBagConstraints getTextVendaConstraints() {
		if(textValorVendaConstraints == null){
			textValorVendaConstraints = new GridBagConstraints();
			textValorVendaConstraints.gridx = 1;
			textValorVendaConstraints.gridy = 5;
			textValorVendaConstraints.ipadx = 100;
			textValorVendaConstraints.weightx = 1.0;
		}
		return textValorVendaConstraints;
	}
	
	public ProdutoTO getProduto(){
		ProdutoTO produto = new ProdutoTO();
		produto.setCodigo(Integer.parseInt(getTextCod().getText()));
		produto.setNome(getTextNome().getText());
		produto.setDescricao(getTextDesc().getText());
		produto.setQuantidade(Integer.parseInt(getTextQuant().getText()));
		produto.setValorBruto(Float.parseFloat(getTextCompra().getText()));
		produto.setValorVenda(Float.parseFloat(getTextVenda().getText()));
		return produto;
	}
	
}
