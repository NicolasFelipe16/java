package Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sistema {
    // Informações do usuário
    String nomeUsuario;
    double limiteCartao;

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    // Lista de produtos
    ArrayList<Produto> produtos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void obterInfosUsuario() {
        System.out.println("==============================");
        System.out.println("Sistema de compras");
        System.out.println("==============================");
        System.out.print("Nome: ");
        this.nomeUsuario = scanner.nextLine();
        System.out.print("Limite do cartão: ");
        this.limiteCartao = scanner.nextDouble();
    }

    public int menu() {
        System.out.println("==============================");
        System.out.println("Escolha uma opção:");
        System.out.println("1 | Realizar compra");
        System.out.println("2 | Exibir lista de compras");
        System.out.println("3 | Encerrar");
        System.out.println("==============================");
        System.out.print("R: ");
        int opcaoEscolhida = scanner.nextInt();

        return opcaoEscolhida;
    }

//    public void alterarLimiteCartao () {
//        System.out.println("------------------------------");
//        System.out.println("Seu limite atual é de R$" + this.getLimiteCartao());
//        double novoLimiteCartao = 0;
//        System.out.print("Novo limite: ");
//        novoLimiteCartao = scanner.nextDouble();
//
//        while (novoLimiteCartao <= 0) {
//            System.out.println("O limite deve ser maior que R$0,00.");
//            System.out.print("Novo limite: ");
//            novoLimiteCartao = scanner.nextDouble();
//        }
//
//        this.setLimiteCartao(novoLimiteCartao);
//        System.out.println("Ótimo, " + this.getNomeUsuario() + "! Seu limite agora é de R$" + this.getLimiteCartao() + "!");
//    }

    public void realizarCompra () {
        Produto produto = new Produto();
        System.out.println("------------------------------");
        produto.definirNomeProduto();
        produto.definirValorProduto();

        while (true) {
            if (produto.getValorProduto() > this.limiteCartao) {
                System.out.println("A compra excede o limite restante do seu cartão de R$" + this.limiteCartao);
                produto.definirValorProduto();
            } else {
                break;
            }
        }

        produtos.add(produto);
        this.limiteCartao -= produto.getValorProduto();
        System.out.println("Compra de '" + produto.getNomeProduto() + "' no valor de R$" + produto.getValorProduto() + " realizada!");
    }

    public String exibirLista() {
        System.out.println("------------------------------");

        Collections.sort(produtos);
        for (Produto p: produtos) {
            System.out.println("| " + p.nomeProduto + " | " + p.valorProduto + " |");
        }
//        for (int i = 0; i < produtos.size(); i++) {
//        }
        return "";
    }
}
