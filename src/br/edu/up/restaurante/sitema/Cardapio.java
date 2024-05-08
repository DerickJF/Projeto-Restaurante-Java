package br.edu.up.restaurante.sitema;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> pratos;

    public Cardapio() {
        this.pratos = new ArrayList<>();
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
