package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.ConsultaDAO;
import br.com.fiap.jpa.dao.ContaCorrenteDAO;
import br.com.fiap.jpa.dao.impl.ConsultaDAOImpl;
import br.com.fiap.jpa.dao.impl.ContaCorrenteDAOImpl;
import br.com.fiap.jpa.entity.Consulta;
import br.com.fiap.jpa.entity.ContaCorrente;
import br.com.fiap.jpa.entity.Medico;
import br.com.fiap.jpa.entity.Paciente;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ChaveCompostaTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();

		ContaCorrenteDAO dao = new ContaCorrenteDAOImpl(em);
		ContaCorrente cc = new ContaCorrente(1, 1, 100, 
				new GregorianCalendar(2010, Calendar.MARCH, 20));
		
		try {
			dao.create(cc);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		Medico medico = new Medico(123, "João", 10000, 123);
		Paciente paciente = new Paciente("Maria",
				new GregorianCalendar(1999, Calendar.JULY, 2));
		Consulta consulta = new Consulta(medico, paciente,
				Calendar.getInstance(), true, "2A");
		
		ConsultaDAO consultaDao = new ConsultaDAOImpl(em);
		try {
			consultaDao.create(consulta);
			consultaDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		em.close();
		fabrica.close();
	}
	
}
