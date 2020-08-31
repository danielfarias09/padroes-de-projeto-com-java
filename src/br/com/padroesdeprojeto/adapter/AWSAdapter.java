package br.com.padroesdeprojeto.adapter;

public class AWSAdapter extends Persistencia{
	
	private AWS aws;
	
	public AWSAdapter(AWS aws) {
		this.aws = aws;
	}

	public void salvarArquivo(String arquivo) {
		aws.salvarNaAWS(arquivo);
	}

	public String lerArquivo(String idArquivo) {
		return aws.lerArquivoDaAWS(idArquivo);
	}

}
