package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.ConversaoBO;

@ManagedBean
public class ConversaoBean {

	private double valor;
	
	private double resultado;
	
	@EJB
	private ConversaoBO bo;
	
	public void converter() {
		resultado = bo.converterDolarReal(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
