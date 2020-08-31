package br.com.padroesdeprojeto.adapter;

public class AWS {
	
	public void salvarNaAWS(String arquivo) {
		System.out.println(String.format("Salvando arquivo %s no AWS", arquivo));
	}
	
	public String lerArquivoDaAWS(String nomeArquivo) {
		return String.format("Lendo arquivo %s no AWS", nomeArquivo);
	}

}
