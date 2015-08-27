package br.com.ciandt.logistica.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.ciandt.logistica.modelo.Mapa;

public class MapaDAO {

	private EntityManagerFactory factory;
	private EntityManager manager;
	

	public MapaDAO(){
		factory = Persistence.createEntityManagerFactory("logistica");
		manager = factory.createEntityManager();
	}

	public void insert(Mapa mapa) {
		manager.persist(mapa);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

	public List<Mapa> getList() {
		Query query = manager.createQuery("Select e from Mapa e");
		List<Mapa> mapas = query.getResultList();
		manager.close();
		factory.close();
		return mapas;
	}
	
	public Mapa getMapa(int id){
		return manager.find(Mapa.class, id);
	}

	public void delete(Mapa mapa) {
		manager.remove(mapa);
		manager.getTransaction().begin();
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
