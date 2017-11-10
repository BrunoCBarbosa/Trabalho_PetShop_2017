package br.edu.univas.tp4.petshop.panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipalPanel extends JPanel{

	private static final long serialVersionUID = -8717994160775895401L;
	
	private JLabel titulo;
	
	public TelaPrincipalPanel(){
		initialize();
	}
	
	private void initialize(){
		add(getTitulo());
	}

	private JLabel getTitulo() {
		if(titulo == null){
			titulo = new JLabel();
			titulo.setText("Petshop");
		}
		return titulo;
	}
	
	
	
	

}
