import java.util.*;
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

    String menu_caixa(){
        String menu_caixa = "+######  STORE CASE - CARUARU  ###### +\n" +
        "+              MENU - ESTOQUE         +\n" +
        "+                                     +\n" +
        "+          [1] - ABRIR CAIXA          +\n" +
        "+          [2] - NOVA VENDA           +\n" +
        "+          [3] - VENDAS               +\n" +
        "+          [0] - VOLTAR               +\n" +
        "+-------------------------------------+\n" +
        "->  ";
        return menu_caixa;
    }

    public void venda_ativa(Vendas v, ContratoEstoque estoque){
        Scanner vd_prod = new Scanner(System.in);
        Double total = 0.0;
        Integer opc;
        boolean status_venda = true;
        while (status_venda == true){
            System.out.print("COD: ");
            Integer cd = vd_prod.nextInt();
            System.out.println(estoque.procura_item(cd - 1));
            System.out.print("Quantidade: ");
            Integer qd = vd_prod.nextInt();
            Double subtotal = estoque.desconta_estoque(cd - 1, qd);
            v.setProdutos_venda(String.format(qd+"x " +estoque.procura_item(cd - 1) + "R$ "+ subtotal));
            total = total + subtotal;
            v.setTotal_venda(total);
            System.out.print("[1] ADC ITEM [2] FECHAR VENDA \n ->");
            opc = vd_prod.nextInt();
            switch(opc) {
                case 1:
                    status_venda = true;
                    break;
                case 2:
                    status_venda = false;
                    break;
                
            }
        }

    }
}