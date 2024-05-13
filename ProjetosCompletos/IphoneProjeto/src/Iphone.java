//classes e biblíotecas utilizadas.
import java.util.Locale;
import java.util.Scanner;
import Aplicativos.ReprodutorMusical;
import Aplicativos.Telefone;
import Aplicativos.Safari;

public class Iphone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        //criando os objetos:
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Telefone tefelone = new Telefone();
        Safari safari = new Safari();

        //iniciando loop operacional:
        while (true) {
            System.out.println("Digite qual operação o senhor deseja(a).");
            System.out.println("1.Reprodutor musical.");
            System.out.println("2.Navegador Aplicativos.Safari.");
            System.out.println("3.Telefone.");
            System.out.println("4.Desligar Iphone.");
            int operacao = scan.nextInt();

            //funcionamento dos aplicativos:
            if (operacao == 1) {
                reprodutor.reprodutor();
                continue;
            } else if (operacao == 2) {
                tefelone.aplicativo();
                continue;
            }
            else if (operacao == 3){
                safari.navegador();
                continue;
            }
            else if (operacao == 4){
                System.out.println("Desligando o Iphone...");
                break;
            }
            else{
                break;
            }

        }
    }
}
