package Aplicativos;

import java.util.Scanner;

public class Telefone {
    public static void aplicativo(){
        Scanner scanner = new Scanner(System.in);

        int contador = 0,contadorContatos = 0, numero;
        int[] numeroContatos = new int[40];
        String[] contatos = new String[40];
        String[] nomeContatos = new String[40];
        //loop operacional:
        while (true) {
            contador = contador + 1;
            System.out.println("Digite a operação desejada.");
            System.out.println("1.Fazer ligação.");
            System.out.println("2.Novo correio de vóz.");
            System.out.println("3.Adicionar contato.");
            System.out.println("4.Meus contatos.");
            System.out.println("5.Encerrar aplicação");
            int operacao = scanner.nextInt();

            //operação das funções do aplicativo:
            if (operacao == 1) {
                System.out.println("Digite o número que deseja fazer a ligação:");
                numero = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ligando para " + numero + "...");
                continue;
            } else if (operacao == 2) {
                System.out.println("Digite o número que deseja mandar o correio de vóz:");
                numero = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enviando correio de vóz para " + numero + "...");
                continue;
            } else if (operacao == 3) {
                contadorContatos = contadorContatos + 1;
                System.out.println("Digite o número do contato que você deseja adicionar:");
                numeroContatos[contador] = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Escreva o nome do contato que deseja adicionar:");
                nomeContatos[contador] = scanner.nextLine();
                continue;
            } else if (operacao == 4) {
                if (contadorContatos > 0) {
                    System.out.println("Contatos:");
                    scanner.nextLine();
                    for (int contador1 = 1; contador1 < contador; contador1++) {
                        System.out.println(nomeContatos[contador1]);
                        System.out.println(numeroContatos[contador1]);
                    }
                    continue;
                } else {
                    System.out.println("Você ainda não adicionou nenhum contato.");
                    continue;
                }

            } else if (operacao == 5) {
                System.out.println("Encerrando a aplicação... Até mais :)");
                break;
            } else {
                System.out.println("Operação inválida.");
                break;
            }
        }

    }
}
