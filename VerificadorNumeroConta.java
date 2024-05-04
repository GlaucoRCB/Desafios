import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }

        scanner.close();
    
    }

    private static void verificarNumeroConta(String numeroConta) {
        if(numeroConta.length()==8){
            System.out.println("Numero de conta valido.");
        }
        else{
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}