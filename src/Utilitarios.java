
public class Utilitarios {
    
    String mostrar_menu_inicial(){
        String menu = "+######  STORE CASE - CARUARU  ###### +\n" +
                    "+              MENU                   +\n" +
                    "+                                     +\n" +
                    "+          [1] - ESTOQUE              +\n" +
                    "+          [2] - VENDA                +\n" +
                    "+          [3] - RH                   +\n" +
                    "+          [4] - ADMINISTRÇÃO         +\n" +
                    "+          [0] - SAIR                 +\n" +
                    "+-------------------------------------+\n" +
                    "->  ";
        return menu;
    } 

    String menu_estoque(){
        String menu_estoque = "+######  STORE CASE - CARUARU  ###### +\n" +
                            "+              MENU - ESTOQUE         +\n" +
                            "+                                     +\n" +
                            "+       [1] - MOSTRA ESTOQUE ATUAL    +\n" +
                            "+       [2] - CADASTRAR PRODUTO       +\n" +
                            "+       [3] - REMOVER PRODUTO         +\n" +
                            "+       [4] - EDITAR PREÇO            +\n" +
                            "+       [0] - VOLTAR                  +\n" +
                            "+-------------------------------------+\n" +
                            "->  ";
        return menu_estoque;
    } 

}