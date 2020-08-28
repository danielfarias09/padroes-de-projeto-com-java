package br.com.padroesdeprojeto.strategy;

import static br.com.padroesdeprojeto.strategy.Constants.*;

public class IPI implements Imposto{
	
	private double valor;
	
	public IPI(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return valor * TAXA_IPI;
	}

}
