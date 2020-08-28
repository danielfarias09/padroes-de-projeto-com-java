package br.com.padroesdeprojeto.builder;

import java.util.ArrayList;
import java.util.List;

public class PessoaBuilder {
	
	private Pessoa pessoa;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
	public PessoaBuilder() {
		this.pessoa = new Pessoa();
		this.endereco = new Endereco();
	}
	
	public PessoaBuilder comNome(String nome) {
		this.pessoa.setNome(nome);
		return this;
	}
	
	public PessoaBuilder comSobrenome(String sobrenome) {
		this.pessoa.setSobrenome(sobrenome);
		return this;
	}
	
	public PessoaBuilder comDiaNascimento(int dia) {
		this.pessoa.setDiaNascimento(dia);
		return this;
	}
	
	public PessoaBuilder comMesNascimento(int mes) {
		this.pessoa.setMesNascimento(mes);;
		return this;
	}
	
	public PessoaBuilder comAnoNascimento(int ano) {
		this.pessoa.setAnoNascimento(ano);
		return this;
	}
	
	public PessoaBuilder comLogradouro(String logradouro) {
		this.endereco.setLogradouro(logradouro);
		return this;
	}
	
	public PessoaBuilder comNumero(String numero) {
		this.endereco.setNumero(numero);
		return this;
	}
	
	public PessoaBuilder comComplemento(String complemento) {
		this.endereco.setComplemento(complemento);
		return this;
	}
	
	public PessoaBuilder comBairro(String bairro) {
		this.endereco.setBairro(bairro);
		return this;
	}
	
	public PessoaBuilder comCidade(String cidade) {
		this.endereco.setCidade(cidade);
		return this;
	}
	
	public PessoaBuilder comPais(String pais) {
		this.endereco.setPais(pais);
		return this;
	}
	
	public PessoaBuilder comTelefone(int ddd, int numero, Telefone.TipoTelefone tipoTelefone) {
		this.telefones.add(new Telefone(ddd, numero, tipoTelefone));
		return this;
	}
	
	//retorna a instância de pessoa montada com todos os atributos
	public Pessoa build() {
		this.pessoa.setEndereco(this.endereco);
		this.pessoa.setTelefones(this.telefones);
		return this.pessoa;
	}

}
