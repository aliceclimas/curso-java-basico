public class Piramide extends Figura3d{

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;

    private Figura2d base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    public Figura2d getBase() {
        return base;
    }

    public void setBase(Figura2d base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        if (base != null){
            return (numPoliBase * ((arestaBase*apotema)/2))+ base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {
        if (base != null){
            return (base.calcularArea() * altura)/3;
        }
        return 0;
    }

    
   
    

}