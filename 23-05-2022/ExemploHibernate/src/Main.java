import java.util.Date;

import javax.persistence.EntityTransaction;

import modelo.ContaComum;
import modelo.PessoaFisica;
import modelo.repositorio.PersistenceConfig;

public class Main
{
	public static void main(String[] args)
	{
		/* Exemplo de inserção */
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setCep(888888888l);
		pf1.setCpf(88888888888l);
		pf1.setEndereco("Av. Brasil, 888, Sao Paulo - SP");
		pf1.setNascto(new Date(1990,2,2));
		pf1.setNome("Maria da Silva");
		pf1.setRenda(3500.75f);
		pf1.setSituacao((byte)1);
		pf1.setTelefone("(88) 8888-8888");
		
		ContaComum cc1 = ContaComum.abrirConta();
		cc1.setSenha(123456);
		cc1.setSaldo(500.0);
		
		pf1.getContas().add(cc1);
		
		
		PersistenceConfig persistence = new PersistenceConfig();
		
		EntityTransaction transaction = persistence.getEntityManager().getTransaction();
		transaction.begin();
		persistence.getEntityManager().persist(cc1);
		persistence.getEntityManager().persist(pf1);
		transaction.commit();
		
		/* Exemplo de recuperação */
		
		PessoaFisica p = persistence.getEntityManager().find(PessoaFisica.class, 2);
		
		System.out.println(p.getNome());
	}

}
