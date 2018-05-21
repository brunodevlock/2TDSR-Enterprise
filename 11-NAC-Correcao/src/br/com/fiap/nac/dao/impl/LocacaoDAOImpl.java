package br.com.fiap.nac.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import br.com.fiap.nac.dao.LocacaoDAO;
import br.com.fiap.nac.entity.Locacao;

public class LocacaoDAOImpl 
				extends GenericDAOImpl<Locacao, Integer>
											implements LocacaoDAO{

	public LocacaoDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Locacao> buscarPorNomeCliente(String nome) {
		return em.createQuery(
				"from Locacao L where L.cliente.nome like :churros"
				,Locacao.class)
				.setParameter("churros", "%"+nome+"%")
				.getResultList();
	}

	@Override
	public long contarPorDataFim(Calendar i, Calendar f) {
		return em.createQuery(
				"select count(L) from Locacao L where "
				+ "L.dataFim between :x and :y",Long.class)
				.setParameter("x", i)
				.setParameter("y", f)
				.getSingleResult();
	}

}






