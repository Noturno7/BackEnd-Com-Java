// Desafio de simulação de operações bancarias feitas executadas pelo terminal.

// Bibliotecas
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variáveis e scanner
        Scanner scanner = new Scanner(System.in);
        double saldo = 0, saque = 0, saldoFinal = 0;
        int operacao;

        // Looping operacional
        while (true) {
            // Mensagem inicial
            System.out.println("Bem vindo ao seu banco digital!");
            System.out.println("Digite o número correspondente a operação desejada.");
            System.out.println(" 1.Depositar\n 2.Sacar\n 3.Consultar Saldo\n 4.Encerrar\n");
            operacao = scanner.nextInt();

            // Looping de operações bancarias
            switch(operacao){
                case 1:
                    System.out.println("Digite a quantidade que você quer depositar: ");
                    saldo = scanner.nextDouble();
                    saldoFinal = saldo + saldoFinal;
                    System.out.println("Seu saldo atual é de R$" + saldoFinal );
                    break;
                case 2:
                    System.out.println("Digite a quantidade que você quer sacar: ");
                    saque = scanner.nextDouble();
                    if (saldo < saque){
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                    else{
                        saldo = saldo - saque;
                        System.out.println("Seu saldo atual é de R$" + saldo);
                        break;
                    }
                case 3:
                    System.out.println("Seu saldo atual é de R$" + saldo);
                    break;

                // Desligamento do sistema
                case 4:
                    System.out.println("Encerrando o programa...");
                    return;

                    // Caso ocorra algum erro de entrada de dados
                default:
                    System.out.println("Operação inválida, tente novamente.");
                    break;
            }
        }
    }
}