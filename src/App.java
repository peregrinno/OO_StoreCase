// Orientação a Obejtos - Professor Jorge Fonseca
//Alunos: Hydelbranda, Felipe, Luan, Moyses e Edson
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

class main {
   public static void main(String[] args) {

      Conexao con = new Conexao();
      //Produto prod1 = new Produto();
      //Funcionario fun1 = new Funcionario();

      String sql = "INSERT into Produto (modelo, tipo, preco, categoria, id_produto)"+
                  "values ('M52','Silicone','35','Case',default)";

      int res = con.executaPostgres(sql);
      if (res > 0) {
         System.out.println("Cadastrado com Sucesso!");
      }  else {
         System.out.println("Erro!");
      }

   }
}