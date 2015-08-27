package br.com.mapeamento.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mapeamento.modelo.Pessoa;
import br.com.mapeamento.modelo.PessoaFisica;
import br.com.mapeamento.modelo.PessoaJuridica;

public class AdicionaPessoa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Fabricio");
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Andreia");
		p2.setCpf("12345");
		
		PessoaJuridica p3 = new PessoaJuridica();
		p3.setNome("empresa1");
		p3.setCnpj("998565");
		
		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
