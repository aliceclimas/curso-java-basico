import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Digite a matrícula");
        aluno.matricula = scan.next();

        System.out.println("Digite o curso");
        aluno.curso = scan.next();

        System.out.println("Digite a disciplina1");
        aluno.disciplina1 = scan.next();

        System.out.println("Digite a disciplina2");
        aluno.disciplina2 = scan.next();

        System.out.println("Digite a disciplina3");
        aluno.disciplina3 = scan.next();

        System.out.println("Digite a nota1");
        aluno.nota1 = scan.nextDouble();

        System.out.println("Digite a nota2");
        aluno.nota2 = scan.nextDouble();

        System.out.println("Digite a nota3");
        aluno.nota3 = scan.nextDouble();


        double nota1 = aluno.nota1;
        String disciplina1 = aluno.disciplina1;

        double nota2 = aluno.nota2;
        String disciplina2 = aluno.disciplina2;

        double nota3 = aluno.nota3;
        String disciplina3 = aluno.disciplina3;



        aluno.calcularMedia(nota1, disciplina1);
        aluno.calcularMedia(nota2, disciplina2);
        aluno.calcularMedia(nota3, disciplina3);


        scan.close();
    }
    
}
