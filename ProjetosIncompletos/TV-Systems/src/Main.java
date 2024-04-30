public class Main {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("\n");

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal inicial: " +smartTV.canal);
        System.out.println("Volume inicial: " +smartTV.volume);
        System.out.println("\n");


        smartTV.aumentarVolume();
        smartTV.passarCanal();

        System.out.println("Tv ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);
        System.out.println("\n");
    }

}