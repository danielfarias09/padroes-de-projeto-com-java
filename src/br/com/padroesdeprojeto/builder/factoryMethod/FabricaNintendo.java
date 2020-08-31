package br.com.padroesdeprojeto.builder.factoryMethod;

public class FabricaNintendo implements VideoGameFactory {

	@Override
	public VideoGame fabricarVideoGame(String modelo) {
		return new Nintendo(modelo, "Nintendo");
	}

}
