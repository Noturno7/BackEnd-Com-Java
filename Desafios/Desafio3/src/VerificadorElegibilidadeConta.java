// Bibliotecas:
import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Guardando os dados do usuário:
            System.out.println("Insira a sua idade para a verificação de elegibilidade:");
            int idade = scanner.nextInt();
            // Verificação de elegibilidade:
            if (idade >= 18) {
                System.out.println("Voce está elegível para criar uma conta bancaria.");
            }
            else{
                System.out.println("Voce nao está elegível para criar uma conta bancaria.");
            }
            // Fechamos o objeto Scanner para liberar os recursos:
            scanner.close();
        }
}
