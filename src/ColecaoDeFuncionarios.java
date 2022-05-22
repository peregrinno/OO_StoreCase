import java.util.*;
public class ColecaoDeFuncionarios implements ContratoFuncionarios{
    ArrayList<Funcionario> meusFuncionarios = new ArrayList<>();

    public void admissao (Funcionario f){
        meusFuncionarios.add(f);
        System.out.println("Funcionario admitido!");
    }

    public void demissao(Integer cod){
        meusFuncionarios.remove(meusFuncionarios.get(cod));
        System.out.println("Funcionario demitido!");
    }

    public void procurar(Funcionario f){
        
    }

    public void quadro(){
        Integer cont = 1;
        System.out.println("+--------- QUADRO ATUAL ---------+");
        for (int i = 0; i < meusFuncionarios.size(); i++){
            System.out.println("["+ cont +"] -" +  meusFuncionarios.get(i).getNome() + " - " + meusFuncionarios.get(i).getCpf());
        }
    }

    public boolean tem_funcionarios(){
        if (meusFuncionarios.size() > 0){
            return true;
        } else {
            return false;
        }
        
    }
}
