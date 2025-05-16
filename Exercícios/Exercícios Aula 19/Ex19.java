public class Ex19 {
    public static void main(String[] args) {

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] result = new double[10];
       

       
        nota1[0] = 10;
        nota1[1] = 2.5;
        nota1[2] = 3.5;
        nota2[3] = 4.5;
        nota1[4] = 8;
        nota1[5] = 7;
        nota1[6] = 6.5;
        nota1[7] = 6;
        nota1[8] = 3;
        nota1[9] = 5.75;

        nota2[0] = 1.5;
        nota2[1] = 10;
        nota2[2] = 10;
        nota2[3] = 9.5;
        nota2[4] = 8;
        nota2[5] = 8.75;
        nota2[6] = 9;
        nota2[7] = 6.5;
        nota2[8] = 9.2;
        nota2[9] = 9.8;

    
        for (int i = 0; i<nota1.length;i++){
            result[i] = (nota1[i] + nota2[i]) / 2;     
        }
        
        for (int i = 0; i <result.length;i++){
            System.out.println(result[i]);
            if (result[i] >= 7){
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }

        }

  
    }
}