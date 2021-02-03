package br.com.padroesdeprojeto.chainOfResponsibility;

public class ValidarNome extends ValidaRequisicao{

    public ValidarNome(PessoaRequest request) {
        super(request);
    }

    @Override
    protected String validarCampo() {
        if(request.getNome().length() < 10) {
            return "O campo nome deve ter mais do que 10 caracteres";
        }
        return null;
    }

}
