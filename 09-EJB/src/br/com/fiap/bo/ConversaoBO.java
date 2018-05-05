package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface ConversaoBO {

	double converterDolarReal(double dolar);
	
}