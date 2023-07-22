package br.unipe.boaspraticas.exercicios.solid.respostas.ocp;

import br.unipe.boaspraticas.exercicios.solid.model.Compra;
import br.unipe.boaspraticas.exercicios.solid.model.ItemCompra;

// Classe responsável por calcular o valor total de uma compra
public class CalculadoraDeCompra {
    public double calcularTotal(Compra compra) {
        double total = 0;
        for (ItemCompra item : compra.getI()) {
            total += item.getPu() * item.getQtd();
        }
        if (compra.getDesc() > 0) {
            total -= total * (compra.getDesc() / 100);
        }
        return total;
    }
}


