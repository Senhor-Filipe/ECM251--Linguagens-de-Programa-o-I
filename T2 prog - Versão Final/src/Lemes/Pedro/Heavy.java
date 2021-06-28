package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horas;
import s0c13ty_MAsK.enumerates.MemBros;


public class HeavyLifters extends MemBros {


    public HeavyLifters(String nome, String email, int ID, MemBros funcao) {

        super(nome, email, ID, funcao);
    }


    @Override
    public void apresentacao() {

        System.out.println(toString());
    }


    @Override
    public void postarMensagem(Horas horarioAtual) {

        String msg1 = "Podem contar conosco!";
        String msg2 = "N00b_qu3_n_Se_r3pita.bat";
        if (horarioAtual == Horas.NORMAL){
            System.out.println(msg1);
        }
        else{
            System.out.println(msg2);
        }
    }
}