package br.edu.univas.tp4.petshop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProdutoDAO {
	
	public void insertNewProduto(ProdutoTO to)
		throws ProdutoException{
			String sentenca = "INSERT INTO PRODUTOS"
					+ "(CODIGO, NOME, DESCRICAO, QUANTIDADE, VALOR_BRUTO, VALOR_VENDA)"
					+ "VALUES(?,?,?,?,?,?)";
		
			Connection conn = null;
		try {
			conn = DBUtil.openConnection();
				
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
				
			prepStat.setInt(1, to.getCodigo());
			prepStat.setString(2, to.getNome());
			prepStat.setString(3, to.getDescricao());
			prepStat.setInt(4, to.getQuantidade());
			prepStat.setFloat(5, to.getValorBruto());
			prepStat.setFloat(6, to.getValorVenda());
			prepStat.execute();
		} catch (Exception e) {
			throw new ProdutoException("Erro ao cadastrar o produto" + to.getNome(), e);
				
		}finally{
			DBUtil.closeConnection(conn);
		}
	}

}
