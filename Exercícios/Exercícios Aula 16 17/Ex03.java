import java.util.Scanner;
class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo,estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com o nome");
            nome = scan.next();

            if (nome.length() >=3){
                infoValida = true;
            } else {
                System.out.println("O nome precisa no mínimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o idade");
            idade = scan.nextInt();

            if (idade > 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("Idade precisa estar entre 0 e 150");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o salario");
            salario=scan.nextDouble();

            if (salario >0){
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior que 0");
            }
        } while (!infoValida);


        infoValida = false;

        do {
            System.out.println("Entre com o sexo");
            sexo=scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Digite 'f' ou 'm");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o estado civil");
            estadoCivil = scan.next();

            if (sexo.equalsIgnoreCase("s")||
                sexo.equalsIgnoreCase("c") ||
                sexo.equalsIgnoreCase("v")||
                sexo.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Estado civil inválido");
            }
        } while (!infoValida);


        System.out.println("As seguintes informações foram inseridas");
        System.out.println("Nome:" + nome);
        System.out.println("Idade" + idade);
        System.out.println("Salário"+salario);
        System.out.println("Sexo:" + sexo);
        System.out.println("Estado civil" + estadoCivil);
        

        scan.close();

      
  
        
    }
}