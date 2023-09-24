public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        System.out.println("Caderno");

        String meuNome = "Jhonael";
        int idade = 23;
        int ano = 2023;

        boolean verdade = true;

        meuNome = nomeCompleto(meuNome, "Rocha");
        if (verdade){
            System.out.println("Meu nome é: " + meuNome + ", " + idade + " anos no ano de " + ano);
        }
    }
    public static String nomeCompleto(String nome, String sobrenome){
        return nome + " " + sobrenome;
    }
    
}
