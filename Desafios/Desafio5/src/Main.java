import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int contador = 0; contador < 5; contador++) {
            // Solicita ao usuário que informe o limite diário de saque
            System.out.println("Informe o limite diário de saque:");
            double limiteDiario = scanner.nextDouble();

            // Verifica se o limite diário de saque é zero
            if (limiteDiario == 0) {
                System.out.println("Transações encerradas.");
                break; // Sai do loop se o limite diário for zero
            }

            // Solicita ao usuário que informe o valor do saque
            System.out.println("Informe o valor do saque:");
            double saque = scanner.nextDouble();

            // Verifica se o valor do saque ultrapassa o limite diário
            if (saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Sai do loop se o limite diário for atingido
            }

            // Verifica se o usuário inseriu 0 para encerrar as transações
            if (saque == 0) {
                System.out.println("Transações encerradas.");
                break; // Sai do loop se o usuário inseriu 0
            }
        }

        scanner.close();
    }
}