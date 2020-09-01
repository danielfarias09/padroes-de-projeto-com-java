package br.com.padroesdeprojeto.decorator;

public class BarraVerticalDecorator extends JanelaDecorator{

	public BarraVerticalDecorator(Janela janelaDecoradora) {
		super(janelaDecoradora);
	}
	
	public void desenhar() {
		desenharBarraVertical();
		janelaDecoradora.desenhar();
	}

	
	private void desenharBarraVertical() {
		System.out.println("desenha uma barra vertical na janela");
	}

}
