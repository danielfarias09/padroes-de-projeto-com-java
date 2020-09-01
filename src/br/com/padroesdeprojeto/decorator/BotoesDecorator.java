package br.com.padroesdeprojeto.decorator;

public class BotoesDecorator extends JanelaDecorator{

	public BotoesDecorator(Janela janelaDecoradora) {
		super(janelaDecoradora);
	}
	
	public void desenhar() {
		desenharBotoes();
		janelaDecoradora.desenhar();
	}

	
	private void desenharBotoes() {
		System.out.println("desenha bot�es na janela");
	}

}
