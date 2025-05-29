public class Carro{

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Método simples
    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    public Carro(){}

    public Carro(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parâmtros");
    }
    public Carro(String marca, String modelo){
        this("Fiat","Ducato",10);
        System.out.println("Chamando construtor com 2 parâmtros");

    }


    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é:" + capCombustivel * consumoCombustivel + "km");
    }
    /// Método com retorno
    public double obterAutonomia(){
        System.out.println("Método obterAutononia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
    private double divideKmPorConsumoCombustivel (double km){
        return km/this.consumoCombustivel;

    }
    // Método com parâmetro
    public double calcularCombustivel(double km){

        return this.divideKmPorConsumoCombustivel(km);
    }
}