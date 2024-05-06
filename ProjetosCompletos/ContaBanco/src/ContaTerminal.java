// Biblíotecas:
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Adicionamos as variáveis:
        int numero;
        String agencia = " ";
        String nomeCliente;
        double saldo;
        // Incluímos o scanner que vai ler a entrada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Fazemos o input e o output:
        System.out.println("Por favor, digite o número da agência: ");
        numero = scanner.nextInt();

        // Consumir a quebra de linha deixada pelo nextInt():
        scanner.nextLine();
        //Analise de qual agência o cliente vai ser.
        if (numero < 1000){
            agencia = "058-A";
        } else if(numero >= 1000 && numero <= 2000){
            agencia = "058-B";
        }  else if (numero > 2000 && numero <= 3000){
            agencia = "058-C";
        } else if (numero > 3000 && numero <= 4000){
            agencia = "058-D";
        } else{
            System.out.println("Agencia não encontrada.");
        }

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        // Analise de saldo:
        System.out.println("Por favor, digite o seu saldo desejável: ");
        saldo = scanner.nextDouble();
        if (saldo > 800){
            System.out.println("Infelizmente não é possível liberar este saldo para novos clientes, o sistema ira definir o seu saldo como o saldo máximo para novos clientes. Para mais informações fale com um dos nossos atendentes.");
            saldo = 800;
        }
        // Imprimimos a mensagem final com os dados do cliente e a sua agência:
        System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " já disponível para saque." );
    }
}