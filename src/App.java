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
      try (Scanner ler = new Scanner(System.in)) {
         int ent_int1;

         while (status_loja == true) {
            System.out.println("+######  STORE CASE - CARUARU  ###### +");
            System.out.println("+               MENU                  +");
            System.out.println("+                                     +");
            System.out.println("+             [1] - ESTOQUE           +");
            System.out.println("+             [2] - RH                +");
            System.out.println("+             [3] - PDV               +");
            System.out.println("+             [4] - CONFIGS           +");
            System.out.println("+             [0] - SAIR              +");
            System.out.println("+-------------------------------------+");
            System.out.print("--> ");

            ent_int1 = ler.nextInt();

            switch (ent_int1) {
               case 0:
                  System.out.println("Saindo.. ");
                  status_loja = false;
               case 1:
                  Utilidades.MenuEstoque();

               case 2:
                  System.out.println("RH! - EM CONSTRUÇÃO");
               default:
                  System.out.println("Entrada inexistente! ");
            }
         }
      }

   }
}