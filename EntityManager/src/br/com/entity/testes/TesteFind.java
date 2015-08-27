package br.com.entity.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.entity.modelo.Pessoa;

public class TesteFind {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity_manager");
		EntityManager manager = factory.createEntityManager();
		
		//OBJETO NO ESTADO MANAGED
		Pessoa p = manager.find(Pessoa.class, 2L);
		System.out.println("ID: " + p.getId());
		System.out.println("Nome: " + p.getNome());
		
		manager.close();
		factory.close();
	}
}
