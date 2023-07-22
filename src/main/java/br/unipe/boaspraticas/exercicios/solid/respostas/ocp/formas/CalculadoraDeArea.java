package br.unipe.boaspraticas.exercicios.solid.respostas.ocp.formas;

import br.unipe.boaspraticas.exercicios.solid.model.FormaGeometrica;


// Neste exemplo, temos uma classe CalculadoraDeArea que calcula a área total de um conjunto de
// formas geométricas. Porém, para adicionar uma nova forma geométrica,
// é necessário modificar a classe CalculadoraDeArea para lidar com o novo tipo, o que também viola o OCP.
// Classe que calcula a área total de um conjunto de formas geométricas
public class CalculadoraDeArea {
    public double calcularAreaTotal(FormaGeometricaR[] formas) {
        double areaTotal = 0;
        for (FormaGeometricaR forma : formas) {
            if (forma instanceof Retangulo) {
                areaTotal += ((Retangulo) forma).calcularArea();
            } else if (forma instanceof Circulo) {
                areaTotal += ((Circulo) forma).calcularArea();
            }
        }
        return areaTotal;
    }
}
