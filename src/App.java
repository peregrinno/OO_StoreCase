// Orientação a Obejtos - Professor Jorge Fonseca
//Alunos: Hydelbranda, Felipe, Luan, Moises e Edson

import java.util.*;

class funcoes {

   int ID_FUNC;
   String funcao;

}

class main {
   public static void main(String[] args) {
      boolean status_loja = true;
      Scanner entrada = new Scanner(System.in);

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

      System.out.println("COLEÇÃO ATUAL");
      for(int i = 0; i < colecao.meusProdutos.size(); i++){
         System.out.println(colecao.meusProdutos.get(i).getIdproduto());
     }

      while (status_loja = true){
         System.out.println("MENU" + "\n"+
         "[1] REMOVER" + "\n" + 
         "[2] PROCURAR");
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
            default:
               status_loja = false;
               break;
         }
         
      }
   }
}