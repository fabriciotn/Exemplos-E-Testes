package teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import br.com.ciandt.logistica.dao.MapaDAO;
import br.com.ciandt.logistica.dijkstra.Aresta;
import br.com.ciandt.logistica.dijkstra.Caminho;
import br.com.ciandt.logistica.dijkstra.No;
import br.com.ciandt.logistica.modelo.Mapa;

public class testeConexao {

	public static void main(String[] args) {
		/*
		 * Mapa mapa1 = new Mapa("nome do mapa", "origem1", "destino1", 30);
		 * 
		 * MapaDAO dao = new MapaDAO(); dao.insert(mapa1);
		 */

		// MapaDAO dao = new MapaDAO();
		// Mapa mapa = dao.getMapa(1);
		// dao.delete(mapa);

		/*
		 * MapaDAO dao = new MapaDAO(); List<Mapa> mapas = dao.getList(); for
		 * (Mapa mapa : mapas) { System.out.println(mapa.getNome() +
		 * " | Origem: " + mapa.getOrigem() + " | Destino: " + mapa.getDestino()
		 * + " | Distância: " + mapa.getDistancia());
		 * 
		 * }
		 */

		new testeConexao().buscaMelhorCaminho("A", "D", 10, 2.5);
	}

	public void buscaMelhorCaminho(String origem, String destino, int autonomiaCaminhao, double valorLitroGasolina) {

		Vector arestas = new Vector<>();
		HashSet<String> set = new HashSet<String>();

		MapaDAO dao = new MapaDAO();
		List<Mapa> mapas = dao.getList();
		for (Mapa mapa : mapas) {
			System.out.println(mapa.getNome() + " | Origem: " + mapa.getOrigem() + " | Destino: " + mapa.getDestino()
					+ " | Distância: " + mapa.getDistancia());

			arestas.add(new Aresta(new No(mapa.getOrigem()), new No(mapa.getDestino()), mapa.getDistancia()));
			set.add(mapa.getOrigem());
			set.add(mapa.getDestino());
		}
		
		No[] nos = new No[set.size()];
		Iterator<String> iterator = set.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			nos[i] = new No(iterator.next());
			nos[i].setArestas(arestas);
			i++;
		}
		
		Caminho caminho = new Caminho(nos);
		
		for (int j = 0; j < nos.length; j++) {
			System.out.println("no: " + j + " -> " + nos[j]);
		}
		
		No ori = new No(origem);
		No des = new No(destino);
		ori.setArestas(arestas);
		des.setArestas(arestas);
		
		No[] menor = caminho.menorCaminho(ori, des);
		double distancia = 0;
		String text = "O menor caminho entre " + origem + " e " + destino + " é: ";
		if (menor != null) {
			int count = 0;
			for (int k = 0; k < menor.length; k++) {
				if (menor[k] != null) {
					count++;
					
					if (k > 0)
						text += ", ";
					
					text += menor[k];
					distancia = menor[k].getD();
				}
			}
			text += " - Distância: " + distancia;
			text += ".";
		}
		
		System.out.println(text);
		System.out.println(calculaGastos(autonomiaCaminhao, valorLitroGasolina, distancia));
	}
	
	private double calculaGastos(double autonomia, double valorPorLitro, double distancia){
		return ((distancia / autonomia) * valorPorLitro);
	}
}