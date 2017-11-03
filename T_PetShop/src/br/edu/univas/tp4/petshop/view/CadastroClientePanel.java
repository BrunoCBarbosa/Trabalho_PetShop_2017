package br.edu.univas.tp4.petshop.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastroClientePanel extends JPanel{

	private static final long serialVersionUID = -5083485119067419418L;
	
	private JLabel labelNome;
	private JTextField textNome;
	private JLabel labelNascimento;
	private JTextField textNascimento;
	private JLabel labelSexo;
	private JRadioButton buttonMasculino;
	private JRadioButton buttonFeminino;
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
	
	public CadastroClientePanel(){
		initialize();
	}
	
	private void initialize(){
		setLayout(new GridLayout(9, 2, 1,1));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		
		
		add(getLabelNome());
		add(getTextNome());
		add(getLabelNascimento());
		add(getTextNascimento());
		add(getLabelCpf());
		add(getTextCpf());
		add(getLabelRg());
		add(getTextRg());
		add(getLabelEndereco());
		add(getLabelEndereco());
		add(getTextEndereco());
		add(getLabelBairro());
		add(getTextBairro());
		add(getLabelCidade());
		add(getTextCidade());
		add(getLabelTel());
		add(getTextTel());
		add(getLabelEmail());
		add(getTextEmail());
		
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
		}
		return textEmail;
	}	

}
