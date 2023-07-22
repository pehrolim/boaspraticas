package br.unipe.boaspraticas.exercicios.solid.respostas.dip;


//Nesse exemplo, a classe Pedido possui uma dependência direta da classe concreta BancoDeDados. Isso viola o
// Princípio da Inversão de Dependência, pois a classe de alto nível (Pedido) está dependendo diretamente de uma classe
// de baixo nível (BancoDeDados). Isso torna o código mais rígido e difícil de modificar,
// pois qualquer alteração no BancoDeDados pode impactar a classe Pedido.
class Pedido {
    private Dados dados;

    public Pedido(Dados dados) {
        this.dados = dados; // Violando o DIP - dependência direta de uma classe concreta
    }

    public void salvar() {
        dados.salvarPedido(this);
    }
}
