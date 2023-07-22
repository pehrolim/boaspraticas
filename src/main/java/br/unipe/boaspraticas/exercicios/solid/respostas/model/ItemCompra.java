package br.unipe.boaspraticas.exercicios.solid.respostas.model;


import lombok.Data;

@Data
public class ItemCompra {
    private String nomePessoa;  //NOME da pessoa realizando compra

    private double precoCompra; //Preço da compra
    private int quantidade;  // Quantidade de itens

}
