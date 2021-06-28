package s0c13ty_MAsK.models;

import s0c13ty_MAsK.enumerates.Horas;
import s0c13ty_MAsK.enumerates.MemBros;

=
public class ScriptGuys extends MemBros {


    public ScriptGuys(String nome, String email, int ID, MemBros funcao) {

        super(nome, email, ID, funcao);
    }


    @Override
    public void apresentacao() {

        System.out.println(toString());
    }


    @Override
    public void postarMensagem(Horas horarioAtual) {

        String msg1 = "Prazer em ajudar novos amigos de código!";
        String msg2 = "QU3Ro_S3us_r3curs0s.py";
        if (horarioAtual == Horas.NORMAL){
            System.out.println(msg1);
        }
        else{
            System.out.println(msg2);
        }
    }
}