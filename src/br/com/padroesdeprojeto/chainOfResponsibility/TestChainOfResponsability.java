package br.com.padroesdeprojeto.chainOfResponsibility;

/*Chain of Responsibility é um padrão de projeto que cria uma cadeia
de execução na qual cada elemento processa as informações e em seguida delega a
execução ao próximo da sequência. Em sua implementação tradicional, os elementos
são percorridos até que um deles faça o tratamento da requisição, encerrando
a execução depois disso. 
Como alternativa, também é possível criar uma cadeia de
execução onde cada um executa sua funcionalidade até que a cadeia termine ou ela
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
