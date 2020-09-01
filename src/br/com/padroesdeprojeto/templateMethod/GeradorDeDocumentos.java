package br.com.padroesdeprojeto.templateMethod;

public abstract class GeradorDeDocumentos {
	
	//O cabe�alho dificilmente vai variar, por isso eu deixo ele fixo ou posso sobreescrever caso seja preciso
	protected void gerarCabecalho() {
		System.out.println("GERANDO O CABE�ALHO");
	}
	
	//O conte�do do documento sempre vai mudar de um para outro, por esse motivo, as subclasses sempre
	//v�o ter que implementar este m�todo
	protected abstract void gerarConteudo();
	
	//O rodap� dificilmente vai variar, por isso eu deixo ele fixo ou posso sobreescrever caso seja preciso
	protected void gerarRodape() {
		System.out.println("GERANDO O RODAP�");
	}
	
	//Este m�todo est� como final, pois esse vai ser o �nico que nunca vai mudar.
	//Ele obrigatoriamente vai seguir todos esses passos. 
	public final void gerarDocumento() {
		gerarCabecalho();
		gerarConteudo();
		gerarRodape();
	}

}
