package br.edu.univas.tp4.petshop.panel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.tp4.petshop.model.ProdutoDAO;
import br.edu.univas.tp4.petshop.model.ProdutoException;
import br.edu.univas.tp4.petshop.model.ProdutoTO;

public class VerProdutoPanel extends JPanel{

	private static final long serialVersionUID = -5770020735112308663L;
	
	private JTable tableProduto;
	private JScrollPane produtoScrollPane;
	
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public VerProdutoPanel(){
		initialize();
		
	}
	
	public void initialize(){
		setLayout(new FlowLayout());
		add(getTableProduto());
		add(getProdutoScrollPane());
	}
	
	/*======================= GETTERS ==========================*/
	public JTable getTableProduto() {
		if(tableProduto == null){
			DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Codigo","Nome","Descricao","Quantidade","Valor Bruto","Valor de Venda"});
			tableProduto = new JTable(modelo);
			Object[] dados = new Object[6];
			
			try {
				ArrayList<ProdutoTO> listaProduto = produtoDAO.listarProduto();
				for(ProdutoTO to : listaProduto){
					dados[0] = to.getCodigo();
					dados[1] = to.getNome();
					dados[2] = to.getDescricao();
					dados[3] = to.getQuantidade();
					dados[4] = to.getValorBruto();
					dados[5] = to.getValorVenda();
					modelo.addRow(dados);
				}
			} catch (ProdutoException e) {
				System.out.println("Erro ao apresentar a lista de produtos.");
				e.printStackTrace();
			}
		}
		return tableProduto;
	}

	public JScrollPane getProdutoScrollPane() {
		if(produtoScrollPane == null){
			produtoScrollPane = new JScrollPane(tableProduto);
			produtoScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			produtoScrollPane.setPreferredSize(new Dimension(670, 355));
		}
		return produtoScrollPane;
	}
	
	

}
