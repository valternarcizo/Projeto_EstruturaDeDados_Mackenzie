public class Fila{
    private Solicitacao[] solicitacoes;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        solicitacoes = new Solicitacao[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(Solicitacao solicitacao) {
        if (tamanho < solicitacoes.length) {
            solicitacoes[fim] = solicitacao;
            fim = (fim + 1) % solicitacoes.length;
            tamanho++;
        } else {
            System.out.println("Fila cheia. Não é possível enfileirar.");
        }
    }

    public Solicitacao desenfileirar() {
        if (tamanho > 0) {
            Solicitacao solicitacao = solicitacoes[inicio];
            inicio = (inicio + 1) % solicitacoes.length;
            tamanho--;
            return solicitacao;
        } else {
            System.out.println("Fila vazia. Não é possível desenfileirar.");
            return null;
        }
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
