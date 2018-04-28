package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@DiscriminatorValue("PJ")

@Entity
@Table(name="T_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa {

	@Column(name="nr_cnpj")
	private String cnpj;
	
	@Column(name="dt_fundacao")
	private Calendar dataFundacao;
	
	public PessoaJuridica(String nome, String endereco, String cnpj, Calendar dataFundacao) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.dataFundacao = dataFundacao;
	}

	public PessoaJuridica() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
}
