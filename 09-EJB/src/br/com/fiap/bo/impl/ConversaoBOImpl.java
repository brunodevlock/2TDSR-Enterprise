package br.com.fiap.bo.impl;

import javax.ejb.Stateless;
import br.com.fiap.bo.ConversaoBO;

@Stateless
public class ConversaoBOImpl implements ConversaoBO {

	@Override
	public double converterDolarReal(double dolar) {
		return dolar*3.5;
	}

}