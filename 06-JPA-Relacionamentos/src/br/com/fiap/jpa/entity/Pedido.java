package br.com.fiap.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PEDIDO")
@SequenceGenerator(name="pedido",sequenceName="SQ_T_PEDIDO",allocationSize=1)
public class Pedido {

	@Id
	@Column(name="cd_pedido")
	@GeneratedValue(generator="pedido",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_pedido",nullable=false)
	private String descricao;
	
	@Column(name="st_pedido") 
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	@OneToOne(mappedBy="pedido")
	private NotaFiscal nota;

	@OneToMany(mappedBy="pedido",cascade=CascadeType.ALL)
	private List<ItemPedido> itens = new ArrayList<>();
	
	public void adicionarItem(ItemPedido item) {
		itens.add(item);
		item.setPedido(this);
	}
	
	public Pedido(String descricao, StatusPedido status) {
		super();
		this.descricao = descricao;
		this.status = status;
	}

	public Pedido() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public NotaFiscal getNota() {
		return nota;
	}

	public void setNota(NotaFiscal nota) {
		this.nota = nota;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
}
