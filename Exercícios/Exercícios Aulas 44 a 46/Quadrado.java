public class Quadrado extends Figura2d{

    private int lado;


    public int getLado() {
        return lado;
    }



    public void setLado(int lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
}
