package br.com.padroesdeprojeto.chainOfResponsibility;

public class ValidarTelefone extends ValidaRequisicao{

    public ValidarTelefone(PessoaRequest request) {
        super(request);
    }

    @Override
    protected String validarCampo() {
        if(!request.getTelefone().contains("+55")) {
            return "O telefone deve obrigatoriamente ser do Brasil.";
        }
        return null;
    }

}
