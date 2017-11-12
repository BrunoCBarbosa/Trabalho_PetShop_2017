package br.edu.univas.tp4.petshop.panel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import br.edu.univas.tp4.petshop.listener.PesquisarListener;

public class RelatorioVendasPanel extends JPanel{

	private static final long serialVersionUID = 3343588149295476270L;
	
	private JLabel dataLabel;
	private JFormattedTextField dataText;
	private MaskFormatter mask;
	private JButton pesquisarButton;
	private JButton cancelarButton;
	
	private ArrayList<PesquisarListener> listeners = new ArrayList<>();
	
	/*=================== CONSTRUTOR ============================*/
	public RelatorioVendasPanel(){
		initialize();
	}
	
	/*======================= ADDS =============================*/
	private void initialize(){
		setLayout(new FlowLayout());
		
		getMask();
		
		add(getDataLabel());
		add(getDataText());
		add(getPesquisarButton());
		add(getCancelarButton());
	
	}

	private JLabel getDataLabel() {
		if(dataLabel == null){
			dataLabel = new JLabel();
			dataLabel.setText("Informe uma data");
		}
		return dataLabel;
	}

	private JFormattedTextField getDataText() {
		if(dataText == null){
			dataText = new JFormattedTextField(mask);
			dataText.setPreferredSize(new Dimension(70, 20));
		}
		return dataText;
	}

	private MaskFormatter getMask() {
		if(mask == null){
			try{
				mask = new MaskFormatter("##/##/####");
				mask.setPlaceholderCharacter('_');
			}
			catch(ParseException excp){
				System.err.println("Erro na formatação: " + excp.getMessage());
				System.exit(-1);
			}
		}
		return mask;
	}

	private JButton getPesquisarButton() {
		if(pesquisarButton == null){
			pesquisarButton = new JButton();
			pesquisarButton.setText("Pesquisar");
			pesquisarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					pesquisarClicked();
					
				}
			});
		}
		return pesquisarButton;
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
	
	/*==================== LISTENERS ===========================*/
	public void addButtonListener(PesquisarListener listener){
		listeners.add(listener);
	}
	
	private void pesquisarClicked(){
		for(PesquisarListener listener : listeners){
			listener.pesquisarPerformed();
		}
	}
	
	private void cancelarClicked(){
		for(PesquisarListener listener : listeners){
			listener.cancelarPerformed();
		}
	}
	
	
}
