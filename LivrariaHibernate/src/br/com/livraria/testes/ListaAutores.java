package br.com.livraria.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.livraria.modelo.Autor;

public class ListaAutores {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("Select e from Autor e");
		List<Autor> autores = query.getResultList();
		
		for (Autor autor : autores) {
			System.out.println("Autor: " + autor.getId() + " - " + autor.getNome());
		}
		
		manager.close();
		factory.close();
	}
}
