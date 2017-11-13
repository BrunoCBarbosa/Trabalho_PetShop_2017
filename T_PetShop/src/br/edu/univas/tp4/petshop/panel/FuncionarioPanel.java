package br.edu.univas.tp4.petshop.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FuncionarioPanel extends JPanel{

	private static final long serialVersionUID = -6058861442964608498L;
	
	private JLabel titulo;
	
	public FuncionarioPanel() {
		initialize();
	}
	
	public void initialize(){
		
	}
	
	private JLabel getTitulo(){
		if(titulo == null){
			titulo = new JLabel();
			titulo.setText("Tela Funcionários");
		}
		return titulo;
	}
}
