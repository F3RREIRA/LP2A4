package modelo.repositorio;

import java.sql.PreparedStatement;

import modelo.Pessoa;

public class PessoaDAO extends FabricaConexao 
{
	public int criarPessoa(Pessoa pessoa)
	{
		int id = 0;
		
		try
		{
			String stmt = "insert into pessoas (nome, endereco, cep, telefone, renda, situacao) " + 
						"values (?, ?, ?, ?, ?, ?) returningid";
			
			PreparedStatement pStmt = conn.prepareStatement(stmt);
			
			pStmt.setString(1, pessoa.getNomePessoa());
			pStmt.setString(2, pessoa.getNomePessoa());
			pStmt.setLong(3, pessoa.getNomePessoa());
			pStmt.setString(4, pessoa.getNomePessoa());
			pStmt.setDouble(5, pessoa.getNomePessoa());
			pStmt.setInt(6, pessoa.getNomePessoa());
			
			ResusltSet rs = pStmt.executeQuery();
					
			if(rs.next())
			{
				id = rs.getInt(1);
			}
		}
		catch (Exception e)
		{
			System.out.println("Erro ao tentar inserir uma nova pessoa!! " + e.getMessage());
		}
		return id;
	}
	
}
