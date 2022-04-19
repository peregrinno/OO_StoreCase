// Orientação a Obejtos - Professor Jorge Fonseca
//Alunos: Hydelbranda, Felipe, Luan, Moises e Edson

import java.util.*;

class main {
   public static void main(String[] args) {
      boolean status_loja = true;
      Scanner entrada = new Scanner(System.in);

      //Cria lista de funções
      Funcoes cargo1 = new Funcoes();
      Funcoes cargo2 = new Funcoes();
      Funcoes cargo3 = new Funcoes();

      //Define cargos
      cargo1.setFuncao("Operador de caixa");
      cargo2.setFuncao("Atendente");
      cargo3.setFuncao("Estoquista");

      //Adiciona a coleção de funções
      ColecaoDeFuncoes colecaoFuncoes = new ColecaoDeFuncoes();
      colecaoFuncoes.adicionar(cargo1);
      colecaoFuncoes.adicionar(cargo2);
      colecaoFuncoes.adicionar(cargo3);

      //Cria coleção para armazenamento de obejetos
      ColecaoDeProdutos colecao = new ColecaoDeProdutos();

      //Cria primeiro objeto da classe produto
      Produto produto1 = new Produto();

      //Adciona atributos do objeto criado
      produto1.setIdproduto(123);
      produto1.setCategoria("Case");
      produto1.setModelo("Motorola");
      produto1.setTipo("Silicone");
      produto1.setPreco(17.0);
      //Adiciona a colecao
      colecao.adicionar(produto1);

      //Cria primeiro objeto da classe produto
      Produto produto2 = new Produto();

      //Adciona atributos do objeto criado
      produto2.setIdproduto(124);
      produto2.setCategoria("Case");
      produto2.setModelo("Samsung");
      produto2.setTipo("Anti-Impacto");
      produto2.setPreco(21.0);
      //Adiciona a colecao
      colecao.adicionar(produto2);

      //Cria coleção para funcionários
      ColecaoDeFuncionarios colecaoFuncionarios = new ColecaoDeFuncionarios();

      //Cria primeiro obejto da classe funcionario
      Funcionario funcionario1 = new Funcionario();
      Funcionario funcionario2 = new Funcionario();

      //Adiciona um funcionario
      funcionario1.setIdfuncionario(1);
      funcionario1.setNome("Hydelbranda Melo");
      funcionario1.setData_de_nascimento("06/06/2002");
      funcionario1.setFuncao("Operadora de Caixa");
      funcionario1.setEndereco("Casa de Taty");

      //Adiciona outro funcionario
      funcionario2.setIdfuncionario(1);
      funcionario2.setNome("José Felipe");
      funcionario2.setData_de_nascimento("13/09/2000");
      funcionario2.setFuncao("Atendente");
      funcionario2.setEndereco("Condominio Morada nobre");

      //Adciona na coleção de funcionarios
      colecaoFuncionarios.adicionar(funcionario1);
      colecaoFuncionarios.adicionar(funcionario2);


      while (status_loja == true){
         System.out.println("+      MENU       +" + "\n"+
         "[1] REMOVER PRODUTO" + "\n" + 
         "[2] PROCURAR PRODUTO" + "\n" + 
         "[3] REMOVER FUNCIONARIO" + "\n" + 
         "[4] PROCURAR FUNCIONARIO" + "\n" + 
         "[5] CARGOS");
         System.out.print("--> ");
         
         switch (entrada.nextInt()){
            case 1:
               int aux_remover;
               Scanner entrada_remover = new Scanner(System.in);
               System.out.print("[REMOÇÃO] ID DO PRODUTO: ");
               aux_remover = entrada_remover.nextInt();
               if (aux_remover == 123){
                  colecao.remover(produto1);
                  System.out.println("PRODUTO [ID_123] REMOVIDO!");
                  break;
               } else if (aux_remover == 124){
                  colecao.remover(produto2);
                  System.out.println("PRODUTO [ID_124] REMOVIDO!");
                  break;
               } else {
                  System.out.print("Nenhum produto removido");
                  break;
               }
            case 2:
               int aux;
               Scanner entrada_procurar = new Scanner(System.in);
               System.out.print("[BUSCA] ID DO PRODUTO: ");
               aux = entrada_procurar.nextInt();
               if (aux == 123){
                  colecao.procurar(produto1);
                  break;
               }else if (aux == 124){
                  colecao.procurar(produto2);
                  break;
               }else {
                  System.out.println("Produto não encontrado");
                  break;
               }
            case 3:
               int aux_remover_funcionario;
               Scanner remove_f = new Scanner(System.in);
               System.out.print("[REMOÇÃO] ID DO FUNCIONARIO: ");
               aux_remover_funcionario = remove_f.nextInt();
               if (aux_remover_funcionario == 1){
                  colecaoFuncionarios.remover(funcionario1);
                  break;
               } else if (aux_remover_funcionario == 2){
                  colecaoFuncionarios.remover(funcionario2);
                  break;
               }else {
                  System.out.println("Nenhum funcionario encontrado!");
                  break;
               }
            case 4:
               int aux_procurar_funcionario;
               Scanner procurar_f = new Scanner(System.in);
               System.out.print("[BUSCA] ID DO FUNCIONARIO: ");
               aux_procurar_funcionario = procurar_f.nextInt();
               if (aux_procurar_funcionario == 1){
                  colecaoFuncionarios.procurar(funcionario1);
                  break;
               } else if (aux_procurar_funcionario == 2){
                  colecaoFuncionarios.procurar(funcionario2);
                  break;
               } else {
                  System.out.println("Funcionario não encontrado");
                  break;
               }
            case 5:
               colecaoFuncoes.imprimir(cargo1, cargo2, cargo3);
            default:
               status_loja = false;
               break;
         }
         
      }
   }
}