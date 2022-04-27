import java.util.*;
import java.sql.ResultSet;

public class ColecaoDeCaixas implements ContratoCaixa{
    public void adicionar(caixa cx) {
        Conexao con = new Conexao();

        String sql = "INSERT into Caixa (registro_caixa, caixa_inicial, nome, forma_de_pagamento)" +
                    "values (default, "+cx.getCaixaInicial()+", '"+cx.getOperador() +"', 'pix')";
        
        int res = con.executaPostgres(sql);
        if (res > 0) {
            System.out.println("Caixa criado!");
        } else {
            System.out.println("Erro durante a abertura!");
        }
        
    }

    public void remover(caixa cx) {
        
    }


    public void procurar(caixa cx) {
        
        
    }
    
    
}
