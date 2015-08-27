package br.com.entity.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.entity.modelo.Pessoa;

public class TestePersist {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity_manager");
		EntityManager manager = factory.createEntityManager();
		
		//Abrindo a Transação
		manager.getTransaction().begin();
		
		//OBJETO NO ESTADO NEW
		Pessoa p = new Pessoa();
		p.setNome("Andréia Nascimento");
		
		//OBJETO NO ESTADO MANAGED
		manager.persist(p);
		
		//SINCRONIZANDO E CONFIRMANDO A TRANSAÇÃO
		manager.getTransaction().commit();
		
		System.out.println("Pessoa id: " + p.getId());
		System.out.println("Pessoa Nome: " + p.getNome());
		
		manager.close();
		factory.close();
	}
}
