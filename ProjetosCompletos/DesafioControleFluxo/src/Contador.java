// Bibliotecas utilizadas
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);

        // Pedindo e armazenando o input do usuário.
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        // Try/Catch usado para análise de possíveis exceções.
        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException Exception){
        System.out.println("OBS: O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    // Método de análise e lógica usado no programa.
    static void contar(int paramentroUm, int parametroDois) throws ParametrosInvalidosException{
        // Análise.
        if(paramentroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        // Lógica e output.
        else{
            int impressao = 0;
            for (int contador = paramentroUm; contador < parametroDois; contador++) {
                impressao++;
                System.out.printf("Imprimindo o número %d.\n", impressao);
            }
        }
    }
}