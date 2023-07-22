package br.unipe.boaspraticas.exercicios.solid.respostas.model;

import lombok.Data;

import java.util.List;

@Data
public class Compra {
    private List<ItemCompra> itens;   //Lista de itens
    private double desconto; //desconto a ser aplicado

    // getters e setters omitidos
}
