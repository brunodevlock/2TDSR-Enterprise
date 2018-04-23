package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.jpa.dao.ContaCorrenteDAO;
import br.com.fiap.jpa.entity.ContaCorrente;
import br.com.fiap.jpa.entity.ContaCorrentePK;

public class ContaCorrenteDAOImpl 
			extends GenericDAOImpl<ContaCorrente,ContaCorrentePK>
					implements ContaCorrenteDAO{

	public ContaCorrenteDAOImpl(EntityManager em) {
		super(em);
	}

}