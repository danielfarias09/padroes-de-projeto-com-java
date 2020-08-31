package br.com.padroesdeprojeto.adapter;

public class Dropbox {
	
	public void salvarNoDropbox(String arquivo) {
		System.out.println(String.format("Salvando arquivo %s no Dropbox", arquivo));
	}
	
	public String lerArquivoDoDropbox(String nomeArquivo) {
		return String.format("Lendo arquivo %s no Dropbox", nomeArquivo);
	}

}
