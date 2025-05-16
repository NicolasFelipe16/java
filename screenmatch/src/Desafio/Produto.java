package Desafio;

import java.util.Scanner;

public class Produto implements Comparable<Produto> {
    String nomeProduto;
    double valorProduto;

    Scanner leitura = new Scanner(System.in);

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public void definirNomeProduto() {
        System.out.print("Nome do produto: ");
        String nome = leitura.nextLine();

        this.setNomeProduto(nome);
    }

    public void definirValorProduto() {
        System.out.print("Valor do produto: ");
        double valor = leitura.nextDouble();

        this.setValorProduto(valor);
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.valorProduto).compareTo(Double.valueOf(outroProduto.valorProduto));
    }
}
