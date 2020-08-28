package br.com.padroesdeprojeto.builder;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList<Telefone>();

    public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public int getDiaNascimento() {
		return diaNascimento;
	}



	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}



	public int getMesNascimento() {
		return mesNascimento;
	}



	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}



	public int getAnoNascimento() {
		return anoNascimento;
	}



	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public List<Telefone> getTelefones() {
		return telefones;
	}



	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}



	@Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dia=" + diaNascimento +
                ", mes=" + mesNascimento +
                ", ano=" + anoNascimento +
                ", endereco=" + endereco +
                ", telefones=" + telefones +
                '}';
    }
}
