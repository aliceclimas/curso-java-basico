import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso");
        String nomeCurso = scan.nextLine();

        System.out.println("Entre com o horário do professor");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor");
        String nome = scan.nextLine();

        System.out.println("Entre com o departamento do professor");
        String dept = scan.nextLine();

        System.out.println("Entre com o o email do professor");
        String email = scan.nextLine();

        Curso curso = new Curso();
        curso.setNomeCurso(nomeCurso);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setDepartamento(dept);
        professor.setEmail(email);

        curso.setProfessor(professor);

        System.out.println("--- Alunos ---");
        Aluno[] alunos = new Aluno[5];
        for (int i = 0;i<5;i++){

            scan.nextLine();

            System.out.println("Entre com o nome do aluno: " + (i+1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matricula do aluno: " + (i+1));
            String matricula = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0;j<4;i++){
                System.out.println("Entre com a nota" + (j+1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());


        scan.close();
    

        
        
    }
    

    
    
}
