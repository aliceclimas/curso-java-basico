public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(){
        super();
        this.setCor("castanho");
        this.setAlimento("Mel");
        this.setAlimento("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString(){
        String s = super.toString();
        s += "\nAlimentos" + alimento;
        return s;


    }

    

    
}
