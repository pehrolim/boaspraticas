package br.unipe.boaspraticas.exercicios.solid.respostas.ocp.formas;


public class Retangulo implements FormaGeometricaR {
    private double altura;
    private double largura;

    // Construtor, getters e setters omitidos

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
