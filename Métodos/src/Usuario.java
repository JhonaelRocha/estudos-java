public class Usuario {
    public static void main(String[] args) throws Exception {
        //Exemplo de SmartTV
        SmartTV smartTV = new SmartTV();

        System.out.println("Ligada? : " + smartTV.ligada);
        System.out.println("Canal : " + smartTV.canal);
        System.out.println("Volume : " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Ligada? : " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume : " + smartTV.volume);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume : " + smartTV.volume);

        smartTV.mudarCanal(22);
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        smartTV.diminuirCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
    }
}
