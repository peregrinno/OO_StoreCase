import java.util.*;
public class ColecaoDeFuncionarios implements ContratoFuncionarios{
    ArrayList<Funcionario> meusFuncionarios = new ArrayList<>();

    public void admissao (Funcionario f){
        meusFuncionarios.add(f);
    }

    public void demissao(Funcionario f){
        meusFuncionarios.remove(f);
    }

    public void procurar(Funcionario f){
        
        
    }
}
