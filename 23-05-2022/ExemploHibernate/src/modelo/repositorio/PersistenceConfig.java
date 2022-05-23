package modelo.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceConfig
{
	private EntityManager entityManager;
	
	public EntityManager getEntityManager()
	{
		if(this.entityManager == null)
		{
			try
			{
				EntityManagerFactory factory =
						Persistence.createEntityManagerFactory("ExemploHibernateDatabase");
				
				this.entityManager = factory.createEntityManager();
				System.out.println("Gerenciador de entidades instanciado com sucesso.");
			}
			catch (Exception e)
			{
				System.out.println("Erro ao tentar instanciar um gerenciador de entidades. " +
								   e.getMessage());
			}
		}
		
		return this.entityManager;
	}
	
	public void closeEntityManager()
	{
		if(this.entityManager != null)
		{
			try
			{
				this.entityManager.close();
				this.entityManager = null;
				System.out.println("Gerenciador de Entidades fechado com sucesso!");
			}
			catch (Exception e)
			{
				System.out.println("Erro ao tentar fechar o gerenciador de entidades. " +
								   e.getMessage());
			}
		}
	}
}
