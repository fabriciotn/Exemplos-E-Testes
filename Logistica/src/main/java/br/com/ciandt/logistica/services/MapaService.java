package br.com.ciandt.logistica.services;

import java.beans.DesignMode;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.ciandt.logistica.dao.MapaDAO;
import br.com.ciandt.logistica.dijkstra.BuscaCaminho;
import br.com.ciandt.logistica.modelo.Mapa;

@WebService
public class MapaService {

	@WebMethod
	public void insereMapa(String nomeDoMapa, String origem, String destino, int distancia) {
		MapaDAO dao = new MapaDAO();
		Mapa mapa = new Mapa(nomeDoMapa, origem, destino, distancia);
		dao.insert(mapa);
	}

	@WebMethod
	public String buscaMelhorCaminho(String origem, String destino,
			int autonomiaCaminhao, double valorLitroGasolina) {
		
		String buscaMelhorCaminho = new BuscaCaminho().buscaMelhorCaminho(origem, destino, autonomiaCaminhao, valorLitroGasolina);
		return buscaMelhorCaminho;
	}
}
