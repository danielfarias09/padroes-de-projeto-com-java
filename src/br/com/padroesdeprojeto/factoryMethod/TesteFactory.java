package br.com.padroesdeprojeto.factoryMethod;

//O Padr�o Factory Method define uma interface para criar um objeto, mas deixa as subclasses decidirem
//qual objeto instanciar.

//Encapsula o c�digo que varia, c�digo de instancia��o de classe. Cada c�digo de cria��o fica em um �nico local, 
//em sua pr�pria classe, criando assim um ponto �nico de atualiza��o. 
//Exemplo? Caso tenha de alterar o construtor da classe, digo, como ele � utilizado pelas classes clientes, dever� 
//alterar apenas esse algoritmo no m�todo de cria��o e n�o em todos os c�digos clientes que utilizariam a cria��o direta.
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
