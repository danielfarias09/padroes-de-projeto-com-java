package br.com.padroesdeprojeto.adapter;
//O padrão Adapter é muito utilizado quando temos que adicionar uma nova biblioteca a um sistema já existente.

//Ex: temos uma classe cliente que depende da classe Persistência, que é responsável por escrever e ler usando a
//API do Dropbox. Posteriormente surge a necessidade de escrever e ler de outras fontes como AWS e GoogleDrive.
//Para que não seja preciso alterar a classe Persistencia e quebrar o sistema, nós criamos um Adaptador
//que estende da classe Persistencia e sobreescreve seus métodos.
//Enviamos o objeto a ser adaptado através do construtor do Adaptador. Sempre que o cliente faz uma solicitação para
//o Adaptador, o mesmo converte essas solicitações para uma forma que o cliente entenda e responde através dos
//métodos sobreescritos.
public class TesteAdapter {

	public static void main(String[] args) {
		Persistencia persistenciaDropbox = new Persistencia();
		persistenciaDropbox.salvarArquivo("Arquivo 1");
		String arquivo1 = persistenciaDropbox.lerArquivo("Arquivo 1");
		System.out.println(arquivo1);
		
		Persistencia persistenciaAWS = new AWSAdapter(new AWS());
		persistenciaAWS.salvarArquivo("Arquivo 2");
		String arquivo2 = persistenciaAWS.lerArquivo("Arquivo 2");
		System.out.println(arquivo2);
		
		Persistencia persistenciaGoogleDrive = new GoogleDriveAdapter(new GoogleDrive());
		persistenciaGoogleDrive.salvarArquivo("Arquivo 3");
		String arquivo3 = persistenciaGoogleDrive.lerArquivo("Arquivo 3");
		System.out.println(arquivo3);
	}

}
