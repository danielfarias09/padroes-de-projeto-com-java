package br.com.padroesdeprojeto.builder.factoryMethod;

//O Padrão Factory Method define uma interface para criar um objeto, mas deixa as subclasses decidirem
//qual objeto instanciar.

//Encapsula o código que varia, código de instanciação de classe. Cada código de criação fica em um único local, 
//em sua própria classe, criando assim um ponto único de atualização. 
//Exemplo? Caso tenha de alterar o construtor da classe, digo, como ele é utilizado pelas classes clientes, deverá 
//alterar apenas esse algoritmo no método de criação e não em todos os códigos clientes que utilizariam a criação direta.
public class TesteFactory {

	public static void main(String[] args) {
		
		VideoGameFactory fabricaMicrosoft = new FabricaXbox();
		VideoGameFactory fabricaNintendo = new FabricaNintendo();
		VideoGameFactory fabricaPlaystation = new FabricaXbox();
		
		VideoGame xbox = fabricaMicrosoft.fabricarVideoGame("Xbox one S");
		VideoGame nintendoSwitch = fabricaNintendo.fabricarVideoGame("Nintendo Switch");
		VideoGame nintendoWii = fabricaNintendo.fabricarVideoGame("Nintendo Wii");
		VideoGame ps4 = fabricaPlaystation.fabricarVideoGame("Playstation 4");
		
		xbox.mostrarEspecificaoes();
		nintendoSwitch.mostrarEspecificaoes();
		nintendoWii.mostrarEspecificaoes();
		ps4.mostrarEspecificaoes();

	}

}
