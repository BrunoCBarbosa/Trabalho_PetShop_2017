package br.edu.univas.tp4.petshop.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadastroFuncionarioPanel extends JPanel{

	private static final long serialVersionUID = -5083485119067419418L;
	
	private JLabel labelNome;
	private JTextField textNome;
	private JLabel labelNascimento;
	private JTextField textNascimento;
	private JLabel labelSexo;
	private JRadioButton buttonMasculino;
	private JRadioButton buttonFeminino;
	private ButtonGroup buttonGroup;
	private JLabel labelCpf;
	private JTextField textCpf;
	private JLabel labelRg;
	private JTextField textRg;
	private JLabel labelEndereco;
	private JTextField textEndereco;
	private JLabel labelBairro;
	private JTextField textBairro;
	private JLabel labelCidade;
	private JTextField textCidade;
	private JLabel labelTel;
	private JTextField textTel;
	private JLabel labelEmail;
	private JTextField textEmail;
	
	private GridBagConstraints labelNomeConstraints;
	private GridBagConstraints textNomeConstraints;
	private GridBagConstraints labelNascimentoConstraints;
	private GridBagConstraints textNascimentoConstraints;
	private GridBagConstraints labelSexoConstraints;
	private GridBagConstraints masculinoConstraints;
	private GridBagConstraints femininoConstraints;
	private GridBagConstraints labelCpfConstraints;
	private GridBagConstraints textCpfConstraints;
	private GridBagConstraints labelRgConstraints;
	private GridBagConstraints textRgConstraints;
	private GridBagConstraints labelEnderecoConstraints;
	private GridBagConstraints textEnderecoConstraints;
	private GridBagConstraints labelBairroConstraints;
	private GridBagConstraints textBairroConstraints;
	private GridBagConstraints labelCidadeConstraints;
	private GridBagConstraints textCidadeConstraints;
	private GridBagConstraints labelTelConstraints;
	private GridBagConstraints textTelConstraints;
	private GridBagConstraints labelEmailConstraints;
	private GridBagConstraints textEmailConstraints;
	
	public CadastroFuncionarioPanel(){
			initialize();
	}
	
	private void initialize(){
		setLayout(new GridBagLayout());
		getButtonGroup();
		
		add(getLabelNome(),getLabelNomeConstraints());
		add(getTextNome(),getTextNomeConstraints());
		add(getLabelNascimento(),getLabelNascimentoConstraints());
		add(getTextNascimento(),getTextNascimentoConstraints());
		add(getLabelSexo(),getLabelSexoConstraints());
		add(getButtonMasculino(),getMasculinoConstraints());
		add(getButtonFeminino(),getFemininoConstraints());
		add(getLabelCpf(),getLabelCpfConstraints());
		add(getTextCpf(),getTextCpfConstraints());
		add(getLabelRg(),getLabelRgConstraints());
		add(getTextRg(),getTextRgConstraints());
		add(getLabelEndereco(),getLabelEnderecoConstraints());
		add(getTextEndereco(),getTextEnderecoConstraints());
		add(getLabelBairro(),getLabelBairroConstraints());
		add(getTextBairro(),getTextBairroConstraints());
		add(getLabelCidade(),getLabelCidadeConstraints());
		add(getTextCidade(),getTextCidadeConstraints());
		add(getLabelTel(),getLabelTelConstraints());
		add(getTextTel(),getTextTelConstraints());
		add(getLabelEmail(),getLabelEmailConstraints());
		add(getTextEmail(),getTextEmailConstraints());
		
	}
	
	/*=============== NOME ================*/
	private JLabel getLabelNome() {
		if(labelNome == null){
			labelNome = new JLabel();
			labelNome.setText("Nome");
		}
		return labelNome;
	}

	private JTextField getTextNome() {
		if(textNome == null){
			textNome = new JTextField();
			textNome.setColumns(10);
		}
		return textNome;
	}
	
	/*=============== DATA DE NASCIMENTO ================*/
	private JLabel getLabelNascimento() {
		if(labelNascimento== null){
			labelNascimento = new JLabel();
			labelNascimento.setText("Data de Nascimento");
		}
		return labelNascimento;
	}

	private JTextField getTextNascimento() {
		if(textNascimento == null){
			textNascimento = new JTextField();
			textNascimento.setColumns(10);
		}
		return textNascimento;
	}

	/*=============== Sexo ================*/
	private JLabel getLabelSexo() {
		if(labelSexo == null){
			labelSexo = new JLabel();
			labelSexo.setText("Sexo");
		}
		return labelSexo;
	}
	
	private JRadioButton getButtonMasculino() {
		if(buttonMasculino == null){
			buttonMasculino = new JRadioButton();
			buttonMasculino.setText("Masculino");
		}
		
		return buttonMasculino;
	}
	
	private JRadioButton getButtonFeminino() {
		if(buttonFeminino == null){
			buttonFeminino= new JRadioButton();
			buttonFeminino.setText("Feminino");
		}
		return buttonFeminino;
	}
	
	private ButtonGroup getButtonGroup(){
		if(buttonGroup == null){
			buttonGroup = new ButtonGroup();
			buttonGroup.add(getButtonMasculino());
			buttonGroup.add(getButtonFeminino());
		}
		return buttonGroup;
	}


	/*=============== CPF ================*/
	private JLabel getLabelCpf() {
		if(labelCpf== null){
			labelCpf= new JLabel();
			labelCpf.setText("CPF");
		}
		return labelCpf;
	}

	private JTextField getTextCpf() {
		if(textCpf== null){
			textCpf= new JTextField();
			textCpf.setColumns(10);
		}
		return textCpf;
	}

	/*=============== RG ================*/
	private JLabel getLabelRg() {
		if(labelRg== null){
			labelRg= new JLabel();
			labelRg.setText("Identidade");
		}
		return labelRg;
	}

	private JTextField getTextRg() {
		if(textRg== null){
			textRg= new JTextField();
			textRg.setColumns(10);
		}
		return textRg;
	}

	/*=============== ENDEREÇO ================*/
	private JLabel getLabelEndereco() {
		if(labelEndereco == null){
			labelEndereco = new JLabel();
			labelEndereco.setText("Endereço");
		}
		return labelEndereco;
	}

	private JTextField getTextEndereco() {
		if(textEndereco == null){
			textEndereco = new JTextField();
			textEndereco.setColumns(10);
		}
		return textEndereco;
	}

	/*=============== Bairro ================*/
	private JLabel getLabelBairro() {
		if(labelBairro == null){
			labelBairro = new JLabel();
			labelBairro.setText("Bairro");
		}
		return labelBairro;
	}

	private JTextField getTextBairro() {
		if(textBairro == null){
			textBairro = new JTextField();
			textBairro.setColumns(10);
		}
		return textBairro;
	}

	/*=============== CIDADE ================*/
	private JLabel getLabelCidade() {
		if(labelCidade== null){
			labelCidade = new JLabel();
			labelCidade.setText("Cidade");
		}
		return labelCidade;
	}

	private JTextField getTextCidade() {
		if(textCidade == null){
			textCidade = new JTextField();
			textCidade.setColumns(10);
		}
		return textCidade;
	}

	/*=============== TELEFONE ================*/
	private JLabel getLabelTel() {
		if(labelTel== null){
			labelTel= new JLabel();
			labelTel.setText("Telefone");
		}
		return labelTel;
	}

	private JTextField getTextTel() {
		if(textTel == null){
			textTel= new JTextField();
			textTel.setColumns(10);
		}
		return textTel;
	}

	/*=============== EMAIL ================*/
	private JLabel getLabelEmail() {
		if(labelEmail == null){
			labelEmail = new JLabel();
			labelEmail.setText("E-mail");
		}
		return labelEmail;
	}

	private JTextField getTextEmail() {
		if(textEmail == null){
			textEmail = new JTextField();
			textEmail.setColumns(10);
		}
		return textEmail;
	}
	
	/*============= CONSTRAINTS ===================*/
	private GridBagConstraints getLabelNomeConstraints() {
		if(labelNomeConstraints == null){
			labelNomeConstraints = new GridBagConstraints();
			labelNomeConstraints.gridx = 0;
			labelNomeConstraints.gridy = 0;
			labelNomeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelNomeConstraints;
	}

	private GridBagConstraints getTextNomeConstraints() {
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

	private GridBagConstraints getLabelNascimentoConstraints() {
		if(labelNascimentoConstraints == null){
			labelNascimentoConstraints = new GridBagConstraints();
			labelNascimentoConstraints.gridx = 0;
			labelNascimentoConstraints.gridy = 1;
			labelNascimentoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelNascimentoConstraints;
	}

	private GridBagConstraints getTextNascimentoConstraints() {
		if(textNascimentoConstraints == null){
			textNascimentoConstraints = new GridBagConstraints();
			textNascimentoConstraints.gridx = 1;
			textNascimentoConstraints.gridy = 1;
			textNascimentoConstraints.ipadx = 100;
			textNascimentoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textNascimentoConstraints;
	}

	private GridBagConstraints getLabelSexoConstraints() {
		if(labelSexoConstraints == null){
			labelSexoConstraints = new GridBagConstraints();
			labelSexoConstraints.gridx = 0;
			labelSexoConstraints.gridy = 2;
			labelSexoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelSexoConstraints;
	}

	private GridBagConstraints getMasculinoConstraints() {
		if(masculinoConstraints == null){
			masculinoConstraints = new GridBagConstraints();
			masculinoConstraints.gridx = 1;
			masculinoConstraints.gridy = 2;
			masculinoConstraints.insets = new Insets(-15, -125, 1, 15);
		}
		return masculinoConstraints;
	}

	private GridBagConstraints getFemininoConstraints() {
		if(femininoConstraints == null){
			femininoConstraints = new GridBagConstraints();
			femininoConstraints.gridx = 1;
			femininoConstraints.gridy = 3;
			femininoConstraints.insets = new Insets(-15, -130, 15, 15);
		}
		return femininoConstraints;
	}

	private GridBagConstraints getLabelCpfConstraints() {
		if(labelCpfConstraints == null){
			labelCpfConstraints = new GridBagConstraints();
			labelCpfConstraints.gridx = 0;
			labelCpfConstraints.gridy = 4;
			labelCpfConstraints.insets = new Insets(15, 15, 15, 15);
 		}
		return labelCpfConstraints;
	}

	private GridBagConstraints getTextCpfConstraints() {
		if(textCpfConstraints == null){
			textCpfConstraints = new GridBagConstraints();	
			textCpfConstraints.gridx = 1;
			textCpfConstraints.gridy = 4;
			textCpfConstraints.ipadx = 100;
			textCpfConstraints.weightx = 1.0;
			textCpfConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textCpfConstraints;
	}

	private GridBagConstraints getLabelRgConstraints() {
		if(labelRgConstraints == null){
			labelRgConstraints = new GridBagConstraints();
			labelRgConstraints.gridx = 0;
			labelRgConstraints.gridy = 5;
			labelRgConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelRgConstraints;
	}

	private GridBagConstraints getTextRgConstraints() {
		if(textRgConstraints == null){
			textRgConstraints = new GridBagConstraints();
			textRgConstraints.gridx = 1;
			textRgConstraints.gridy = 5;
			textRgConstraints.ipadx = 100;
			textRgConstraints.weightx = 1.0;
			textRgConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textRgConstraints;
	}

	private GridBagConstraints getLabelEnderecoConstraints() {
		if(labelEnderecoConstraints == null){
			labelEnderecoConstraints = new GridBagConstraints();
			labelEnderecoConstraints.gridx = 0;
			labelEnderecoConstraints.gridy = 6;
			labelEnderecoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelEnderecoConstraints;
	}

	private GridBagConstraints getTextEnderecoConstraints() {
		if(textEnderecoConstraints == null){
			textEnderecoConstraints = new GridBagConstraints();
			textEnderecoConstraints.gridx = 1;
			textEnderecoConstraints.gridy = 6;
			textEnderecoConstraints.ipadx = 100;
			textEnderecoConstraints.weightx = 1.0;
			textEnderecoConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textEnderecoConstraints;
	}

	private GridBagConstraints getLabelBairroConstraints() {
		if(labelBairroConstraints == null){
			labelBairroConstraints = new GridBagConstraints();
			labelBairroConstraints.gridx = 0;
			labelBairroConstraints.gridy = 7;
			labelBairroConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelBairroConstraints;
	}

	private GridBagConstraints getTextBairroConstraints() {
		if(textBairroConstraints == null){
			textBairroConstraints = new GridBagConstraints();
			textBairroConstraints.gridx = 1;
			textBairroConstraints.gridy = 7;
			textBairroConstraints.ipadx = 100;
			textBairroConstraints.weightx = 1.0;
			textBairroConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textBairroConstraints;
	}

	private GridBagConstraints getLabelCidadeConstraints() {
		if(labelCidadeConstraints == null){
			labelCidadeConstraints = new GridBagConstraints();
			labelCidadeConstraints.gridx = 0;
			labelCidadeConstraints.gridy = 8;
			labelCidadeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelCidadeConstraints;
	}

	private GridBagConstraints getTextCidadeConstraints() {
		if(textCidadeConstraints == null){
			textCidadeConstraints = new GridBagConstraints();
			textCidadeConstraints.gridx = 1;
			textCidadeConstraints.gridy = 8;
			textCidadeConstraints.ipadx = 100;
			textCidadeConstraints.weightx = 1.0;
			textCidadeConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textCidadeConstraints;
	}

	private GridBagConstraints getLabelTelConstraints() {
		if(labelTelConstraints == null){
			labelTelConstraints = new GridBagConstraints();
			labelTelConstraints.gridx = 0;
			labelTelConstraints.gridy = 9;
			labelTelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelTelConstraints;
	}

	private GridBagConstraints getTextTelConstraints() {
		if(textTelConstraints == null){
			textTelConstraints = new GridBagConstraints();
			textTelConstraints.gridx = 1;
			textTelConstraints.gridy = 9;
			textTelConstraints.ipadx = 100;
			textTelConstraints.weightx = 1.0;
			textTelConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textTelConstraints;
	}

	private GridBagConstraints getLabelEmailConstraints() {
		if(labelEmailConstraints == null){
			labelEmailConstraints = new GridBagConstraints();
			labelEmailConstraints.gridx = 0;
			labelEmailConstraints.gridy = 10;
			labelEmailConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return labelEmailConstraints;
	}

	private GridBagConstraints getTextEmailConstraints() {
		if(textEmailConstraints == null){
			textEmailConstraints = new GridBagConstraints();
			textEmailConstraints.gridx = 1;
			textEmailConstraints.gridy = 10;
			textEmailConstraints.ipadx = 100;
			textEmailConstraints.weightx = 1.0;
			textEmailConstraints.insets = new Insets(15, 15, 15, 15);
		}
		return textEmailConstraints;
	}	
	
	

}
