	package br.edu.univas.tp4.petshop.panel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TabelaProdutosPanel extends JPanel{

	private static final long serialVersionUID = -8056650082489084930L;
	
	private JTable tabelaProdutos;
	private JScrollPane scrollPane;
	
	/*==================== CONSTRUTOR ===========================*/
	public TabelaProdutosPanel(){
		initialize();
	}
	
	/*====================== ADDS ====================*/
	public void initialize(){
		setLayout(new FlowLayout());
		
		add(getScrollPane());
	}
	
	/*========================= TABELA =====================*/
	Object [] colunasProduto = {"Código", "Nome", "Quantidade", "Preço(R$)"};
	Object [][] dados = {
			{20, "Coleira", 2, "30,00"},
			{30, "Ração", 1, "100,00"},
			{100, "Focinheira", 1, "50,00"}
	};

	public JTable getTabelaProdutos() {
		if(tabelaProdutos == null){
			tabelaProdutos = new JTable(dados,colunasProduto);
		}
		return tabelaProdutos;
	}

	public JScrollPane getScrollPane() {
		if(scrollPane == null){
			scrollPane = new JScrollPane(getTabelaProdutos());
			scrollPane.setPreferredSize(new Dimension(670, 400));
		}
		return scrollPane;
	}
	
	
}
