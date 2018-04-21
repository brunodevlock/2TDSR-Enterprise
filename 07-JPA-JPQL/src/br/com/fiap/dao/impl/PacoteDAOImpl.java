package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> buscarPorTransporte(Transporte transporte) {
		return em.createQuery("from Pacote p where p.transporte = :tr",Pacote.class)
				.setParameter("tr", transporte)
				.getResultList();
	}

	@Override
	public List<Pacote> buscarPorDatas(Calendar inicio, Calendar fim) {
		return em.createQuery("from Pacote p where "
				+ "p.dataSaida between :i and :f",Pacote.class)
				.setParameter("i", inicio)
				.setParameter("f", fim)
				.getResultList();
	}

	@Override
	public double calcularMediaPreco() {
		return em.createQuery("select avg(p.preco) from Pacote p"
				,Double.class).getSingleResult();
	}

	@Override
	public long contarPorTransporte() {
		return em.createNamedQuery(
			"Pacote.contarPorTransporte",Long.class)
			.getSingleResult();
	}

	@Override
	public double somarPrecoPorPeriodo(Calendar inicio, Calendar fim) {
		return em.createNamedQuery(
			"Pacote.somarPorData",Double.class)
				.setParameter("i", inicio)
				.setParameter("f", fim)
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pacote> buscarPorDescricao(String desc) {
		return em.createNativeQuery("select * from "
				+ "JPA_T_PACOTE where DS_PACOTE like :d",
				Pacote.class)
				.setParameter("d", "%"+desc+"%")
				.getResultList();
	}

}






