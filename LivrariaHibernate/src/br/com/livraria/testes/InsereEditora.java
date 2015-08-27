package br.com.livraria.testes;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.livraria.modelo.Editora;


public class InsereEditora {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		Editora editora = new Editora();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nome da Editora: ");
		editora.setNome(scanner.nextLine());
		
		System.out.println("E-mail da Editora: ");
		editora.setEmail(scanner.nextLine());
		scanner.close();
		
		manager.persist(editora);
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
