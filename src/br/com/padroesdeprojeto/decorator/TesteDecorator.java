package br.com.padroesdeprojeto.decorator;

//O Padr�o Decorator anexa responsabilidades(Decora��es) adicionais a um objeto dinamicamente.
//Uma vez que o Decorator tem o mesmo supertipo que o objeto decorado, podemos passar um objeto decorado
//no lugar do objeto original.
//Podemos decorar um objeto em tempo de execu��o com quantos Decorators quisermos.
public class TesteDecorator {
	
	public static void main(String[] args) {
		Janela janelaDecorator = new BarraVerticalDecorator((new BotoesDecorator(new Janela())));
		janelaDecorator.desenhar();
		
	}
}
