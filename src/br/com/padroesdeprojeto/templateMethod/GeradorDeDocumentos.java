package br.com.padroesdeprojeto.templateMethod;

public abstract class GeradorDeDocumentos {
	
	//O cabeçalho dificilmente vai variar, por isso eu deixo ele fixo ou posso sobreescrever caso seja preciso
	protected void gerarCabecalho() {
		System.out.println("GERANDO O CABEÇALHO");
	}
	
	//O conteúdo do documento sempre vai mudar de um para outro, por esse motivo, as subclasses sempre
	//vão ter que implementar este método
	protected abstract void gerarConteudo();
	
	//O rodapé dificilmente vai variar, por isso eu deixo ele fixo ou posso sobreescrever caso seja preciso
	protected void gerarRodape() {
		System.out.println("GERANDO O RODAPÉ");
	}
	
	//Este método está como final, pois esse vai ser o único que nunca vai mudar.
	//Ele obrigatoriamente vai seguir todos esses passos. 
	public final void gerarDocumento() {
		gerarCabecalho();
		gerarConteudo();
		gerarRodape();
	}

}
