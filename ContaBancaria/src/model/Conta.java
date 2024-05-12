package model;

public class Conta {
	private Integer numero ;
	private Double saldo = 0.0;
	private String nomeCliente, agencia;

	public Conta(Integer numero, Double saldo, String nomeCliente, String agencia) {
		this.numero = numero;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
		this.agencia = agencia;
	}

	public Conta() {
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	

	public void depositar(Double saldo) {
		this.saldo += saldo;
	}
	
	public void sacar(Double saldo) {
		this.saldo -= saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
}
