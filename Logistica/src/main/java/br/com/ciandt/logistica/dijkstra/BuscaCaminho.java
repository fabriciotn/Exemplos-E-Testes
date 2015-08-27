package br.com.ciandt.logistica.dijkstra;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import br.com.ciandt.logistica.dao.MapaDAO;
import br.com.ciandt.logistica.modelo.Mapa;

public class BuscaCaminho {

	public String buscaMelhorCaminho(String origem, String destino, int autonomiaCaminhao, double valorLitroGasolina) {

		Vector arestas = new Vector<>();
		HashSet<String> set = new HashSet<String>();

		MapaDAO dao = new MapaDAO();
		List<Mapa> mapas = dao.getList();
		for (Mapa mapa : mapas) {
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
		
		No ori = new No(origem);
		No des = new No(destino);
		ori.setArestas(arestas);
		des.setArestas(arestas);
		
		No[] menor = caminho.menorCaminho(ori, des);
		double distancia = 0;
		String text = "O menor caminho entre " + origem + " e " + " é: ";
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
		text += " - Com custo de R$" + calculaGastos(autonomiaCaminhao, valorLitroGasolina, distancia);
		return text;
	}
	
	private double calculaGastos(double autonomia, double valorPorLitro, double distancia){
		return ((distancia / autonomia) * valorPorLitro);
	}
}
