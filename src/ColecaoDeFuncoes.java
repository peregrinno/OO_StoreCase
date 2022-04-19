import java.util.*;
public class ColecaoDeFuncoes {
    ArrayList<Funcoes> minhasFuncoes = new ArrayList<>();

    public void adicionar (Funcoes fun){
        minhasFuncoes.add(fun);
    }

    public void remover(Funcoes fun){
        minhasFuncoes.remove(fun);
    }

    public void procurar(Funcoes fun){
        for(int i = 0; i < minhasFuncoes.size(); i++){
            if(minhasFuncoes.contains(fun)){
                System.out.println("Função encontrada: "+ fun.getFuncao());
            } else {
            System.out.println("Função não encontrada.");
            }
        }
    }
}
