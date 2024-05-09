package br.edu.up.restaurante.sitema;

import java.util.ArrayList;
import java.util.List;

public class FileMenager {
    private String nomeArquivo;

    public FileMenager(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    public void salvarDados(List<String> dados) {

    }
    public List<String> carregarDados() {

        return new ArrayList<>();
    }
}
