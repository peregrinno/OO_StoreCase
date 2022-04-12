// Orientação a Obejtos - Professor Jorge Fonseca
//Alunos: Hydelbranda, Felipe, Luan, Moises e Edson

import java.util.Scanner;

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

            ent_int1 = ler.nextInt();

            switch (ent_int1) {
               case 0:
                  System.out.println("Saindo.. ");
                  status_loja = false;
               case 1:
                  System.out.println(Util.MenuEstoque());
               case 2:
                  System.out.println("RH! - EM CONSTRUÇÃO");
               default:
                  System.out.println("Entrada inexistente! ");
            }
         }
      }

   }
}