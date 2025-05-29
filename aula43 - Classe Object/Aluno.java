import java.util.Arrays;

class Aluno {
 
    private String curso;
    private double[] notas;

    public void verificarAcesso(){
        //this.nomeVisibilidade = "sdfsfs";
    }

    public Aluno(){
        super();
    }
    public Aluno(String nome, String endereco, String telefone, String curso){
        //super(nome,endereco,telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

   //@Override
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        //s += this.getEndereco();
        return s;

    }
    //@Override
    public void imprimirEtiquetaEndereco(){
        System.out.println(this.obterEtiquetaEndereco());

    }
    public String toString(){
        String s = curso + "\n";
        for (double nota: notas){
            s += nota + " ";
        }
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (curso == null) {
            if (other.curso != null)
                return false;
        } else if (!curso.equals(other.curso))
            return false;
        if (!Arrays.equals(notas, other.notas))
            return false;
        return true;
    }
    
}