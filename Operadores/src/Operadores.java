public class Operadores {
    public static void main(String[] args) throws Exception {
        //Atribuição
        String nome = "João";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean deficiente = false;

        //Matemáticos
        double soma = 10.5 + 15.7;
        int subtracao = 110 - 12;
        int multiplicacao = 5 * 8;
        double divisao = 10 / 9;
        int modulo = 40 % 8;
        double expressao = (1 + 4) * (38 - 2.55);

        //Concatenação
        String linguagem = "Linguagem" + "Java";
        String concatenacao = "";

        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = 1 + "1" + 1 + "1";
        concatenacao = "1" + 1 + 1 + 1;

        //Ternário (Recebe retorno);
        String verdade = (soma == divisao) ? "verdade" : "falso";
        System.out.println(verdade);

        //Comparativos
        // == != > < >= <= 
        if(linguagem == "LinguagemJava"){
            System.out.println("É veradde.");
        }
        String nomeUm = "Pedro";
        String nomeDois = new String("Pedro");

        System.out.println(nomeUm.equals(nomeDois));

        //Lógicos
        // && ||
        if(modulo == 0 && subtracao == 98){
            System.out.println("As duas são verdade");
        }
        if(multiplicacao == 40 || divisao == 1){
            System.out.println("Uma delas é verdade");
        }
    }
}
