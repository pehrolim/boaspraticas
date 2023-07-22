package br.unipe.boaspraticas.exercicios.solid.respostas.sip.animais;

class Peixe implements Animal, Nadar {
    @Override
    public void comer() {
        System.out.println("O peixe está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O peixe está dormindo.");
    }

    @Override
    public void nadar() {
        System.out.println("O peixe está nadando.");
    }
}
