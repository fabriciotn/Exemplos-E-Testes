package br.com.mapeamento.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mapeamento.modelo.Autor;
import br.com.mapeamento.modelo.Livro;

public class AdicionaLivroAutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Autor autor1 = new Autor();
		autor1.setNome("Fabricio Nascimento");
		
		Autor autor2 = new Autor();
		autor2.setNome("Fernando Sabino");
		
		Autor autor3 = new Autor();
		autor3.setNome("Cecília Meireles");
		
		Livro livro1 = new Livro();
		livro1.setNome("Livro 01");
		livro1.getAutores().add(autor1);
		livro1.getAutores().add(autor2);
		
		Livro livro2 = new Livro();
		livro2.setNome("Livro 02");
		livro2.getAutores().add(autor2);
		livro2.getAutores().add(autor3);
		
		manager.persist(autor1);
		manager.persist(autor2);
		manager.persist(autor3);
		manager.persist(livro1);
		manager.persist(livro2);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
