
package s0c13ty_MAsK.controladores;

import s0c13ty_MAsK.models.Membro;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lista {
    private ArrayList<Membro> listaMembro = new ArrayList<Membro>();

    /**
     * Método que retorna a lista de membros
     * @return listaMembro - lista de membros
     */
    public ArrayList<Membro> getMembro() {
        return listaMembro;
    }

}