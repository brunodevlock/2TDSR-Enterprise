package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> buscarPorTransporte(Transporte transporte);
	
	List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim);
	
	double calcularMediaPreco();
	
	//Contar a quantidade de pacotes que possuem transporte
	long contarPorTransporte();
	
	//Somar os preços dos pacotes por período de data
	double somarPrecoPorPeriodo(Calendar inicio, Calendar fim);
	
	List<Pacote> buscarPorDescricao(String desc);
	
}




