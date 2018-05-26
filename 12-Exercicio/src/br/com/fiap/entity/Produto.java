package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="NAC_PRODUTO")
@SequenceGenerator(name="prod",sequenceName="SQ_NAC_PRODUTO",allocationSize=1)
public class Produto {

	@Id
	@GeneratedValue(generator="prod",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(length=500)
	private String descricao;
	
	@Lob
	private byte[] imagem;
	
	@OneToMany(mappedBy="produto")
	private List<ItemPedido> itens;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
}
