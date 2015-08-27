package br.com.mapeamento.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mapeamento.modelo.Cliente;
import br.com.mapeamento.modelo.Pedido;

public class AdicionaPedidoCliente {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernateteste");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fabricio Teixeira Nascimento");
		
		Pedido pedido = new Pedido();
		pedido.setData(Calendar.getInstance());
		pedido.setCliente(cliente);
		
		manager.persist(cliente);
		manager.persist(pedido);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
