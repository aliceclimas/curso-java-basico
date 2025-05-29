class Carro{

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // Método simples
    Carro(){
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

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