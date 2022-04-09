// Orientação a Obejtos - Professor Jorge Fonseca
//Alunos: Hydelbranda, Felipe, Luan, Moises e Edson

import java.io.IOException;
import java.util.Scanner;

class Produto {
   int id_produto;
   String categoria_produto;
   String modelo;
   String tipo;
   Double valor_produto;
}

class Funcionario {
   int id_funcionario;
   String nome;
   String cpf;
   String data_nasc;
   String endereco;
   String funcao;
}

class caixa {

   Float caixa_inicial;
   String operador;
   String form_pag;
   int resgis_caixa;
   
}

class vendas {

   int id_venda;
   String operador;
   Float valor_compra;
   int regis_caixa;
   String form_pag;

}

class funcoes {

   int ID_FUNC;
   String funcao;
   
}

class main {
   public static void main(String[] args) {
      boolean status_loja = true;
      try (Scanner ler = new Scanner(System.in)) {
         int ent_int1;

         Conexao con = new Conexao();
         /*
         Produto prod1 = new Produto();
         Funcionario fun1 = new Funcionario();

         String sql = "INSERT into Produto (modelo, tipo, preco, categoria, id_produto)"+
                      "values ('M52','Silicone','35','Case',default)";

         int res = con.executaPostgres(sql);
         if (res > 0) {
            System.out.println("Cadastrado com Sucesso!");
         }  else {
            System.out.println("Erro!");
         }
         */

         while (status_loja == true) {
            System.out.println("+######  STORE CASE - CARUARU  ###### +");
            System.out.println("+                MENU                 +");
            System.out.println("+                                     +");
            System.out.println("+          [1] - ESTOQUE              +");
            System.out.println("+          [2] - RECURSOS HUMANOS     +");
            System.out.println("+          [3] - PVD                  +");
            System.out.println("+          [4] - RELATORIO DE VENDAS  +");
            System.out.println("+          [0] - SAIR                 +");
            System.out.println("+                                     +");
            System.out.println("+-------------------------------------+");
            System.out.println("         Furadeira Labs - 2022         ");
            System.out.print("->  ");

            ent_int1 = ler.nextInt();
            switch (ent_int1) {
               case 0:
                  System.out.println("Saindo.. ");
                  status_loja = false;
               case 1:
                  System.out.println("ESTOQUE! - EM CONSTRUÇÃO");
               case 2:
                  System.out.println("RH! - EM CONSTRUÇÃO");
               default:
                  System.out.println("Entrada inexistente! ");
            }
         }
      }

   }
}