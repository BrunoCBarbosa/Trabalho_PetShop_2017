package br.edu.univas.tp4.petshop.model;

import java.sql.Date;

public class PessoaTO {
	private String cpf;
	private String nome;
	private int sexo;
	//private String dataNascimento;
	private String endereco;
	private String bairro;
	private String cidade;
	//private String telefone;
	private String email;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
//	public String getDataNascimento() {
//		return dataNascimento;
//	}
//	public void setDataNascimento(String string) {
//		this.dataNascimento = string;
//	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
//	public String getTelefone() {
//		return telefone;
//	}
//	public void setTelefone(String telefone) {
//		this.telefone = telefone;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
