package br.com.padroesdeprojeto.chainOfResponsibility;

/*Chain of Responsibility � um padr�o de projeto que cria uma cadeia
de execu��o na qual cada elemento processa as informa��es e em seguida delega a
execu��o ao pr�ximo da sequ�ncia. Em sua implementa��o tradicional, os elementos
s�o percorridos at� que um deles fa�a o tratamento da requisi��o, encerrando
a execu��o depois disso. 
Como alternativa, tamb�m � poss�vel criar uma cadeia de
execu��o onde cada um executa sua funcionalidade at� que a cadeia termine ou ela
seja explicitamente finalizada por um dos elementos.*/
public class TestChainOfResponsability {
    
    public static void main(String[] args) {
        PessoaRequest request = new PessoaRequest("Daniel", "(85) 996376591", "000000000");
        
        ValidaRequisicao validacao = new ValidarNome(request)
        		.proximaValidacao(new ValidarNome(request))
        		.proximaValidacao(new ValidarTelefone(request))
        		.proximaValidacao(new ValidarCPF(request));
        
        for(String erro: validacao.getErrors()) {
            System.out.println(erro);
        }
                
    }

}
