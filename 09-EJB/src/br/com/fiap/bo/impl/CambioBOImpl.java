package br.com.fiap.bo.impl;

import javax.ejb.Stateful;
import br.com.fiap.bo.CambioBO;

@Stateful
public class CambioBOImpl implements CambioBO {

	private double valorTotal;
	
	@Override
	public void adicionarDolar(double valor) {
		valorTotal += valor;
	}

	@Override
	public double verTotal() {
		return valorTotal;
	}

}
