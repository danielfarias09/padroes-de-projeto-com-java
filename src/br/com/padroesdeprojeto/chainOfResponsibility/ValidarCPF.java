package br.com.padroesdeprojeto.chainOfResponsibility;

public class ValidarCPF extends ValidaRequisicao{

	public ValidarCPF(PessoaRequest request) {
		super(request);
	}

	@Override
	protected String validarCampo() {
		if(request.getCpf().length() < 11) {
            return "O campo CPF não pode ter menos que 11 caracteres";
        }
        return null;
	}

}
