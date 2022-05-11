import java.util.*;
import java.sql.ResultSet;

public class ColecaoDeEstoque implements ContratoEstoque{

    public void mostra_menu2(){
        System.out.print("+######  STORE CASE - CARUARU  ###### +\n" +
        "+              MENU - ESTOQUE         +\n" +
        "+                                     +\n" +
        "+       [1] - MOSTRA ESTOQUE ATUAL    +\n" +
        "+       [2] - CADASTRAR PRODUTO       +\n" +
        "+       [3] - REMOVER PRODUTO         +\n" +
        "+       [4] - ATUALIZAR PRODUTO       +\n" +
        "+       [0] - SAIR                    +\n" +
        "+-------------------------------------+\n" +
        "->  ");
        
    }

    public void cadastra(Produto p){
        Conexao con = new Conexao();

        String sql = "INSERT into Produto (id_produto, modelo, tipo, preco, categoria)" +
            "values (default, '" + p.getModelo() +"','"+ p.getTipo() +"', "+ p.getPreco() +", '"+ p.getCategoria() +"')";
        
        int res = con.executaPostgres(sql);
        if (res > 0) {
            System.out.println("Produto adicionado com Sucesso!\n");
        } else {
            System.out.println("Erro durante o cadastro!\n");
        }
     }
 
     public void remove(Produto p){
         System.out.print("Metodo removendo produtod");
     }
 
     public void atualiza(Produto p){
         System.out.print("Metodo atualçza produto");
     }
}
