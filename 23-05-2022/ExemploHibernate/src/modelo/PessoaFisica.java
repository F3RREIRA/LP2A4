package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoasfisicas")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa
{
	@Column(nullable = false)
	private long cpf;
	
	@Temporal(TemporalType.DATE)
	private Date nascto;
	
	public long getCpf()
	{
		return cpf;
	}
	
	public void setCpf(long cpf)
	{
		this.cpf = cpf;
	}
	
	public Date getNascto()
	{
		return nascto;
	}
	
	public void setNascto(Date nascto)
	{
		this.nascto = nascto;
	}
}
