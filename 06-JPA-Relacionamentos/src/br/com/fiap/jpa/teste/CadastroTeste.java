package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.NotaFiscalDAO;
import br.com.fiap.jpa.dao.PedidoDAO;
import br.com.fiap.jpa.dao.impl.NotaFiscalDAOImpl;
import br.com.fiap.jpa.dao.impl.PedidoDAOImpl;
import br.com.fiap.jpa.entity.NotaFiscal;
import br.com.fiap.jpa.entity.Pedido;
import br.com.fiap.jpa.entity.StatusPedido;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class CadastroTeste {

	public static void main(String[] args) {
		//Cadastrar a Nota Fiscal e o Pedido
		EntityManagerFactory fabrica = 
			EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		PedidoDAO pedidoDao = new PedidoDAOImpl(em);
		NotaFiscalDAO notaDao = new NotaFiscalDAOImpl(em);
		
		Pedido pedido = new Pedido("Churros", StatusPedido.APROVADO);
		NotaFiscal nota = new NotaFiscal(5, "121313", pedido);
		
		try {
			pedidoDao.create(pedido);
			notaDao.create(nota);
			notaDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();
	}
	
}