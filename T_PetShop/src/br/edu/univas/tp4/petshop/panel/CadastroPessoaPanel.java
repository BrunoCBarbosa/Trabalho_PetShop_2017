package br.edu.univas.tp4.petshop.panel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.edu.univas.tp4.petshop.model.PessoaDAO;
import br.edu.univas.tp4.petshop.model.PessoaTO;

public class CadastroPessoaPanel extends JPanel{

	private static final long serialVersionUID = -5083485119067419418L;
	
	private JLabel labelNome;
	private JTextField textNome;
	private JLabel labelSexo;
	private JRadioButton buttonMasculino;
	private JRadioButton buttonFeminino;
	private ButtonGroup buttonGroup;
	private String valorRadioButton;
	private JLabel labelCpf;
	private JFormattedTextField textCpf;
	private JLabel labelEndereco;
	private JTextField textEndereco;
	private JLabel labelBairro;
	private JTextField textBairro;
	private JLabel labelCidade;
	private JTextField textCidade;
	private JLabel labelEmail;
	private JTextField textEmail;
	
	private GridBagConstraints labelNomeConstraints;
	private GridBagConstraints textNomeConstraints;
	private GridBagConstraints labelSexoConstraints;
	private GridBagConstraints masculinoConstraints;
	private GridBagConstraints femininoConstraints;
	private GridBagConstraints labelCpfConstraints;
	private GridBagConstraints textCpfConstraints;
	private GridBagConstraints labelEnderecoConstraints;
	private GridBagConstraints textEnderecoConstraints;
	private GridBagConstraints labelBairroConstraints;
	private GridBagConstraints textBairroConstraints;
	private GridBagConstraints labelCidadeConstraints;
	private GridBagConstraints textCidadeConstraints;
	private GridBagConstraints labelEmailConstraints;
	private GridBagConstraints textEmailConstraints;
	
	private MaskFormatter mascaraCpf;
		
	public CadastroPessoaPanel(){
			initialize();
	}
	
	private void initialize(){
		setLayout(new GridBagLayout());
		getButtonGroup();

		add(getLabelNome(),getLabelNomeConstraints());
		add(getTextNome(),getTextNomeConstraints());
		add(getLabelSexo(),getLabelSexoConstraints());
		add(getButtonMasculino(),getMasculinoConstraints());
		add(getButtonFeminino(),getFemininoConstraints());
		add(getLabelCpf(),getLabelCpfConstraints());
		add(getTextCpf(),getTextCpfConstraints());
		add(getLabelEndereco(),getLabelEnderecoConstraints());
		add(getTextEndereco(),getTextEnderecoConstraints());
		add(getLabelBairro(),getLabelBairroConstraints());
		add(getTextBairro(),getTextBairroConstraints());
		add(getLabelCidade(),getLabelCidadeConstraints());
		add(getTextCidade(),getTextCidadeConstraints());
		add(getLabelEmail(),getLabelEmailConstraints());
		add(getTextEmail(),getTextEmailConstraints());
		
	}
	
	/*=============== NOME ================*/
	public JLabel getLabelNome() {
		if(labelNome == null){
			labelNome = new JLabel();
			labelNome.setText("Nome");
		}
		return labelNome;
	}

	public JTextField getTextNome() {
		if(textNome == null){
			textNome = new JTextField();
			textNome.setColumns(10);
		}
		return textNome;
	}
	

	/*=============== Sexo ================*/
	public JLabel getLabelSexo() {
		if(labelSexo == null){
			labelSexo = new JLabel();
			labelSexo.setText("Sexo");
		}
		return labelSexo;
	}
	
	public JRadioButton getButtonMasculino() {
		if(buttonMasculino == null){
			buttonMasculino = new JRadioButton();
			buttonMasculino.setText("Masculino");
		}
		
		return buttonMasculino;
	}
	
	public JRadioButton getButtonFeminino() {
		if(buttonFeminino == null){
			buttonFeminino= new JRadioButton();
			buttonFeminino.setText("Feminino");
		}
		return buttonFeminino;
	}
	
	public ButtonGroup getButtonGroup(){
		if(buttonGroup == null){
			buttonGroup = new ButtonGroup();
			buttonGroup.add(getButtonMasculino());
			buttonGroup.add(getButtonFeminino());
		}
		return buttonGroup;
	}
	
	public String getValorRadioButton(){
		if(getButtonMasculino().isSelected()){
			valorRadioButton = "M";
		}else{
			valorRadioButton = "F";
		}
		return valorRadioButton;
	}


	/*=============== CPF ================*/
	public JLabel getLabelCpf() {
		if(labelCpf== null){
			labelCpf= new JLabel();
			labelCpf.setText("CPF");
		}
		return labelCpf;
	}

	public JFormattedTextField getTextCpf() {
		if(textCpf== null){
			textCpf= new JFormattedTextField(getMascaraCpf());
			textCpf.setPreferredSize(new Dimension(1, 20));
		}
		return textCpf;
	}
	
	public MaskFormatter getMascaraCpf(){
		if(mascaraCpf == null){
			try{
			mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraCpf.setPlaceholderCharacter('_');
			}
			catch(ParseException excp){
				   System.err.println("Erro na formatação: " + excp.getMessage());
	               System.exit(-1);
			}
		}
		return mascaraCpf;
	}
	
	/*=============== ENDEREÇO ================*/
	public JLabel getLabelEndereco() {
		if(labelEndereco == null){
			labelEndereco = new JLabel();
			labelEndereco.setText("Endereço");
		}
		return labelEndereco;
	}

	public JTextField getTextEndereco() {
		if(textEndereco == null){
			textEndereco = new JTextField();
			textEndereco.setColumns(10);
		}
		return textEndereco;
	}

	/*=============== Bairro ================*/
	public JLabel getLabelBairro() {
		if(labelBairro == null){
			labelBairro = new JLabel();
			labelBairro.setText("Bairro");
		}
		return labelBairro;
	}

	public JTextField getTextBairro() {
		if(textBairro == null){
			textBairro = new JTextField();
			textBairro.setColumns(10);
		}
		return textBairro;
	}

	/*=============== CIDADE ================*/
	public JLabel getLabelCidade() {
		if(labelCidade== null){
			labelCidade = new JLabel();
			labelCidade.setText("Cidade");
		}
		return labelCidade;
	}

	public JTextField getTextCidade() {
		if(textCidade == null){
			textCidade = new JTextField();
			textCidade.setColumns(10);
		}
		return textCidade;
	}


	/*=============== EMAIL ================*/
	public JLabel getLabelEmail() {
		if(labelEmail == null){
			labelEmail = new JLabel();
			labelEmail.setText("E-mail");
		}
		return labelEmail;
	}

	public JTextField getTextEmail() {
		if(textEmail == null){
			textEmail = new JTextField();
			textEmail.setColumns(10);
		}
		return textEmail;
	}
	
	/*============= CONSTRAINTS ===================*/
	public GridBagConstraints getLabelNomeConstraints() {
		if(labelNomeConstraints == null){
			labelNomeConstraints = new GridBagConstraints();
			labelNomeConstraints.gridx = 0;
			labelNomeConstraints.gridy = 0;
			labelNomeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelNomeConstraints;
	}

	public GridBagConstraints getTextNomeConstraints() {
		if(textNomeConstraints == null){
			textNomeConstraints = new GridBagConstraints();
			textNomeConstraints.gridx = 1;
			textNomeConstraints.gridy = 0;
			textNomeConstraints.ipadx = 100;
			textNomeConstraints.weightx = 1.0;
			textNomeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textNomeConstraints;
	}


	public GridBagConstraints getLabelSexoConstraints() {
		if(labelSexoConstraints == null){
			labelSexoConstraints = new GridBagConstraints();
			labelSexoConstraints.gridx = 0;
			labelSexoConstraints.gridy = 2;
			labelSexoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelSexoConstraints;
	}

	public GridBagConstraints getMasculinoConstraints() {
		if(masculinoConstraints == null){
			masculinoConstraints = new GridBagConstraints();
			masculinoConstraints.gridx = 1;
			masculinoConstraints.gridy = 2;
			masculinoConstraints.insets = new Insets(-15, -125, 1, 15);
		}
		return masculinoConstraints;
	}

	public GridBagConstraints getFemininoConstraints() {
		if(femininoConstraints == null){
			femininoConstraints = new GridBagConstraints();
			femininoConstraints.gridx = 1;
			femininoConstraints.gridy = 3;
			femininoConstraints.insets = new Insets(-15, -130, 15, 15);
		}
		return femininoConstraints;
	}

	public GridBagConstraints getLabelCpfConstraints() {
		if(labelCpfConstraints == null){
			labelCpfConstraints = new GridBagConstraints();
			labelCpfConstraints.gridx = 0;
			labelCpfConstraints.gridy = 4;
			labelCpfConstraints.insets = new Insets(15, 15, 15, 15);
 		}
		return labelCpfConstraints;
	}

	public GridBagConstraints getTextCpfConstraints() {
		if(textCpfConstraints == null){
			textCpfConstraints = new GridBagConstraints();	
			textCpfConstraints.gridx = 1;
			textCpfConstraints.gridy = 4;
			textCpfConstraints.ipadx = 100;
			textCpfConstraints.weightx = 1.0;
			textCpfConstraints.insets = new Insets(15, -95, 15, 15);
		}
		return textCpfConstraints;
	}


	public GridBagConstraints getLabelEnderecoConstraints() {
		if(labelEnderecoConstraints == null){
			labelEnderecoConstraints = new GridBagConstraints();
			labelEnderecoConstraints.gridx = 0;
			labelEnderecoConstraints.gridy = 5;
			labelEnderecoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelEnderecoConstraints;
	}

	public GridBagConstraints getTextEnderecoConstraints() {
		if(textEnderecoConstraints == null){
			textEnderecoConstraints = new GridBagConstraints();
			textEnderecoConstraints.gridx = 1;
			textEnderecoConstraints.gridy = 5;
			textEnderecoConstraints.ipadx = 100;
			textEnderecoConstraints.weightx = 1.0;
			textEnderecoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textEnderecoConstraints;
	}

	public GridBagConstraints getLabelBairroConstraints() {
		if(labelBairroConstraints == null){
			labelBairroConstraints = new GridBagConstraints();
			labelBairroConstraints.gridx = 0;
			labelBairroConstraints.gridy = 6;
			labelBairroConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelBairroConstraints;
	}

	public GridBagConstraints getTextBairroConstraints() {
		if(textBairroConstraints == null){
			textBairroConstraints = new GridBagConstraints();
			textBairroConstraints.gridx = 1;
			textBairroConstraints.gridy = 6;
			textBairroConstraints.ipadx = 100;
			textBairroConstraints.weightx = 1.0;
			textBairroConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textBairroConstraints;
	}

	public GridBagConstraints getLabelCidadeConstraints() {
		if(labelCidadeConstraints == null){
			labelCidadeConstraints = new GridBagConstraints();
			labelCidadeConstraints.gridx = 0;
			labelCidadeConstraints.gridy = 7;
			labelCidadeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelCidadeConstraints;
	}

	public GridBagConstraints getTextCidadeConstraints() {
		if(textCidadeConstraints == null){
			textCidadeConstraints = new GridBagConstraints();
			textCidadeConstraints.gridx = 1;
			textCidadeConstraints.gridy = 7;
			textCidadeConstraints.ipadx = 100;
			textCidadeConstraints.weightx = 1.0;
			textCidadeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textCidadeConstraints;
	}


	public GridBagConstraints getLabelEmailConstraints() {
		if(labelEmailConstraints == null){
			labelEmailConstraints = new GridBagConstraints();
			labelEmailConstraints.gridx = 0;
			labelEmailConstraints.gridy = 9;
			labelEmailConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelEmailConstraints;
	}

	public GridBagConstraints getTextEmailConstraints() {
		if(textEmailConstraints == null){
			textEmailConstraints = new GridBagConstraints();
			textEmailConstraints.gridx = 1;
			textEmailConstraints.gridy = 9;
			textEmailConstraints.ipadx = 100;
			textEmailConstraints.weightx = 1.0;
			textEmailConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textEmailConstraints;
	}
	
	public PessoaTO getPessoa(){
		PessoaTO pessoa = new PessoaTO();
		pessoa.setCpf(getTextCpf().getText());
		pessoa.setNome(getTextNome().getText());
		pessoa.setSexo(getValorRadioButton());
		pessoa.setEndereco(getTextEndereco().getText());
		pessoa.setBairro(getTextBairro().getText());
		pessoa.setCidade(getTextCidade().getText());
		pessoa.setEmail(getTextEmail().getText());
		return pessoa;
	}
	
	
	
}
