package br.com.fiap.jpa.dao.impl;

import br.com.fiap.jpa.entity.Pedido;
import javax.persistence.EntityManager;
import br.com.fiap.jpa.dao.PedidoDAO;

public class PedidoDAOImpl 
				extends GenericDAOImpl<Pedido, Integer>
									implements PedidoDAO{

	public PedidoDAOImpl(EntityManager em) {
		super(em);
	}

}
