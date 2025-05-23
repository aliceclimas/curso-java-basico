public class Ex06 {
     public static void main(String[] args) {
        
        imprimirTela(120, "minutos", "segundos", ConversaoDeUnidadesDeTempo.minutoParaSegundos(120));
        
        imprimirTela(120, "horas", "minutos",ConversaoDeUnidadesDeTempo.horaParaMinutos(120));
        
        imprimirTela(120, "dias", "horas",ConversaoDeUnidadesDeTempo.diaParaHoras(120));
        
        imprimirTela(120, "semanas","dias",ConversaoDeUnidadesDeTempo.semanaParaDias(120));

        imprimirTela(120, "mês","dias",ConversaoDeUnidadesDeTempo.mesParaDias(120));

        imprimirTela(120, "anos","dias",ConversaoDeUnidadesDeTempo.anoParaDias(120));
        
      
    }
    static void imprimirTela(double valor, String unidadeOrigem, String unidadeDestino, double resultado){
        System.out.printf("%.2f %s equivalem a %.2f %s.%n", valor, unidadeOrigem, resultado, unidadeDestino);
    }
    
    
}
