package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.entity.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva,Integer> implements ReservaDAO {

	public ReservaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public long contarQuantidadePorCliente(int idCliente) {
		return em.createQuery("select count(r) from Reserva r "
				+ "where r.cliente.id = :codigo",Long.class)
				.setParameter("codigo", idCliente)
				.getSingleResult();
	}

	@Override
	public long contarQuantidadePorData(Calendar inicio, Calendar fim) {
		return em.createQuery("select count(r) from Reserva r "
				+ "where r.dataReserva between :i and :f",Long.class)
				.setParameter("i", inicio)
				.setParameter("f", fim)
				.getSingleResult();
	}

	@Override
	public List<Reserva> buscarPorCidade(String cidade) {
		return em.createNamedQuery(
			"Reserva.porCidade",Reserva.class)
			.setParameter("churros", cidade)
			.getResultList();
	}

}





