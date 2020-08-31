package br.com.padroesdeprojeto.builder.factoryMethod;

public class FabricaXbox implements VideoGameFactory {

	@Override
	public VideoGame fabricarVideoGame(String modelo) {
		return new Xbox(modelo, "Microsoft");
	}

}
