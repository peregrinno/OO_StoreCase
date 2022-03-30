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

      System.out.println("okok felipe");

      Produto prod1 = new Produto();
      Funcionario fun1 = new Funcionario();

      prod1.id_produto = 001;
      prod1.categoria_produto = "Pelicula";
      prod1.tipo = "3D";
      prod1.modelo = "M52 5G";

      prod1.id_produto = 101;
      prod1.categoria_produto = "Case";
      prod1.tipo = "Anti-impacto";
      prod1.modelo = "M52 5G";

      prod1.id_produto = 201;
      prod1.categoria_produto = "Carregador";
      prod1.tipo = "Portatil";
      prod1.modelo = "M52 5G";

      prod1.id_produto = 301;
      prod1.categoria_produto = "Fone de ouvido";
      prod1.tipo = "Com Fio";
      prod1.modelo = "M52 5G";

      fun1.id_funcionario = 401;
      fun1.nome = "Hydelbranda Melo";
      fun1.cpf = "65432198222";
      fun1.data_nasc = "06/06/2002";
      fun1.endereco = "Rua do Grajau, 66";
      fun1.funcao = "Proprietária - Caixa";

      Produto prod2 = new Produto();
      Funcionario fun2 = new Funcionario();

      prod2.id_produto = 002;
      prod2.categoria_produto = "Pelicula";
      prod2.tipo = "PADRÃO";
      prod2.modelo = "IPhone XR";

      prod2.id_produto = 102;
      prod2.categoria_produto = "Case";
      prod2.tipo = "Silicone";
      prod2.modelo = "IPhone XR";

      prod2.id_produto = 202;
      prod2.categoria_produto = "Carregador";
      prod2.tipo = "Portatil";
      prod2.modelo = "iPhone XR";

      prod2.id_produto = 302;
      prod2.categoria_produto = "Fone de ouvido";
      prod2.tipo = "AIRDOT";
      prod2.modelo = "IPhone XR";

      fun2.id_funcionario = 402;
      fun2.nome = "José Felipe";
      fun2.cpf = "11122233344";
      fun2.data_nasc = "Quintas das Colinas humildes";
      fun2.funcao = "Vendedor";

      Produto prod3 = new Produto();
      Funcionario fun3 = new Funcionario();

      prod3.id_produto = 003;
      prod3.categoria_produto = "Pelicula";
      prod3.tipo = "HIDROGEL";
      prod3.modelo = "Xiaomi Mi 11";

      prod3.id_produto = 103;
      prod3.categoria_produto = "Case";
      prod3.tipo = "Aveludada";
      prod3.modelo = "Xiaomi Mi 11";

      prod3.id_produto = 203;
      prod3.categoria_produto = "Carregador";
      prod3.tipo = "Turbo";
      prod3.modelo = "Xiaomi Mi 11";

      prod3.id_produto = 303;
      prod3.categoria_produto = "Fone de ouvido";
      prod3.tipo = "Headfone";
      prod3.modelo = "Xiaomi Mi 11";

      fun3.id_funcionario = 403;
      fun3.nome = "Luan Araújo";
      fun3.cpf = "02702904121";
      fun3.data_nasc = "19/08/1997";
      fun3.endereco = "Rua Ronaldo Barata, 09";
      fun3.funcao = "Estoque";

      System.out.println("");

      System.out.println("Produto: " + prod1.categoria_produto + "\nModelo: " +
            prod1.modelo + "\nTipo: " + prod1.tipo);

      System.out.println("");
   }
}