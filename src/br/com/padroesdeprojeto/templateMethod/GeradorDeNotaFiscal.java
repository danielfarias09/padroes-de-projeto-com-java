package br.com.padroesdeprojeto.templateMethod;

public class GeradorDeNotaFiscal extends GeradorDeDocumentos{

	@Override
	protected void gerarConteudo() {
		System.out.println("DOCUMENTO DE NOTA FISCAL");
	}

}
