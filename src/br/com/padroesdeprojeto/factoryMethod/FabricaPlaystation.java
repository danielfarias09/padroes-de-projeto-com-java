package br.com.padroesdeprojeto.factoryMethod;

public class FabricaPlaystation implements VideoGameFactory {

	@Override
	public VideoGame fabricarVideoGame(String modelo) {
		return new Playstation(modelo, "Sony");
	}

}
