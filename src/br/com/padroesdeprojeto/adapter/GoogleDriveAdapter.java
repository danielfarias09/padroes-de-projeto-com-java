package br.com.padroesdeprojeto.adapter;

public class GoogleDriveAdapter extends Persistencia{
	
	private GoogleDrive googleDrive;
	
	public GoogleDriveAdapter(GoogleDrive googleDrive) {
		this.googleDrive = googleDrive;
	}

	public void salvarArquivo(String arquivo) {
		googleDrive.salvarNoGoogleDrive(arquivo);
	}

	public String lerArquivo(String idArquivo) {
		return googleDrive.lerArquivoDoGoogleDrive(idArquivo);
	}

}
