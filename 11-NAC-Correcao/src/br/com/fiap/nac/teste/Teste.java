package br.com.fiap.nac.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.nac.dao.LocacaoDAO;
import br.com.fiap.nac.dao.impl.LocacaoDAOImpl;
import br.com.fiap.nac.entity.Apartamento;
import br.com.fiap.nac.entity.Cliente;
import br.com.fiap.nac.entity.Locacao;
import br.com.fiap.nac.entity.Sexo;
import br.com.fiap.nac.exception.DBException;
import br.com.fiap.nac.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Teste");
		cliente.setSexo(Sexo.MASCULINO);
		cliente.setDataNascimento(Calendar.getInstance());
		
		Apartamento ap = new Apartamento();
		ap.setEndereco("Rua Teste");
		ap.setDetalhes("Testes");
		
		Locacao locacao = new Locacao();
		locacao.setDataFim(Calendar.getInstance());
		locacao.setDataInicio(Calendar.getInstance());
		locacao.setApartamento(ap);
		locacao.setCliente(cliente);
		
		LocacaoDAO dao = new LocacaoDAOImpl(em);
		dao.cadastrar(locacao);
		try {
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();
	}
	
}
