package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Reserva;

public interface ReservaDAO extends GenericDAO<Reserva,Integer>{

	long contarQuantidadePorCliente(int idCliente);
	
	long contarQuantidadePorData(Calendar inicio, Calendar fim);
	
	//Listar as reservas por cidade do cliente
	List<Reserva> buscarPorCidade(String cidade);
	
}





