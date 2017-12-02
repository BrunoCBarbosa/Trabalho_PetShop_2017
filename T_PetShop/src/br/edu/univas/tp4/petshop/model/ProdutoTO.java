package br.edu.univas.tp4.petshop.model;

public class ProdutoTO {
	
	private int codigo;
	private String nome;
	private String descricao;
	private int quantidade;
	private float valorBruto;
	private float valorVenda;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(float valorBruto) {
		this.valorBruto = valorBruto;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	
}
