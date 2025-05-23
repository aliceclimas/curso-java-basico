public class Contador {

    public static int contador;

    public Contador(){
        contador++;
    }


    public static void zerarContador(){
        contador = 0;
    }

    public static void incrementarContador(){
        contador ++;
    }
    public static int mostrarContador(){
        return contador;
    }


}