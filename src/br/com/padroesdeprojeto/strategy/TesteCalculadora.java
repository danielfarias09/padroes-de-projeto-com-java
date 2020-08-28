package br.com.padroesdeprojeto.strategy;

//Com o padrão strategy, eu posso mudar minha estratégia em tempo de execução.
//Ou seja, conseguimos realizar a mesma operação de diferentes maneiras.
//Para cada imposto criamos uma classe que implementa a interface Imposto.
//Ao invés de ter vários IFs para identificar o imposto correto, apenas
//passamos o imposto desejado para que ele seja calculado pela nossa calculadora,
// e ela já saberá como calcular cada um dos impostos, pois cada um possui uma implementação diferente de Imposto.
public class TesteCalculadora {

	public static void main(String[] args) {
		ICMS icms = new ICMS(100.0);
		IPI ipi = new IPI(100.0);
		IOF iof = new IOF(100.0);
		
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		calculadora.calcular(icms);
		calculadora.calcular(ipi);
		calculadora.calcular(iof);
	}

}
