public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe(){
        super();
        this.setNumeroPatas(0);
        this.setAmbiente("Mar");
        this.setCor("cinzenta");
        this.setCaracteristicas("caudas e barbatanas");


    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString(){
        String s = super.toString();
        s+= "\nCaracteristícas: " + caracteristicas;
        return s;


    }

    
    
    
}
