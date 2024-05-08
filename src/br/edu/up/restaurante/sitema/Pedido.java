package br.edu.up.restaurante.sitema;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Prato> itens;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(Prato prato) {
        this.itens.add(prato);
    }
    public void removerItem(Prato prato) {
        this.itens.remove(prato);
    }
    public double calcularTotal() {
        double total = 0;
        for (Prato prato : itens) {
            total += prato.getPreco();
        }
        return total;
    }
    public List<Prato> getItens() {
        return itens;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
