package br.edu.univas.tp4.petshop.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProdutoPanel extends JPanel{
	
	private static final long serialVersionUID = -3529081977165109569L;
	
	private JLabel titulo;
	
	public ProdutoPanel() {
		initialize();
	}

	public void initialize(){
		add(getTitulo());
	}
	
	private JLabel getTitulo(){
		if(titulo == null){
			titulo = new JLabel();
			titulo.setText("Tela Produtos");
		}
		return titulo;
	}

}
