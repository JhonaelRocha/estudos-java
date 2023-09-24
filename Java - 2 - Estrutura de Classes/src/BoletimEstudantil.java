public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal < 6){
            System.out.println("Aluno Reprovado");
        }else if(mediaFinal == 6){
            System.out.println("Aluno na média");
        }else if(mediaFinal>6){
            System.out.println("Aluno Aprovado");
        }
    }
}
