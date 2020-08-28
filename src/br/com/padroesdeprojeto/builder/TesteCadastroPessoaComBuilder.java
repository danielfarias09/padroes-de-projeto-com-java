package br.com.padroesdeprojeto.builder;

import br.com.padroesdeprojeto.builder.Telefone.TipoTelefone;

//Podemos notar que a complexidade na criação de objetos fica muito mais simples, transparente e mais fácil de ler,
//pois o padrão Builder encapsula toda a lógica de criação.
//Mesclando o padrão Builder com o uso de Interfaces Fluentes, a leitura se torna mais
//clara e próxima da linguagem humana.
public class TesteCadastroPessoaComBuilder {

	public static void main(String[] args) {
		Pessoa pessoa = new PessoaBuilder()
				.comNome("Daniel")
				.comSobrenome("Farias")
				.comDiaNascimento(27)
				.comMesNascimento(11)
				.comAnoNascimento(1990)
				.comTelefone(85, 99635671, TipoTelefone.CELULAR)
				.comTelefone(85, 36673561, TipoTelefone.RESIDENCIAL)
				.comLogradouro("Rua A")
				.comNumero("43")
				.comComplemento("Próximo ao supermercado Center Box")
				.comBairro("Centro")
				.comCidade("Fortaleza")
				.comPais("Brasil")
				.build();
		
		System.out.println(pessoa.toString());

	}

}
