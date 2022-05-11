import java.util.*;
import java.sql.ResultSet;

public class ColecaoDeCaixas implements ContratoCaixa{
    public void adicionar(Caixa cx) {
        Conexao con = new Conexao();

        String sql = "INSERT into caixa (registro_caixa, caixa_inicial, formas_de_pagamento, operador)" +
                    "values (default, "+cx.getCaixaInicial()+", 'pix', '"+cx.getOperador() +"')";
        
        int res = con.executaPostgres(sql);
        if (res > 0) {
            System.out.println("Caixa criado!");
        } else {
            System.out.println("Erro durante a abertura!");
        }
        
    }

    public void remover(Caixa cx) {
        
    }


    public void procurar(Caixa cx) {
        
        
    }
    
    
}
