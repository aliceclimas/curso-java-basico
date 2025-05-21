class Carro{

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Método simples

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é:" + capCombustivel * consumoCombustivel + "km");
    }
    /// Método com retorno
    double obterAutonomia(){
        System.out.println("Método obterAutononia foi chamado");
        return capCombustivel * consumoCombustivel;
    }
    // Método com parâmetro
    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}