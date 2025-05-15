import java.util.Scanner;
class Ex02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValidas= false;
        do{
            System.out.println("Entre com o nome do usuário");
            String usuario = scan.next();

            System.out.println("Entre com a senha do usuário");
            String senha = scan.next();
            

            if (usuario.equalsIgnoreCase(senha)){
                System.out.println("Senha igual a usuário, digite novamente");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuário válidas");
            }

        } while (!infoValidas);

        scan.close();
    }
}