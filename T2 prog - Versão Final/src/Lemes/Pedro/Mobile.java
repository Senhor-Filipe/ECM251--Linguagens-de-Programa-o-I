package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horas;
import s0c13ty_MAsK.enumerates.MemBros;


public class MobileMembers extends MemBros {


    public MobileMembers(String nome, String email, int ID, MemBros funcao) {

        super(nome, email, ID, funcao);
    }


    @Override
    public void apresentacao() {

        System.out.println(toString());
    }


    @Override
    public void postarMensagem(Horas horarioAtual) {

        String msg1 = "Happy Coding!";
        String msg2 = "Happy_C0d1ng. Maskers";
        if (horarioAtual == Horas.NORMAL){
            System.out.println(msg1);
        }
        else{
            System.out.println(msg2);
        }
    }
}