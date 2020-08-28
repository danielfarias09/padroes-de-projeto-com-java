package br.com.padroesdeprojeto.strategy;

import static br.com.padroesdeprojeto.strategy.Constants.*;

public class IOF implements Imposto{
	
	private double valor;

	public IOF(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return valor * TAXA_IOF;
	}

}
