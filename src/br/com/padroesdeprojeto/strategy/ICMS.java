package br.com.padroesdeprojeto.strategy;

import static br.com.padroesdeprojeto.strategy.Constants.*;

public class ICMS implements Imposto{
	
	private double valor;
	
	
	public ICMS(double valor) {
		this.valor = valor;
	}


	@Override
	public double calcular() {
		return valor * TAXA_ICMS;
	}

}
