package br.com.padroesdeprojeto.factoryMethod;

public abstract class VideoGame {
	
	public String modelo;
	
	public String marca;

	public VideoGame(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public void mostrarEspecificaoes() {
		System.out.println(String.format("Eu sou um %s da marca %s", this.modelo, this.marca));
	}

}
