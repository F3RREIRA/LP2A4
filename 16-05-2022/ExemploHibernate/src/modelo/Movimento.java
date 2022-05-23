package modelo;

import java.util.Date;

public class Movimento
{
	private int id;
	private Date dataHora;
	private double valor;
	
	private ContaComum conta;
	
	public Movimento()
	{
		this.dataHora = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public ContaComum getConta() {
		return conta;
	}

	public void setConta(ContaComum conta) {
		this.conta = conta;
	}
}
