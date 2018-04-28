package br.com.fiap.jpa.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@DiscriminatorValue("PF")

@Entity
@Table(name="T_PESSOA_FISICA")
public class PessoaFisica extends Pessoa {

	@Column(name="nr_cpf")
	private String cpf;
	
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
	public PessoaFisica(String nome, String endereco, String cpf, Calendar dataNascimento) {
		super(nome, endereco);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public PessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
