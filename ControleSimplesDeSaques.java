import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double novoSaldo = 0;

        for (double i = 0; i <= limiteDiario; i = novoSaldo) {

            double saque = scanner.nextDouble();
            double novoSaldoDiario = limiteDiario - saque;

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                novoSaldo = novoSaldo + saque;
                System.out.println("Saque realizado. Limite restante: " + novoSaldoDiario);
            }
        }
        scanner.close();
    }
}