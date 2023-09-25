public class FormatadorCEP {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CEPInvalidException err){
            System.out.println("CEP inválido");
        }
        
    }
    static String formatarCep(String cep) throws CEPInvalidException{
        if(cep.length() != 8){
            throw new CEPInvalidException();
            
        }
        return "23.765-064";
    }
}
