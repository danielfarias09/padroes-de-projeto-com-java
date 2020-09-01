package br.com.padroesdeprojeto.templateMethod;

//O padr�o Template Method pode ser usado para implementar as partes fixas de um algoritmo uma s� vez
//e deixar para as subclasses a implementa��o do comportamento que pode variar.
public class TesteTemplateMethod {

	public static void main(String[] args) {
		GeradorDeDocumentos geradorDeDocumentos = new GeradorDeNotaFiscal();
		geradorDeDocumentos.gerarDocumento();
		
		GeradorDeDocumentos geradorDeReceitaMedica = new GeradorDeReceitaMedica();
		geradorDeReceitaMedica.gerarDocumento();

	}

}
