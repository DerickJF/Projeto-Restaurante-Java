package br.edu.up.restaurante;

import br.edu.up.restaurante.sitema.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        List<Pedido> pedidos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("===== Restaurante Menu =====");
            System.out.println("1. Adicionar prato ao cardápio");
            System.out.println("2. Fazer pedido");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarPratoAoCardapio(scanner, cardapio);
                    break;
                case 2:
                    fazerPedido(scanner, cardapio, pedidos);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);
    }

    private static void adicionarPratoAoCardapio(Scanner scanner, Cardapio cardapio) {
        System.out.print("Nome do prato: ");
        String nome = scanner.next();
        System.out.print("Descrição do prato: ");
        String descricao = scanner.next();
        System.out.print("Preço do prato: ");
        double preco = scanner.nextDouble();
        Prato prato = new Prato(nome, descricao, preco);
        cardapio.adicionarPrato(prato);
        System.out.println("Prato adicionado ao cardápio com sucesso!");
    }

    private static void fazerPedido(Scanner scanner, Cardapio cardapio, List<Pedido> pedidos) {
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        Cliente cliente = new Cliente(nomeCliente, "");
        Pedido pedido = new Pedido(cliente);

        int opcao;
        do {
            System.out.println("===== Menu de Pedidos =====");
            System.out.println("Cardápio:");
            for (int i = 0; i < cardapio.getPratos().size(); i++) {
                System.out.println((i + 1) + ". " + cardapio.getPratos().get(i).getNome() +
                        " - R$" + cardapio.getPratos().get(i).getPreco());
            }
            System.out.println("0. Finalizar pedido");
            System.out.print("Escolha um prato ou digite 0 para finalizar o pedido: ");
            opcao = scanner.nextInt();

            if (opcao > 0 && opcao <= cardapio.getPratos().size()) {
                Prato pratoSelecionado = cardapio.getPratos().get(opcao - 1);
                pedido.adicionarItem(pratoSelecionado);
                System.out.println("Prato adicionado ao pedido: " + pratoSelecionado.getNome());
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Por favor, escolha um prato válido.");
            }
        } while (opcao != 0);

        pedidos.add(pedido);
        System.out.println("Pedido realizado com sucesso!");
    }
}
