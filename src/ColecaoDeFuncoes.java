import java.util.*;
import java.sql.ResultSet;

public class ColecaoDeFuncoes implements ContratoFuncoes {
    public void adicionar(Funcoes fun) {
        Conexao con = new Conexao();

        String sql = "INSERT into funcoes (id_funcao, funcao)" +
                "values (default,'" + fun.getFuncao() + "')";

        int res = con.executaPostgres(sql);
        if (res > 0) {
            System.out.println("Cargo adicionado com Sucesso!");
        } else {
            System.out.println("Erro durante o cadastro!");
        }
    }

    public void remover(Funcoes fun) {
        Conexao con = new Conexao();

        String sql = "DELETE FROM funcoes WHERE id_funcao = '" + fun.getId() + "';";

    }

    public void procurar() {
        Conexao con = new Conexao();

        String sql = "SELECT * from funcoes";

        ResultSet rs = con.executaBusca(sql);
        System.out.println("        CARGOS ");
        System.out.println("   ID  -    CARGO");
        try {
            while (rs.next()) {
                int id = rs.getInt("id_funcao");
                String funcao = rs.getString("funcao");
                System.out.println("   " + id + "   -     " + funcao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
