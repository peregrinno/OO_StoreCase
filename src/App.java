// Orientação a Obejtos - Professor Jorge Fonseca
class Pelicula {
   int codigo_id_pelicula;
   String modelo;
   String tipo;
}
 
class Capinha {
   int codigo_id_cap;
   String modelo;
   String tipo;
}
 
class Carregador {
   int codigo_id_car;
   String tipo;
   String modelo;
}
 
class Fone {
   int codigo_id_fone;
   String tipo;
   String modelo;
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
 
       Pelicula pel1 = new Pelicula();
       Capinha cap1 = new Capinha();
       Carregador car1 = new Carregador();
       Fone fone1 = new Fone();
       Funcionario fun1 = new Funcionario();
 
       pel1.codigo_id_pelicula = 001;
       pel1.tipo = "3D";
       pel1.modelo = "M52 5G";
 
       cap1.codigo_id_cap = 101;
       cap1.tipo = "Anti-impacto";
       cap1.modelo = "M52 5G";
 
       car1.codigo_id_car = 201;
       car1.tipo = "Portatil";
       car1.modelo = "M52 5G";
 
       fone1.codigo_id_fone = 301;
       fone1.tipo = "Com Fio";
       fone1.modelo = "M52 5G";
 
       fun1.id_funcionario = 401;
       fun1.nome = "Hydelbranda Melo";
       fun1.cpf = "65432198222";
       fun1.data_nasc = "06/06/2002";
       fun1.endereco = "Rua do Grajau, 66";
       fun1.funcao = "Proprietária - Caixa";
 
       Pelicula pel2 = new Pelicula();
       Capinha cap2 = new Capinha();
       Carregador car2 = new Carregador();
       Fone fone2 = new Fone();
       Funcionario fun2 = new Funcionario();
 
       pel2.codigo_id_pelicula = 002;
       pel2.tipo = "PADRÃO";
       pel2.modelo = "IPhone XR";
 
       cap2.codigo_id_cap = 102;
       cap2.tipo = "Silicone";
       cap2.modelo = "IPhone XR";
 
       car2.codigo_id_car = 202;
       car2.tipo = "Portatil";
       car2.modelo = "iPhone XR";
 
       fone2.codigo_id_fone = 302;
       fone2.tipo = "AIRDOT";
       fone2.modelo = "IPhone XR";
 
       fun2.id_funcionario = 402;
       fun2.nome = "José Felipe";
       fun2.cpf = "11122233344";
       fun2.data_nasc = "Quintas das Colinas humildes";
       fun2.funcao = "Vendedor";
 
       Pelicula pel3 = new Pelicula();
       Capinha cap3 = new Capinha();
       Carregador car3 = new Carregador();
       Fone fone3 = new Fone();
       Funcionario fun3 = new Funcionario();
 
       pel3.codigo_id_pelicula = 003;
       pel3.tipo = "HIDROGEL";
       pel3.modelo = "Xiaomi Mi 11";
 
       cap3.codigo_id_cap = 103;
       cap3.tipo = "Aveludada";
       cap3.modelo = "Xiaomi Mi 11";
 
       car3.codigo_id_car = 203;
       car3.tipo = "Turbo";
       car3.modelo = "Xiaomi Mi 11";
 
       fone3.codigo_id_fone = 303;
       fone3.tipo = "Headfone";
       fone3.modelo = "Xiaomi Mi 11";
 
       fun3.id_funcionario = 403;
       fun3.nome = "Luan Araújo";
       fun3.cpf = "02702904121";
       fun3.data_nasc = "19/08/1997";
       fun3.endereco = "Rua Ronaldo Barata, 09";
       fun3.funcao = "Estoque";
 
       System.out.println("");
 
       System.out.println("Produto: " + pel1.codigo_id_pelicula + "\nModelo: " +
               pel1.modelo + "\nTipo: " + pel1.tipo);
 
       System.out.println("");
   }
}