package br.com.mapeamento.testes;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mapeamento.modelo.Estado;
import br.com.mapeamento.modelo.Governador;

public class AdicionaEstadoGovernador {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Governador governador = new Governador();
		governador.setNome("Fabricio Nascimento");
		
		Estado estado = new Estado();
		estado.setNome("Minas Gerais");
		estado.setGovernador(governador);
		
		manager.persist(governador);
		manager.persist(estado);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
