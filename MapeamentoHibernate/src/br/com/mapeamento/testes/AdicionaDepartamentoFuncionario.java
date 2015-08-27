package br.com.mapeamento.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mapeamento.modelo.Departamento;
import br.com.mapeamento.modelo.Funcionario;

public class AdicionaDepartamentoFuncionario {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Fabricio Teixeira Nascimento");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Andréia Araújo de Almeida Nascimento");
		
		Departamento departamento = new Departamento();
		departamento.setNome("Administração de Sistemas");
		departamento.getFuncionarios().add(funcionario);
		departamento.getFuncionarios().add(funcionario2);
		
		manager.persist(funcionario);
		manager.persist(funcionario2);
		manager.persist(departamento);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
