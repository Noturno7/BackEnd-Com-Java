import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        double limiteChequeEspecial = 500, saldo;
        String  validarUsuario, agencia =" ", nomeCliente;

        // Verificando se o usuário já é um cliente do banco.
        System.out.println("Você já é cliente dos nossos bancos? s/n");
        validarUsuario = scanner.next();
        if(validarUsuario == "s"){
            System.out.println("Por favor, digite o número da sua conta: ");
            numero = scanner.nextInt();
            scanner.nextLine();
            //Analise de qual agência o cliente é.
            if (numero < 1000){
                agencia = "058-A";
            } else if(numero >= 1000 && numero <= 2000){
                agencia = "058-B";
            }  else if (numero > 2000 && numero <= 3000){
                agencia = "058-C";
            } else if (numero > 3000 && numero <= 4000){
                agencia = "058-D";
            } else if(numero > 4000 && numero <= 5000){
                agencia = "058-E";
            }else if(numero > 5000 && numero <= 6000){
                agencia = "058-F";
            }else{
                System.out.println("Número inválido!");
                return;
            }
            System.out.println("Por favor, digite o seu nome: ");
            nomeCliente = scanner.nextLine();
            System.out.println("Digite o seu saldo para verificação:");
            saldo = scanner.nextDouble();
            System.out.println("Conta verificada, seja bem vindo(a) " + nomeCliente +", sua agência é " + agencia + ", conta "+ numero + " e seu saldo é de R$"+ saldo +" já disponível para saque.");
        }
        else{
            System.out.println("Por favor, digite o número que o senhor(a) deseja para a sua conta:");
            numero = scanner.nextInt();
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
                System.out.println("Número inválido!");
                return;
            }
            System.out.println("Por favor, digite o seu nome: ");
            nomeCliente = scanner.nextLine();
            System.out.println("Por favor, digite o seu saldo desejável: ");
            saldo = scanner.nextDouble();
            if (saldo > 800){
                System.out.println("Infelizmente não é possível liberar este saldo para novos clientes, o sistema ira definir o seu saldo como o saldo máximo para novos clientes. Para mais informações fale com um dos nossos atendentes.");
                saldo = 800;
            }
            // Imprimimos a mensagem final com os dados do cliente e a sua agência:
            System.out.println("Olá " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$" + saldo + " já disponível para saque." );
        }

        int operacao;
        double saque = 0, saldoFinal = saldo;
        String validarCheque;
        // Looping operacional
        while (true) {
            // Mensagem inicial
            System.out.println("Digite o número correspondente a operação desejada.");
            System.out.println(" 1.Depositar\n 2.Sacar\n 3.Consultar Saldo\n 4.Encerrar\n");
            operacao = scanner.nextInt();

            // Looping de operações bancarias
            switch(operacao){
                //Deposito
                case 1:
                    System.out.println("Digite a quantidade que você quer depositar: ");
                    saldo = scanner.nextDouble();
                    saldoFinal = saldo + saldoFinal;
                    System.out.println("Seu saldo atual é de R$" + saldoFinal );
                    break;
                // Saque:
                case 2:
                    System.out.println("Digite a quantidade que você quer sacar: ");
                    saque = scanner.nextDouble();
                        if (saldoFinal > saque) {
                            System.out.println("Transação realizada com sucesso.");
                            saldoFinal = saldoFinal - saque;
                            System.out.println("Seu saldo atual é de R$" + saldoFinal);
                            break;
                        } else if (saque <= saldoFinal + limiteChequeEspecial) {
                            // Saque com o cheque especial:
                            System.out.println("Seu saldo não é suficiente, você deseja utilizar o cheque especial? s/n");
                            validarCheque = scanner.next();
                            if (validarCheque.equals("s")){
                                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
                                saldoFinal = saldoFinal - saque;
                                System.out.println("Pelo uso do cheque especial seu saldo agora é de R$"+ saldoFinal);
                                break;
                            }
                         else {
                                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                                System.out.println("Transação nao realizada. Limite do cheque especial excedido.");
                                break;
                            }
                        }
                // Verificar saldo:
                case 3:
                    System.out.println("Seu saldo atual é de R$" + saldoFinal);
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

