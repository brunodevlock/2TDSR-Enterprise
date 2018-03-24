package br.com.fiap.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//CTRL + 3 GGAS 

@Entity
@Table(name="T_IMPOSTO")
@SequenceGenerator(name="imposto",sequenceName="SQ_T_IMPOSTO",allocationSize=1)
public class Imposto {

	@Id
	@Column(name="cd_imposto")
	@GeneratedValue(generator="imposto",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="vl_imposto")
	private double valor;
	
	@Column(name="nm_imposto")
	private String nome;
	
	@ManyToMany(mappedBy="impostos")
	private List<NotaFiscal> notas;
	
	public Imposto() {
		super();
	}

	public Imposto(double valor, String nome, List<NotaFiscal> notas) {
		super();
		this.valor = valor;
		this.nome = nome;
		this.notas = notas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<NotaFiscal> getNotas() {
		return notas;
	}

	public void setNotas(List<NotaFiscal> notas) {
		this.notas = notas;
	}
	
}
