public class Ex01 {
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada("amora","10",20,"Amarelo","Branca",20,['amareloo','branco'],true);

        lampada.ligarLampada();
        lampada.mostrarEstado();
        lampada.desligarLampada();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();

        

    }
    
}
