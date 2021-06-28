package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.MemBros;
import s0c13ty_MAsK.interfaces.Apresentacao;
import s0c13ty_MAsK.interfaces.Mensagem;


public abstract class Membro implements Apresentacao, Mensagem {

    private String nome;
    private String email;
    private int ID;
    private MemBros funcao;


    public String getNome() {

        return nome;
    }


    public String getEmail() {

        return email;
    }


    public int getID() {

        return ID;
    }


    public MemBros getFuncao() {

        return funcao;
    }


    public void setNome(String nome) {

        this.nome = nome;
    }


    public void setEmail(String email) {

        this.email = email;
    }

    public void setID(int ID) {

        this.ID = ID;
    }


    public void setFuncao(MemBros funcao) {

        this.funcao = funcao;
    }


    public Membro(String nome, String email, int ID, MemBros funcao) {

        this.nome = nome;
        this.email = email;
        this.ID = ID;
        this.funcao = funcao;
    }


    @Override
    public String toString() {

        return "Membro {" +
                "nome ='" + nome + '\'' +
                ", email ='" + email + '\'' +
                ", ID =" + ID +
                ", funcao =" + funcao +
                '}';
    }
}