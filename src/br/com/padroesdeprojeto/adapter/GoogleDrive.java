package br.com.padroesdeprojeto.adapter;

public class GoogleDrive {
	
	public void salvarNoGoogleDrive(String arquivo) {
		System.out.println(String.format("Salvando arquivo %s no GoogleDrive", arquivo));
	}
	
	public String lerArquivoDoGoogleDrive(String nomeArquivo) {
		return String.format("Lendo arquivo %s no GoogleDrive", nomeArquivo);
	}

}
