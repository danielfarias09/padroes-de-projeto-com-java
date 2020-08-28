package br.com.padroesdeprojeto.builder;

import br.com.padroesdeprojeto.builder.Telefone.TipoTelefone;

//Podemos notar que a complexidade na cria��o de objetos fica muito mais simples, transparente e mais f�cil de ler,
//pois o padr�o Builder encapsula toda a l�gica de cria��o.
//Mesclando o padr�o Builder com o uso de Interfaces Fluentes, a leitura se torna mais
//clara e pr�xima da linguagem humana.
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
				.comComplemento("Pr�ximo ao supermercado Center Box")
				.comBairro("Centro")
				.comCidade("Fortaleza")
				.comPais("Brasil")
				.build();
		
		System.out.println(pessoa.toString());

	}

}
