import java.util.*;

public class ColecaoDeFuncoes implements ContratoFuncoes {
    ArrayList<Funcoes> meusCargos = new ArrayList<Funcoes>();

    public void adicionar(Funcoes fun) {
        meusCargos.add(fun);
       
    }

    public void remover(Funcoes fun) {
        meusCargos.remove(fun);
    }

    public void procurar() {
        System.out.println(" CARGOS ATUAIS ");
        Integer cont = 1;
        for (int i = 0; i < meusCargos.size(); i++) {
            System.out.println("["+ cont + "] " + meusCargos.get(i).getFuncao());
            cont++;
        }
        System.out.print("-> ");
    }

    public String getCargos(Integer cod) {
        return meusCargos.get(cod).toString();
    }

}
