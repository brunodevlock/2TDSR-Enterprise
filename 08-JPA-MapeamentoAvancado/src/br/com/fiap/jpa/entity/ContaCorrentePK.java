package br.com.fiap.jpa.entity;

import java.io.Serializable;

//Classe que declara os atributos que formam a chave composta
//Obrigatório implementar Serializable
public class ContaCorrentePK implements Serializable {

	private int numero;
	
	private int agencia;

	public ContaCorrentePK() {
		super();
	}

	public ContaCorrentePK(int numero, int agencia) {
		super();
		this.numero = numero;
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrentePK other = (ContaCorrentePK) obj;
		if (agencia != other.agencia)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
	
}
