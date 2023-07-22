package br.unipe.boaspraticas.exercicios.solid.respostas.srp;

import br.unipe.boaspraticas.exercicios.solid.model.Item;

import java.util.List;


public class Order {
    private int orderId;
    private String customerName;
    private List<Item> items;

    public Order(int orderId, String customerName, List<Item> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    public void calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getP();
        }
        System.out.println("Total Price: " + total);
    }


}
