package br.com.padroesdeprojeto.templateMethod;

public class GeradorDeReceitaMedica extends GeradorDeDocumentos{

	@Override
	protected void gerarConteudo() {
		System.out.println("DOCUMENTO DE RECEITA MÉDICA");
	}

}
