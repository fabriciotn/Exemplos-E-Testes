package br.com.mapeamento.testes;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mapeamento.modelo.Candidato;
import br.com.mapeamento.modelo.Endereco;

public class AdicionaCandidatoEndereco {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av. General Carlos Guedes");
		endereco.setNumero(656);
		endereco.setCidade("Belo Horizonte");
		endereco.setEstado("Minas Gerais");
		
		Candidato candidato = new Candidato();
		candidato.setNome("Fabrício Teixeira Nascimento");
		candidato.setNascimento(new GregorianCalendar(1982, 01, 26));
		candidato.setEndereco(endereco);
		
		manager.persist(candidato);
		 	
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
