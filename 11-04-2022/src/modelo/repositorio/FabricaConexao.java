package modelo.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class FabricaConexao {
	protected Connection conn;

	public FabricaConexao() {

	}

	public void abrirConexao() {
		try {
			if (this.conn == null) {
				String url = "jdbc:postgresql://localhost/testepgdb";

				Properties props = new Properties();
				props.setProperty("user", "postgres");
				props.setProperty("password", "postgres");
				props.setProperty("ssl", "false");

				this.conn = DriverManager.getConnection(url, props);

				System.out.println("Conex�o aberta!!");
			} else {
				System.out.println("Conex�o j� est� aberta!!");
			}
		} catch (Exception e) {
			System.out.println("Erro ao criar conex�o!!" + e.getMessage());
		}
	}

	public void fecharConexao() 
	{
		
			try
			{
				if(this.conn != null)
				{
					this.conn.close();
					this.conn=null;
					System.out.println("Conex�o fechada!!");
				}
				else
				{
				System.out.println("Conex�o n�o est� aberta!!");
				}
			}
			catch (Exception e) 
			{
				System.out.println("Erro ao fechar a conex�o!!" + e.getMessage());
			}
	}

}
