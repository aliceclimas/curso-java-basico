public class Aluno {

    String nome;
    String matricula;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;
    double nota1;
    double nota2;
    double nota3;

    void calcularMedia(double nota,String disciplina){
        if (nota >= 7){
            System.out.println("Aprovado na disciplina "+ disciplina);
        } else if(nota >10) {
            System.out.println("Valor inválido");
        } else {
            System.out.println("Reprovado na disciplina "+ disciplina);

        }

    }
    
}
