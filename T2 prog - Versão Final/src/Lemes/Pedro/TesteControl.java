package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.models.Membro;
import java.io.*;
import java.util.ArrayList;


public class TesteControl {


    public void arquivar(ArrayList<Membro> list) throws FileNotFoundException {

        Lista lista = new Lista();

        File csvFile = new File("arquivo_super_Secreto_nao_pode_abrir.csv");


        try {
            PrintWriter out = null;

            out = new PrintWriter(csvFile);

            out.print("Nome");
            out.print(";");
            out.print("ID");
            out.print(";");
            out.println("Funcao");

            PrintWriter finalOut = out;
            list.forEach(membro -> {

                finalOut.print(membro.getNome());
                finalOut.print(";");
                finalOut.print(membro.getID());
                finalOut.print(";");
                finalOut.println(membro.getFuncao());

            });

            out.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
