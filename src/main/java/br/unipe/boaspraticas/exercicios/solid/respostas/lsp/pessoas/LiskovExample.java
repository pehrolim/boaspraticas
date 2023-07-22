package br.unipe.boaspraticas.exercicios.solid.respostas.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {
        // Usando polimorfismo com a referência da classe base (Pessoa)
        Funcionario funcionario1 = new Funcionario("João", 3000);
        funcionario1.fazerSom(); // bom dia!

        // Violando o princípio da substituição de Liskov
        // Usando a referência da classe derivada (Funcionario)
        Funcionario funcionario = new Funcionario("Maria", 4000);
        funcionario.fazerSom(); // Bom dia!

        // O comportamento não é consistente entre as duas referências, o que pode causar problemas.
    }
}
