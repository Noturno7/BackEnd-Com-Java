package Aplicativos;

import java.util.Scanner;

public class ReprodutorMusical {
    public static void reprodutor(){

        int contador = 0;
        String[] musicasFavoritas = new String[5];
        String musicas;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao Aplicativos.ReprodutorMusical.");
        //loop operacional:
        while(true) {
            System.out.println("Selecione a operação desejada:");
            System.out.println("1.Músicas favoritas.");
            System.out.println("2.Pesquise músicas.");
            System.out.println("3.Encerrar aplicação.");
            int operacao = scanner.nextInt();
            scanner.nextLine();

            //operação das funções do aplicativo
            if (operacao == 1) {
                if (contador == 0) {
                    System.out.println("Você ainda não tem músicas favoritas.");
                } else {
                    for (int contadorMusica = 0; contadorMusica < contador; contadorMusica++) {
                        System.out.println(musicasFavoritas[contadorMusica]);
                    }
                }
            } else if (operacao == 2) {
                System.out.println("Digite o nome música que deseja:");
                musicas = scanner.nextLine();

                contador = contador + 1;

                System.out.println("Tocando " + musicas + "...");
                System.out.println("A música " + musicas + " foi adicionada as músicas favoritas automáticamente!");
                musicasFavoritas[contador] = musicas;

                System.out.println("Deseja pausar a música?(s/n)");
                String musicasOperacao = scanner.nextLine();

                if (musicasOperacao.equals("s")) {
                    System.out.println(musicas + " pausada.");
                    System.out.println("Deseja continuar a música?s/n");
                    String musicasPausa = scanner.nextLine();
                    if (musicasPausa.equals("s")) {
                        continue;
                    } else {
                        break;
                    }
                }
                else{
                    continue;
                }
            } else if (operacao == 3) {
                System.out.println("Encerrando reprodutor músical. até mais :)!");
                break;
            } else {
                System.out.println("Operação invalida.");
                break;
            }
        }
        scanner.close();
    }
}



