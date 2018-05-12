package br.com.fiap.bo.impl;

import java.util.Calendar;
import javax.ejb.Stateless;
import br.com.fiap.bo.ClienteBO;

@Stateless
public class ClienteBOImpl implements ClienteBO {

	@Override
	public int calcularIdade(Calendar dataNascimento) {
		Calendar hoje = Calendar.getInstance(); //Data atual

		int anoNasc = dataNascimento.get(Calendar.YEAR);
		int mesNasc = dataNascimento.get(Calendar.MONTH);
		int diaNasc = dataNascimento.get(Calendar.DAY_OF_MONTH);
		
		int anoHoje = hoje.get(Calendar.YEAR);
		int mesHoje = hoje.get(Calendar.MONTH);
		int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);

		int idade = anoHoje - anoNasc;
		
		//Fez aniversário??
		if (mesNasc > mesHoje || 
				(mesNasc == mesHoje && diaNasc > diaHoje)) {
			idade--;
		}
		
		return idade;
	}

}