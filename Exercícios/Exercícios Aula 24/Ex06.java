public class Ex06 {
    public static void main(String[] args) {
        
        ContatoCelular contato1 = new ContatoCelular();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "12123-3434";
        contato1.telefones[1] = "12245-3434";
        contato1.telefones[2] = "13123-3434";
    }
    
}
