package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CONTA_CORRENTE")
@IdClass(ContaCorrentePK.class)
public class ContaCorrente {

	@Id
	@Column(name="nr_conta")
	private int numero;
	
	@Id
	@Column(name="nr_agencia")
	private int agencia;
	
	@Column(name="vl_saldo",nullable=false)
	private double saldo;
	
	@Column(name="dt_abertura")
	@Temporal(TemporalType.DATE)
	private Calendar dataAbertura;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numero, int agencia, double saldo, Calendar dataAbertura) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
}
