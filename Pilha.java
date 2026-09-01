    public class Pilha {
        private Solicitacao[] solicitacoes;
        private int topo;

        public Pilha(int capacidade) {
            solicitacoes = new Solicitacao[capacidade];
            topo = -1;
        }

        public void empilhar(Solicitacao solicitacao) {
            if (topo < solicitacoes.length - 1) {
                topo++;
                solicitacoes[topo] = solicitacao;
            } else {
                System.out.println("Pilha cheia. Não é possível empilhar.");
            }
        }

        public Solicitacao desempilhar() {
            if (topo >= 0) {
                Solicitacao solicitacao = solicitacoes[topo];
                topo--;
                return solicitacao;
            } else {
                System.out.println("Pilha vazia. Não é possível desempilhar.");
                return null;
            }
        }

        public boolean estaVazia() {
            return topo == -1;
        }

        public int tamanho() {
            return topo + 1;
        }
}
