package br.com.fiap.bean;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.ClienteBO;

@ManagedBean
public class ClienteBean {

	private Calendar data;
	
	private int idade;
	
	@PostConstruct
	private void init() {
		data = Calendar.getInstance();
	}
	
	@EJB
	private ClienteBO bo;
	
	public void calcular() {
		idade = bo.calcularIdade(data);
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}