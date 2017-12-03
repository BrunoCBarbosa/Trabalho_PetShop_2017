package br.edu.univas.tp4.petshop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


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
	
	public ArrayList<ProdutoTO> listarProduto() throws ProdutoException{
		String sql = "SELECT * FROM PRODUTOS ORDER BY 1";
		ArrayList<ProdutoTO> listaProdutos = new ArrayList<ProdutoTO>();
		Connection conn = null;
		
		try {
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			ResultSet rs = prep.executeQuery();
			while(rs.next()){
				ProdutoTO to = new ProdutoTO();
				to.setCodigo(rs.getInt(1));
				to.setNome(rs.getString(2));
				to.setDescricao(rs.getString(3));
				to.setQuantidade(rs.getInt(4));
				to.setValorBruto(rs.getFloat(5));
				to.setValorVenda(rs.getFloat(6));
				listaProdutos.add(to);
			}
		} catch (SQLException e) {
			throw new ProdutoException("Erro" + e);
		}finally{
			DBUtil.closeConnection(conn);
		}
		
		return listaProdutos;
		
	}
	
	public void deleteProduto(int codigo) throws ProdutoException{
		String sql = "DELETE FROM PRODUTOS WHERE CODIGO = ?";
		Connection conn = null;
		
		try {
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setInt(1, codigo);
			prep.execute();
		} catch (SQLException e) {
			throw new ProdutoException("Erro ao excluir produto: " + codigo);
		}finally{
			DBUtil.closeConnection(conn);
		}
	}

}
