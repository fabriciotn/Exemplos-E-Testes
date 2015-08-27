package br.com.livraria.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.livraria.modelo.Editora;

public class ListaEditoras {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("Select e from Editora e");
		List<Editora> editoras = query.getResultList();
		
		for (Editora editora : editoras) {
			System.out.println("EDITORA: " + editora.getNome() + " - " + editora.getEmail());
		}
		
		
		manager.close();
		factory.close();
	}
}
