package br.com.entity.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.entity.modelo.Pessoa;

public class TesteMerge {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("entity_manager");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		//OBJETO NO ESTADO MANAGED
		Pessoa p1 = manager.find(Pessoa.class, 2L);
		
		//OBJETO NO ESTADO DETACHED
		manager.detach(p1);
		
		//OBJETO P2 NO ESTADO MANAGED
		Pessoa p2 = manager.merge(p1);
		
		//ALTERANDO O CONTEÚDO DO OBJETO
		p2.setNome("Maria Das Couves merge");
		
		//SINCRONIZANDO E CONFIRMANDO A TRANSAÇÃO
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
