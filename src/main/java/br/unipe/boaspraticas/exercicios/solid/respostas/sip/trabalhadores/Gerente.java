package br.unipe.boaspraticas.exercicios.solid.respostas.sip.trabalhadores;

class Gerente implements TrabalhadorR {
    @Override
    public void trabalhar() {
        // Implementação do trabalho em tempo integral para um gerente
        System.out.println("Gerente trabalhando em tempo integral.");
    }

}
