import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0;i<3;i++){

            System.out.println("Entre com as informações do contato" + (i+1));
            Contato c = new Contato();

            System.out.println("Entre com nome");
            nome = scan.nextLine();
            c.setNome( nome);

            System.out.println("Entre com telefone");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;


        }
        agenda.setContatos(contatos);


        System.out.println("Deseja adicionar um contato[1] ou obter informações[2?");
        int opcao = scan.nextInt();

        if (opcao == 1 ){

            System.out.println("Entre com as informações do contato");
            Contato c = new Contato();

            System.out.println("Entre com nome");
            nome = scan.nextLine();
            c.setNome( nome);

            System.out.println("Entre com telefone");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

        } else if (opcao == 2){
            
            System.out.println(c.obterInfo());
        } else {
            System.out.println("Digite uma opção válida");
        }
        
       
        scan.close();

    }
    

    
}
