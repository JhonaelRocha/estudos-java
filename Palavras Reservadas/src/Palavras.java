public class Palavras {
    public static void main(String[] args) throws Exception {
        String[] pacotes = {"import", "package"};
        percorrer(pacotes, "Controle de Pacotes : ");
        
        String[] acesso = {"public", "private", "protected"};
        percorrer(acesso, "Modificadores de acesso:");

        String[] primitivos = {"boolean","byte","char","double","float","int","long","short","voida"};
        percorrer(primitivos,"Tipos Primitivos :");

        String[] modificadoresClasses = {"abstract","class","extends","final","inplements","interface","native","new","static","strictfp","synchronized","transient","volatile"};
        percorrer(modificadoresClasses, "Modificadores de Classes :");

        String[] fluxo = {"break","case","continue"};
        percorrer(fluxo, "Controle de fluxo :");
    }
    public static void percorrer(String[] array, String text){
        System.out.println(text);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
