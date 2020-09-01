package br.com.padroesdeprojeto.decorator;

public abstract class JanelaDecorator extends Janela{
	
	protected Janela janelaDecoradora;
	
	public JanelaDecorator(Janela janelaDecoradora) {
		this.janelaDecoradora = janelaDecoradora;
	}

}
