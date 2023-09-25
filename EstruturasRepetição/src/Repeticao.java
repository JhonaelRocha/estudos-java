import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Repeticao {
    public static void main(String[] args) throws Exception {
        String[] alunos = {"pedro","marcos","elena"};

        //For
        System.out.println("Primeira chamada : ");
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Nome do aluno : " + alunos[i]);
        }

        System.out.println("Segunda chamada : ");
        for(String aluno : alunos){
            System.out.println("Nome do aluno : " + aluno);
        }

        for(String aluno : alunos){
            if(aluno == "marcos"){
                continue; //esquece esse fluxo e passa para o próximo
            }
            System.out.println(aluno);
        }

        for(String aluno : alunos){
            if(aluno == "marcos"){
                break; //esquece todos os outro fluxo que iriam acontecer após esse.
            }
            System.out.println(aluno);
        }



        //While
        int inteiro = 0;
        while(inteiro <= 10){
            System.out.println(inteiro);
            inteiro++;
        }

        double mesada = 50;
        int numeroDoces = 0;
        while(mesada > 0){
            double valorDoce = ThreadLocalRandom.current().nextDouble(2,8);
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce com o valor: R$ " + valorDoce + " Adicionado no Carrinho" );
            mesada = mesada - valorDoce;

            System.out.println("Mesada : " + mesada);
            
            numeroDoces ++;

        }
        System.out.println("Joãozinho gastou todo o seu dinheiro com Doces. Ele comprou " + numeroDoces + " doces.");

        //Do While

        int dowhile_num = 0;
        do{
            dowhile_num ++;
            System.out.println(dowhile_num);
        }
        while(dowhile_num < 10);




        
        do{
            System.out.println("Discando...");
        }while(tocando());

        System.out.println("Alô!");
        
        

    }
    private static boolean tocando(){
            boolean atendeu = new Random().nextInt(3)==1;
            System.out.println("Antendeu? " + atendeu);
            return !atendeu;
        }
}
