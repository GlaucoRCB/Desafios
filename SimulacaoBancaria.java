import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean encerrar = true;
        double saldo = 0;

        while (encerrar) {

            int opcao = 0;
            try {
                opcao = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
                continue; // Reinicia o loop
            }

            switch (opcao) {
                case 1:
                    saldo = depositar(saldo, scanner);
                    break;
                case 2:
                    saldo = sacar(saldo, scanner);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 4:
                    encerrar = encerrarPrograma(encerrar);
                    System.out.println("Programa encerrado.");
                    break;
                case 0:
                    encerrar = encerrarPrograma(encerrar);
                    System.out.println("Programa encerrado.");
                    break;   
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        }

        scanner.close(); // Fecha o scanner ao final do programa
    }

    static double depositar(double saldo, Scanner scanner) {
        double valorDeposito = 0;
        try {
            valorDeposito = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Valor inválido. Por favor, digite um número real.");
            scanner.nextLine(); // Limpa o buffer do scanner
            return saldo; // Retorna o saldo atual sem alterações
        }
        saldo += valorDeposito;
        System.out.println("Saldo atual: " + saldo);
        return saldo;
    }

    static double sacar(double saldo, Scanner scanner) {
        double valorSaque = 0;
        try {
            valorSaque = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Valor inválido. Por favor, digite um número real.");
            scanner.nextLine(); // Limpa o buffer do scanner
            return saldo; // Retorna o saldo atual sem alterações
        }
        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valorSaque;
            System.out.println("Saldo atual: " + saldo);
        }
        return saldo;
    }

    static boolean encerrarPrograma(boolean encerrar) {
        return false;
    }

}
