public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Alice");
        //contato.setEndereco(("Rua das flores"));
        //contato.setTelefone("1122121");

        // criar objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("99999999");

        contato.setEndereco(end);

        // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("11");
        telefone.setNumero("123456789");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("123456789");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        // Teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        // if (contato != null && contato.getTelefone() != null){
        //     System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());

        // }
        if (contato != null && contato.getTelefones() != null){
            for (Telefone t: contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }


       

    }
    
}
