public class Ususario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual :" + smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("Canal atual : " + smartTV.canal);

        smartTV.ligar();
        System.out.println("Novo status Tv ligada ? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status Tv ligada ? " + smartTV.ligada);

    }
}
