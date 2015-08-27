package br.com.entity.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.entity.modelo.Pessoa;

public class TesteDetached {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity_manager");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		//OBJETO NO ESTADO MANAGED
		Pessoa p = manager.find(Pessoa.class, 2L);
		
		//OBJETO NO ESTADO DETACHED
		manager.detach(p);
		
		//ALTERANDO O CONTEÚDO DO OBJETO
		p.setNome("Maria Das Couves detached");
		
		//SINCRONIZANDO E CONFIRMANDO A TRANSAÇÃO
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
