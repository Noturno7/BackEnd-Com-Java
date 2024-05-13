package Aplicativos;

import java.util.Scanner;

public class Safari {
    public static void navegador(){

        System.out.println("Seja bem vindo(a) ao Aplicativos.Safari explorer.");
        Scanner scanner = new Scanner(System.in);

        //loop operacional:
        while (true) {
            System.out.println("Digite a opção desejada.");
            System.out.println("1.Pesquisar página.");
            System.out.println("2.Adicionar nova aba");
            System.out.println("3.Encerrar programa");
            int operacoes = scanner.nextInt();
            scanner.nextLine();
            //operação das funções do aplicativo:
            if (operacoes == 1) {
                System.out.println("Digite a página que deseja navegar:");
                String pagina = scanner.nextLine();

                System.out.println("Carregando...");
                System.out.println("Página " + pagina + " aberta, você tem livre acesso para navegar sobre a página.");
                while (true) {
                    System.out.println("Deseja continuar na página?(s/n)");
                    String paginaSair = scanner.nextLine();
                    if (paginaSair.equals("s")) {

                    } else {
                        break;
                    }
                }
            } else if (operacoes == 2) {
                System.out.println("Adicionando nova aba...");
                continue;
            } else if (operacoes == 3) {
                System.out.println("Encerrando Safira explorer. Até a próxima :)");
                break;
            } else {
                System.out.println("Operação inválida.");
                break;
            }
        }
    }
}
