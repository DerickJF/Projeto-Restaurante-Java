package br.edu.up.restaurante.sitema;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> pratos;

    public Cardapio() {
        this.pratos = new ArrayList<>();

        adicionarPrato(new Prato("Costela Bovina", 74.90));
        adicionarPrato(new Prato("Chapa de Picanha", 98.98));
        adicionarPrato(new Prato("Carré de Carneiro", 59.90));
        adicionarPrato(new Prato("T-Bone", 42.90));
        adicionarPrato(new Prato("Chapa de Alcatra", 69.90));
        adicionarPrato(new Prato("Tomahawk folhado a ouro", 1499.98));
        adicionarPrato(new Prato("Chorizo de Wagyu", 290.99));
        adicionarPrato(new Prato("Salmão ao molho maracujá", 85.98));
    }
    public void adicionarPrato(Prato prato) {
        this.pratos.add(prato);
    }
    public void removerPrato(Prato prato) {
        this.pratos.remove(prato);
    }
    public List<Prato> getPratos() {
        return pratos;
    }
}
