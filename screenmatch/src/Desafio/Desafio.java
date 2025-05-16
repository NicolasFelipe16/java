package Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        boolean executarSistema = true;

        sistema.obterInfosUsuario();

//        ArrayList<Produto> prods = new ArrayList<>();
//
//        Produto prod1 = new Produto();
//        prod1.setNomeProduto("Prod1");
//        prod1.setValorProduto(10);
//        prods.add(prod1);
//
//        Produto prod2 = new Produto();
//        prod2.setNomeProduto("Prod2");
//        prod2.setValorProduto(20);
//        prods.add(prod2);
//
//        Produto prod3 = new Produto();
//        prod3.setNomeProduto("Prod3");
//        prod3.setValorProduto(30);
//        prods.add(prod3);
//
//        for (int i = 0; i < prods.size(); i++) {
//            System.out.println("#" + (i+1) + " | " + prods.get(i).getNomeProduto());
//        }

        while (executarSistema) {
            int opcaoUsuario = sistema.menu();

            switch (opcaoUsuario) {
                case 1:
                    sistema.realizarCompra();
                    break;

                case 2:
                    sistema.exibirLista();
                    break;

                case 3:
                    executarSistema = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
