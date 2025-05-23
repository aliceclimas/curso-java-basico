public class Aluno {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas = new String[3];
    private double[][] notasDisciplinas = new double[3][4];

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas,double[][] notasDisciplinas){
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = nomeDisciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }
    // Métodos getters e setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getNomeCurso(){
        return this.nomeCurso;
    }
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public String[] getNomeDisciplinas(){
        return this.nomeDisciplinas;
    }
    public void setNomeDisciplinas(String[] nomeDisciplinas){
        this.nomeDisciplinas = nomeDisciplinas;
    }
    public double[][] getNotaDisciplinas(){
        return this.notasDisciplinas;
    }
    public void setNotaDisciplinas(double[][] notaDisciplinas){
        this.notasDisciplinas = notaDisciplinas;
    }


    public void mostrarursoInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Nome do curso: "+nomeCurso);

        for (int i = 0;i<notasDisciplinas.length;i++){
            System.out.println("Notas da disciplina "+ nomeDisciplinas[i]);
            for (int j = 0;j<notasDisciplinas[i].length;j++){
                System.out.println(notasDisciplinas[i][j]);
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice){
        if (obterMedia(indice) >= 7){
            return true;
        } 
        return false;
    }

    public double obterMedia(int indice){
        double soma = 0;
        for (int i = 0;i<notasDisciplinas[indice].length;i++){
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }
    
}
