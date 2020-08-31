package br.com.padroesdeprojeto.adapter;

public class Persistencia {
	
	private Dropbox dropbox = new Dropbox();
	
	public void salvarArquivo(String arquivo) {
		dropbox.salvarNoDropbox(arquivo);
	}
	
	public String lerArquivo(String nomeArquivo) {
		return dropbox.lerArquivoDoDropbox(nomeArquivo);
	}

}
