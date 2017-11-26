package br.edu.univas.tp4.petshop.button;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.edu.univas.tp4.petshop.listener.RelatorioListener;

public class RelatorioButton extends JPanel{

	private static final long serialVersionUID = -5520078491379193139L;
	
	private JButton relatorioProdutosButton;
	private JButton relatorioVendasButton;
	private JButton voltarButton;
	
	private GridBagConstraints relatorioProdutosButtonConstraints;
	private GridBagConstraints relatorioVendasButtonConstraints;
	private GridBagConstraints voltarButtonConstraints;
	
	private ArrayList<RelatorioListener> listeners = new ArrayList<>();
	
	public RelatorioButton() {
		initialize();
	}
	
	public void initialize(){
		setLayout(new GridBagLayout());
		add(getRelatorioProdutosButton(),getRelatorioProdutosButtonConstraints());
		add(getVendasProdutosButton(),getVendasProdutosButtonConstraints());
		add(getVoltarButton(),getVoltarButtonConstraints());
	}
	
	/*================== GETTERS =============================*/
	private JButton getRelatorioProdutosButton() {
		if(relatorioProdutosButton == null){
			relatorioProdutosButton = new JButton();
			relatorioProdutosButton.setPreferredSize(new Dimension(110, 30));
			relatorioProdutosButton.setText("Produtos");
			relatorioProdutosButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					relatorioProdutosClicked();
					
				}
			});
		}
		return relatorioProdutosButton;
	}

	private JButton getVendasProdutosButton() {
		if(relatorioVendasButton == null){
			relatorioVendasButton = new JButton();
			relatorioVendasButton.setPreferredSize(new Dimension(110, 30));
			relatorioVendasButton.setText("Vendas");
			relatorioVendasButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					relatorioVendasClicked();
					
				}
			});
		}
		return relatorioVendasButton;
	}

	private JButton getVoltarButton() {
		if(voltarButton == null){
			voltarButton = new JButton();
			voltarButton.setPreferredSize(new Dimension(110, 30));
			voltarButton.setText("Voltar");
			voltarButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					voltarClicked();
					
				}
			});
		}
		return voltarButton;
	}

	private GridBagConstraints getRelatorioProdutosButtonConstraints() {
		if(relatorioProdutosButtonConstraints == null){
			relatorioProdutosButtonConstraints = new GridBagConstraints();
			relatorioProdutosButtonConstraints.gridx = 0;
			relatorioProdutosButtonConstraints.gridy = 0;
			relatorioProdutosButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return relatorioProdutosButtonConstraints;
	}

	private GridBagConstraints getVendasProdutosButtonConstraints() {
		if(relatorioVendasButtonConstraints == null){
			relatorioVendasButtonConstraints = new GridBagConstraints();
			relatorioVendasButtonConstraints.gridx = 0;
			relatorioVendasButtonConstraints.gridy = 1;
			relatorioVendasButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return relatorioVendasButtonConstraints;
	}

	private GridBagConstraints getVoltarButtonConstraints() {
		if(voltarButtonConstraints == null){
			voltarButtonConstraints = new GridBagConstraints();
			voltarButtonConstraints.gridx = 0;
			voltarButtonConstraints.gridy = 2;
			voltarButtonConstraints.insets = new Insets(5, 5, 5, 5);
		}
		return voltarButtonConstraints;
	}
	
	/*========================= CLICKED ====================*/
	public void adddButtonListener(RelatorioListener listener){
		listeners.add(listener);
	}
	
	private void relatorioProdutosClicked(){
		for(RelatorioListener listener : listeners){
			listener.relatorioProdutoPerformed();
		}
	}
	
	private void relatorioVendasClicked(){
		for(RelatorioListener listener : listeners){
			listener.relatorioVendaPerformed();
		}
	}
	
	private void voltarClicked(){
		for(RelatorioListener listener : listeners){
			listener.voltarPerformed();
		}
	}


}
