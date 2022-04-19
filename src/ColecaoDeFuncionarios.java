import java.util.*;
public class ColecaoDeFuncionarios {
    ArrayList<Funcionario> meusFuncionarios = new ArrayList<>();

    public void adicionar (Funcionario f){
        meusFuncionarios.add(f);
    }

    public void remover(Funcionario f){
        meusFuncionarios.remove(f);
    }

    public void procurar(Funcionario f){
        for(int i = 0; i < meusFuncionarios.size(); i++){
            if(meusFuncionarios.contains(f)){
                System.out.println("Produto encontrado!" + "\n" + "[ID] " + f.getIdfuncionario() + "\n" + 
                                    "Nome: " + f.getNome() + "\n" +
                                    "Cargo: " + f.getFuncao() + "\n" +
                                    "Endereço: " + f.getEndereco() + "\n" +
                                    "Data de nascimento: " + f.getData_de_nascimento() + "\n" + 
                                    "CPF: " + f.getCpf());
            } else {
            System.out.println("Funcionario não encontrado.");
            }
        }
    }
}
