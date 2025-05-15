import java.util.Scanner;
class Ex26{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tipo da carne? [F} filé duplo,[A] Alcatra, [P] Picanha");
        String tipo = scan.next();

        System.out.println("Digite a quantidade em kilos de carne");
        double qtdCarne = scan.nextDouble();

        System.out.println("Usou o cartão Tabajara? [S] ou [N]");
        String usouCartao = scan.next();

        double valorTotal = 0;
        double valorFileDuplo;
        double valorAlcatra;
        double valorPicanha;



        if (tipo.equalsIgnoreCase("F")) {
            if (usouCartao.equalsIgnoreCase("S"))
            if (qtdCarne >= 5){
                valorFileDuplo = 4.90;
                valorTotal = qtdCarne * valorFileDuplo;

            } else {
                valorFileDuplo = 5.80;
                valorTotal = qtdCarne * valorFileDuplo;

            }
       
        } else if (tipo.equalsIgnoreCase("A")) {
            if (qtdCarne >= 5){
                valorAlcatra = 5.90;
                valorTotal = qtdCarne * valorAlcatra;

            } else {
                valorAlcatra = 6.80;
                valorTotal = qtdCarne * valorAlcatra;

            }
        } else if (tipo.equalsIgnoreCase("P")) {
            if (qtdCarne >= 5){
                valorPicanha = 6.90;
                valorTotal = qtdCarne * valorPicanha;

            } else {
                valorPicanha = 7.80;
                valorTotal = qtdCarne * valorPicanha;

            }

        } else {
            System.out.println("Digite uma opção válida");
        }
        if (usouCartao.equalsIgnoreCase("s")){
            valorTotal = valorTotal - ((valorTotal / 100)*5);
        }
        System.out.println("Valor total a pagar: R$"+valorTotal);


    }

}
