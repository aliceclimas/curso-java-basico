public class Ex05 {
    public static void main(String[] args) {
        
        imprimirTela(1000, "litros", "cm³", ConversaoDeUnidadesDeVolume.litroParaCm3s(1000));
        
        imprimirTela(1000, "metros³", "litros",ConversaoDeUnidadesDeVolume.metro3ParaLitros(1000));
        
        imprimirTela(1000, "metros³", "pés³",ConversaoDeUnidadesDeVolume.metro3ParaPe3s(1000));
        
        imprimirTela(1000, "galões","polegadas³",ConversaoDeUnidadesDeVolume.galaoParaPol3s(1000));

        imprimirTela(1000, "galões","litros",ConversaoDeUnidadesDeVolume.galaoParaLitros(1000));
        
      
    }
    static void imprimirTela(double valor, String unidadeOrigem, String unidadeDestino, double resultado){
        System.out.printf("%.2f %s equivalem a %.2f %s.%n", valor, unidadeOrigem, resultado, unidadeDestino);
    }
    
   
    
}