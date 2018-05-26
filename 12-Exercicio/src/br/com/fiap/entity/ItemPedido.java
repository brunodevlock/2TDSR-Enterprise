package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="NAC_ITEM_PEDIDO")
@IdClass(ItemPedidoPK.class)
public class ItemPedido {

	@Column(nullable=false)
	private int quantidade;
	
	@Column(nullable=false, name="valor_item")
	private float valor;
	
	@Id
	@ManyToOne
	@JoinColumn(name="produto_codigo")
	private Produto produto;
	
	@Id
	@ManyToOne
	@JoinColumn(name="pedido_codigo")
	private Pedido pedido;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}
