package br.com.padroesdeprojeto.builder;

import java.util.ArrayList;
import java.util.List;

//Bastante complexo e trabalhoso para montar objetos grandes e complexos, além de usar muitas linhas de código
public class TesteCadastroPessoaComSet {
	
	public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alice");
        pessoa.setSobrenome("dos Santos");
        pessoa.setDiaNascimento(22);
        pessoa.setMesNascimento(5);
        pessoa.setAnoNascimento(1980);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua das Oliveiras");
        endereco.setNumero("272");
        endereco.setComplemento("Bloco B");
        endereco.setCidade("Porto Alegre");
        endereco.setBairro("Centro");
        endereco.setPais("Brasil");

        pessoa.setEndereco(endereco);

        List<Telefone> telefones = new ArrayList<Telefone>();

        Telefone residencial =  new Telefone(51, 32221236, Telefone.TipoTelefone.RESIDENCIAL);
        
        Telefone celular = new Telefone(51, 99623632, Telefone.TipoTelefone.CELULAR);

        telefones.add(residencial);
        telefones.add(celular);

        pessoa.setTelefones(telefones);

        System.out.println(pessoa.toString());
    }

}
