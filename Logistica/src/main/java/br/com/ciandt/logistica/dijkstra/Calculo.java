package br.com.ciandt.logistica.dijkstra;

public class Calculo {

	private double calculaGastos(double autonomia, double valorPorLitro, double distancia){
		return ((distancia / autonomia) * valorPorLitro);
	}
}
