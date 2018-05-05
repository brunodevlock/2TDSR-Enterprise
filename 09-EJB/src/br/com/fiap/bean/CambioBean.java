package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CambioBO;

@ManagedBean
@SessionScoped
public class CambioBean {

	private double valor;
	
	private double valorTotal;
	
	@EJB
	private CambioBO bo;
	
	public void adicionar() {
		bo.adicionarDolar(valor);
		valorTotal = bo.verTotal();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
