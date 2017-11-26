package br.edu.univas.tp4.petshop.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class RelatorioPanel extends JPanel{

	private static final long serialVersionUID = -466023513751724359L;
	
private JLabel titulo;
	
	public RelatorioPanel() {
		initialize();
	}

	public void initialize(){
		add(getTitulo());
	}
	
	private JLabel getTitulo(){
		if(titulo == null){
			titulo = new JLabel();
			titulo.setText("Tela Relatórios");
		}
		return titulo;
	}
}
