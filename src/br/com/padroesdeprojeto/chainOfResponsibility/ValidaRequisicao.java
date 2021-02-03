package br.com.padroesdeprojeto.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class ValidaRequisicao {
    
    private ValidaRequisicao proxima;
    
    protected PessoaRequest request;
    
    private List<String> errors = new ArrayList<>();
    
    public ValidaRequisicao(PessoaRequest request) {
        this.request = request;
    }
    
    public ValidaRequisicao proximaValidacao(ValidaRequisicao validador) {
    	//Caso a validação anterior tenha algum erro, será adicionado à validação atual para que
    	//os erros sejam acumulados e assim por diante.
    	validador.getErrors().addAll(errors);
    	
    	String erro = validador.validarCampo();
    	
        if(erro != null) 
        	validador.getErrors().add(erro);
      	
        if(proxima == null) {
          return validador;
        }else {
          return proxima.proximaValidacao(validador);//itera sobre todas as validações de forma recurssiva
        }
    }
    
    //Cada classe de validação deve implementar suas regras próprias
    protected abstract String validarCampo();
    
      
    public List<String> getErrors(){
        return errors;
    }

}
