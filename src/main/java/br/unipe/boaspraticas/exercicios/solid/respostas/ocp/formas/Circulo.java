package br.unipe.boaspraticas.exercicios.solid.respostas.ocp.formas;


public class Circulo implements FormaGeometricaR {
    private double raio;

    // Construtor, getters e setters omitidos
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
