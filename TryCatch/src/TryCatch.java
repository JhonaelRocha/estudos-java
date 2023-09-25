import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Qual o seu nome?");
            String nome = scanner.next();

            System.out.println("Qual a sua idade?");
            int idade = scanner.nextInt();

            System.out.println("Qual a sua altura?");
            double altura = scanner.nextDouble();

            System.out.println("Então você é " + nome + ", tem " + idade + " anos e " + altura + "m de altura.");

        } catch (Exception err) {
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}
