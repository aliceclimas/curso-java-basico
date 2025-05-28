public class Cilindro extends Figura3d{


    private double raio;
    private double altura;

   

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return  (2 * Math.PI * (raio * raio)) + (2 * Math.PI * raio * altura);
    }

    @Override
    public double calcularVolume() {
        return Math.PI * (raio * raio) * altura;
    }  

}