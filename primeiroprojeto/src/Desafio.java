import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeCliente = "Nícolas Felipe";
        String tipoConta = "Corrente";
        double saldo = 1000;

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        System.out.println("==============================");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("==============================");

        while (opcao != 4) {
            System.out.println("==============================");
            System.out.println("Escolha uma opção:");
            System.out.println("1 | Consular saldo");
            System.out.println("2 | Transferir valor");
            System.out.println("3 | Depositar valor");
            System.out.println("4 | Sair");
            System.out.println("==============================");
            System.out.print("R: ");

            opcao = leitura.nextInt();

            switch (opcao) {
                case (1):
                    System.out.println("------------------------------");
                    System.out.println("Seu saldo é de R$" + saldo);
                    System.out.println("------------------------------");
                    break;
                case (2):
                    System.out.println("------------------------------");
                    System.out.println("Qual valor deseja transferir?");
                    System.out.print("R: ");
                    double valorTransferencia = leitura.nextDouble();
                    while (valorTransferencia < 0 || valorTransferencia > saldo) {
                        if (valorTransferencia < 0) {
                            System.out.println("O valor deve ser maior do que zero");
                            System.out.println("Qual valor deseja transferir?");
                            System.out.print("R: ");
                        }
                        if (valorTransferencia > saldo) {
                            System.out.println("O valor deve ser igual ou inferior a R$" + saldo);
                            System.out.println("Qual valor deseja transferir?");
                            System.out.print("R: ");
                        }
                        valorTransferencia = leitura.nextDouble();
                    }
                    saldo -= valorTransferencia;
                    System.out.println("Valor de R$" + valorTransferencia + "transferido! Seu saldo atual é de R$" + saldo);
                    break;
                case (3):
                    System.out.println("------------------------------");
                    System.out.println("Qual valor deseja depositar na sua conta?");
                    System.out.print("R: ");
                    double valorDeposito = leitura.nextDouble();
                    while (valorDeposito < 0) {
                        System.out.println("O valor deve ser maior do que zero");
                        System.out.println("Qual valor deseja dapositar?");
                        System.out.print("R: ");
                        valorDeposito = leitura.nextDouble();
                    }
                    saldo += valorDeposito;
                    System.out.println("Valor de R$" + valorDeposito + "depositado na sua conta! Seu saldo atual é de R$" + saldo);
                    break;
                case (4):
                    System.out.println("Obrigado por utilizar nosso sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
