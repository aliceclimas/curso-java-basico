public class Triangulo extends Figura2d{

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return ((base * altura)/2);
    }
    
}
