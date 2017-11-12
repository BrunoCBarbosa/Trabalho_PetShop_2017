package br.edu.univas.tp4.petshop.panel;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.edu.univas.tp4.petshop.listener.GerarRelat�rioListener;

public class RelatorioProdutosPanel extends JPanel{

	private static final long serialVersionUID = -7672158295028659296L;
	
	private JLabel pesquisaLabel;
	private JComboBox<String> comboBox;
	private JButton gerarRelatorioButton;
	private JButton cancelarButton;
	
	private GridBagConstraints pesquisaLabelConstraints;
	private GridBagConstraints comboBoxConstraints;
	private GridBagConstraints gerarRelatorioButtonConstraints;
	private GridBagConstraints cancelarButtonConstraints;
	
	private ArrayList<GerarRelat�rioListener> listeners = new ArrayList<>();
	
	/*========================== CONSTRUTOR =====================*/
	public RelatorioProdutosPanel(){
		initialize();
	}
	
	/*========================= ADDS ======================*/
	private void initialize(){
		setLayout(new FlowLayout());
		
		add(getPesquisaLabel(), getPesquisaLabelConstraints());
		add(getComboBox(), getComboBoxConstraints());
		add(getGerarRelatorioButton(), getGerarRelatorioButtonConstraints());
		add(getCancelarButton(), getCancelarButtonConstraints());
	}
	
	/*=========================== GETTERS =====================*/
	private JLabel getPesquisaLabel() {
		if(pesquisaLabel == null){
			pesquisaLabel = new JLabel();
			pesquisaLabel.setText("Tipo de pesquisa");
		}
		return pesquisaLabel;
	}

	private JComboBox<String> getComboBox() {
		if(comboBox == null){
			comboBox = new JComboBox<>();
			comboBox.addItem("C�digo");
			comboBox.addItem("Nome");
			comboBox.addItem("Quantidade");
			comboBox.addItem("Pre�o");
		}
		return comboBox;
	}

	private JButton getGerarRelatorioButton() {
		if(gerarRelatorioButton == null){
			gerarRelatorioButton = new JButton();
			gerarRelatorioButton.setText("Gerar Relat�rio");
		}
		return gerarRelatorioButton;
	}

	private JButton getCancelarButton() {
		if(cancelarButton == null){
			cancelarButton = new JButton();
			cancelarButton.setText("Cancelar");
		}
		return cancelarButton;
	}

	private GridBagConstraints getPesquisaLabelConstraints() {
		
		return pesquisaLabelConstraints;
	}

	private GridBagConstraints getComboBoxConstraints() {
		return comboBoxConstraints;
	}

	private GridBagConstraints getGerarRelatorioButtonConstraints() {
		return gerarRelatorioButtonConstraints;
	}

	private GridBagConstraints getCancelarButtonConstraints() {
		return cancelarButtonConstraints;
	}
	
	/*======================== LISTENERS =======================*/
	public void addButtonListener(GerarRelat�rioListener listener){
		listeners.add(listener);
	}
	
	private void gerarRelatorioClicked(){
		for (GerarRelat�rioListener listener : listeners){
			listener.gerarRelat�rioPerformed();
		}
	}
	
	private void cancelarClicked(){
		for(GerarRelat�rioListener listener : listeners){
			listener.cancelarPerformed();
		}
	}
}
