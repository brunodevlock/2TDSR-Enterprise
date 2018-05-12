package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.fiap.bo.ClienteBO;

public class ConsoleView {

	public static void main(String[] args) throws NamingException {
		//Criar as propriedades para acessar o servidor
		Properties prop = new Properties();
		prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		
		//Informações da aplicação
		Context context = new InitialContext(prop);
		
		//Recuperar o objeto remoto
		ClienteBO bo = (ClienteBO) 
			context.lookup(
					"ejb:/09-EJB/ClienteBOImpl!br.com.fiap.bo.ClienteBO");
		
		int idade = bo.calcularIdade(
				new GregorianCalendar(2010, Calendar.DECEMBER, 2));
		
		System.out.println(idade);
		
	}
	
}



