package br.edu.univas.tp4.petshop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
	
	
	public void insertNewFuncionario(PessoaTO to)
			throws FuncionarioException{
				String sentenca = "INSERT INTO FUNCIONARIOS"
						+ "(CPF,NOME,SEXO,ENDERECO,BAIRRO,CIDADE,EMAIL)"
						+ "VALUES(?,?,?,?,?,?,?)";
				Connection conn = null;
			try{
				conn = DBUtil.openConnection();
				
				PreparedStatement prepStat = conn.prepareStatement(sentenca);
				
				prepStat.setString(1, to.getCpf());
				prepStat.setString(2, to.getNome());
				prepStat.setString(3, to.getSexo());
				//prepStat.setString(4, to.getDataNascimento());
				prepStat.setString(4, to.getEndereco());
				prepStat.setString(5, to.getBairro());
				prepStat.setString(6, to.getCidade());
//				prepStat.setString(7, to.getTelefone());
				prepStat.setString(7, to.getEmail());
				prepStat.execute();
			}catch(Exception e){
				throw new FuncionarioException("Erro salvando funcionario" + to.getNome(),e);
			}finally{
				DBUtil.closeConnection(conn);
			}
	}
	
	
	public ArrayList<PessoaTO> listarFuncionarios() throws FuncionarioException{
		String sql = "SELECT * FROM FUNCIONARIOS ORDER BY 1";
		ArrayList<PessoaTO> ListaFuncionarios = new ArrayList<PessoaTO>();
		Connection conn = null;
		
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			ResultSet rs = prep.executeQuery();
			while(rs.next()){
				PessoaTO to = new PessoaTO();
				to.setCpf(rs.getString(1));
				to.setNome(rs.getString(2));
				to.setSexo(rs.getString(3));
				//to.setDataNascimento(rs.getString(4));
				to.setEndereco(rs.getString(4));
				to.setBairro(rs.getString(5));
				to.setCidade(rs.getString(6));
			//	to.setTelefone(rs.getString(7));
				to.setEmail(rs.getString(7));
				ListaFuncionarios.add(to);
				
			}
		}catch(SQLException e){
			throw new FuncionarioException("Erro" + e);
		}finally{
			DBUtil.closeConnection(conn);
		}
		return ListaFuncionarios;
	}
	
	public void deleteFuncionario(String cpf) throws FuncionarioException{
		String sql = "DELETE FROM FUNCIONARIOS WHERE CPF = ?";
		Connection conn = null;
		
		try {
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			prep.setString(1, cpf);
			prep.execute();
		} catch (SQLException e) {
			throw new FuncionarioException("Erro ao excluir o funcionario de CPF: " + cpf);
			}finally{
				DBUtil.closeConnection(conn);
			}
	}

}
