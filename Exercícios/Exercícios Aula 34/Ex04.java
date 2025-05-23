public class Ex04 {
    public static void main(String[] args) {
        
        imprimirTela(100, "metros", "pés", ConversaoDeUnidadesDeArea.metroParaPes(100));
        
        imprimirTela(100, "Pés", "cm²",ConversaoDeUnidadesDeArea.peParaCmQuadrados(100));
        
        imprimirTela(100, "milha²", "acres",ConversaoDeUnidadesDeArea.milhaQuadradosParaAcres(100));
        
        imprimirTela(100, "acre","pés²",ConversaoDeUnidadesDeArea.acreParaPesQuadrados(100));
        
      
    }
    static void imprimirTela(double valor, String unidadeOrigem, String unidadeDestino, double resultado){
        System.out.printf("%.2f %s equivalem a %.2f %s.%n", valor, unidadeOrigem, resultado, unidadeDestino);
    }
    
   
    
}
