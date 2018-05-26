package br.com.fiap.entity;

import java.io.Serializable;

public class ItemPedidoPK implements Serializable {

	// Atributos que formam a chave composta
	private int produto;

	private int pedido;

	// Gerar o Hashcode e Equals (Source -> generate ...)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pedido;
		result = prime * result + produto;
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
		ItemPedidoPK other = (ItemPedidoPK) obj;
		if (pedido != other.pedido)
			return false;
		if (produto != other.produto)
			return false;
		return true;
	}

	// Gets e Sets
	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

}
