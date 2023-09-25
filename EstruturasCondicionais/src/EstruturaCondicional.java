public class EstruturaCondicional {
    public static void main(String[] args) throws Exception {
        //Condicional Simples
        
        if(3 > 2){
            System.out.println("Isso é verdade.");
        }


        //Condicional Composta
        int numero_1 = 8;
        if(numero_1 > 5)
            System.out.println("Isso é verdade");
        else
            System.out.println("Isso é Falso");
        

        //Condicional Encadeada
        int numero_2 = 8;
        if( numero_2 > 7){
            System.out.println("Seu número é maior que 7");
        }else if(numero_2 == 7){
            System.out.println("Seu número é o 7");
        }else{
            System.out.println("Seu número é menor que 7");
        }


        //Condicional Ternária
        int numero_3 = 5;
        String resultado = (numero_3 >= 7) ?  "Seu número é maior que 7" : (numero_3 == 7) ? "Seu número é o 7" : "Seu número é menor que 7";

        System.out.println(resultado);

        //Switch Case
        int numero_4 = 3;
        switch(numero_4){
            case 1: System.out.println("O número é 1"); break;
            case 2: System.out.println("O número é 2"); break;
            case 3: System.out.println("O número é 3"); break;
            default: System.out.println("O número não é nem 1, nem 2 e nem 3"); break;
        }
    }
}
