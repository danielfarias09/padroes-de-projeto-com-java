package br.com.padroesdeprojeto.builder;

public class Telefone {

    private int ddd;
    private int numero;
    private TipoTelefone tipo;

    public Telefone(int ddd, int numero, TipoTelefone tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}



	public enum TipoTelefone {
        RESIDENCIAL, CELULAR, COMERCIAL
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "ddd=" + ddd +
                ", numero=" + numero +
                ", tipo=" + tipo +
                '}';
    }
}