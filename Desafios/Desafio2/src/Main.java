// Bibliotecas:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero;

        System.out.println("Bem vindo(a) ao verificador de conta bancaria.");
        System.out.println("Digite o número da sua conta:");
        // Try/Catch/Finally usado para verificação, e execução do programa:
        try{
            numero = scanner.next();
            verificarNumeroConta(numero);
        // Imprime que o número de conta é válido:
        System.out.println("Número de conta válido.");
        // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
        }
        catch(IllegalArgumentException Exception){
            System.out.println("Erro: Numero de conta inválido. Digite exatamente 8 dígitos.");
        }
        finally {
        scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException();
        }

        // Criação da classe de exceção:
        class IllegalArgumentException extends Exception {}
    }
}