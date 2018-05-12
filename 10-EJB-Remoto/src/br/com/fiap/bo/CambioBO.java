package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface CambioBO {

	void adicionarDolar(double valor);
	
	double verTotal();
	
}
