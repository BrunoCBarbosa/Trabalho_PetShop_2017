package br.edu.univas.tp4.petshop.model;

public class ProdutoException extends Exception{
	
	public ProdutoException(String message){
		super(message);
	}
	
	public ProdutoException(Throwable cause){
		super(cause);
	}
	
	public ProdutoException(String message, Throwable cause){
		super(message,cause);
	}
	
	public ProdutoException(String message, Throwable cause, boolean enableSuppresion,
			boolean writableStackTrace){
		super(message,cause,enableSuppresion,writableStackTrace);
	}
	

}
