public class SmartTV{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }



    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudou para o canal :" + canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentou para o canal :" + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuiu para o canal :" + canal);
    }



    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentou o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuiu o volume para: " + volume);
    }
}