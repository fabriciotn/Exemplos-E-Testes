package br.com.livraria.testes;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.livraria.modelo.Autor;

public class InsereAutores {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		Autor autor = new Autor();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome do autor: ");
		autor.setNome(scanner.nextLine());
		scanner.close();
		
		manager.persist(autor);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
