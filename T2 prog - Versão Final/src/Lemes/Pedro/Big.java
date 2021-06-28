package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horas;
import s0c13ty_MAsK.enumerates.MemBros;


public class BigBrothers extends MemBros{


    public BigBrothers(String nome, String email, int ID, MemBros funcao) {

        super(nome, email, ID, funcao);
    }

    @Override
    public void apresentacao() {

        System.out.println(toString());
    }

    @Override
    public void Mensagem(Horas horarioAtual) {

        String msg1 = "Sempre ajudando as pessoas membros ou não S2!";
        String msg2 = "...";
        if (horarioAtual == Horas.NORMAL){
            System.out.println(msg1);
        }
        else{
            System.out.println(msg2);
        }
    }
}