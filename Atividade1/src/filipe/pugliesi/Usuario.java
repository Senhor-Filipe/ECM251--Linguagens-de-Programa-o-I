package filipe.pugliesi;

public class Usuario {            //Nesta classe, as informações dos usuários são processadas.
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String senha;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente Bancário{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
