package br.edu.univas.tp4.petshop.panel;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RelatorioVendasTabela extends JPanel{

	private static final long serialVersionUID = -7631341575504482367L;
	
	private JTable tabelaVendasRealizadas;
	private JScrollPane scrollPaneVendasRealizadas;
	private JTable tabelaDetalheVendas;
	private JScrollPane scrollPaneDetalhesVendas;
	
	
	/*===================== CONSTRUTOR ===================*/
	public RelatorioVendasTabela(){
		initialize();
	}
	
	/*======================== ADDS =======================*/
	public void initialize(){
		setLayout(new FlowLayout());
		
		add(getScrollPaneVendasRealizadas());
		add(getScrollPaneDetalhesVendas());
	}
	
	/*======================= TABELA ========================*/
	Object [] colunasVendasRealizadas = {"Data da Venda","Valor da Venda"};
	Object [][] dadosVendasRealizadas = {
	};
	
	Object [] colunasProdutos = {"Código", "Nome", "Quantidade", "Preço(R$)"};
	Object [][] dadosProdutos = {
	};

	private JTable getTabelaVendasRealizada() {
		if(tabelaVendasRealizadas == null){
			tabelaVendasRealizadas = new JTable(dadosVendasRealizadas,colunasVendasRealizadas);
		}
		return tabelaVendasRealizadas;
	}

	private JScrollPane getScrollPaneVendasRealizadas() {
		if(scrollPaneVendasRealizadas == null){
			scrollPaneVendasRealizadas = new JScrollPane(getTabelaVendasRealizada());
			scrollPaneVendasRealizadas.setPreferredSize(new Dimension(670, 200));
		}
		return scrollPaneVendasRealizadas;
	}

	private JTable getTabelaDetalheVendas() {
		if(tabelaDetalheVendas == null){
			tabelaDetalheVendas = new JTable(dadosProdutos,colunasProdutos);
		}
		return tabelaDetalheVendas;
	}

	private JScrollPane getScrollPaneDetalhesVendas() {
		if(scrollPaneDetalhesVendas == null){
			scrollPaneDetalhesVendas = new JScrollPane(getTabelaDetalheVendas());
			scrollPaneDetalhesVendas.setPreferredSize(new Dimension(670, 200));
		}
		return scrollPaneDetalhesVendas;
	}
	
	
	
	
	
}
