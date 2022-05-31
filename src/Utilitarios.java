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
        "+              MENU - CAIXA         +\n" +
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
            System.out.print("[1] ADC ITEM [2] FECHAR VENDA \n -> ");
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
       // vd_prod.close();
    }

    String menu_rh(){
        String menu_rh = "+######  STORE CASE - CARUARU  ###### +\n" +
        "+              MENU - RH              +\n" +
        "+                                     +\n" +
        "+          [1] - ADMISSÃO             +\n" +
        "+          [2] - DEMISSÃO             +\n" +
        "+          [3] - CARGOS               +\n" +
        "+          [4] - QUADRO               +\n" +
        "+          [0] - VOLTAR               +\n" +
        "+-------------------------------------+\n" +
        "->  ";
        return menu_rh;
    }

    public void cria_cargos(ContratoFuncoes cargos){

        Funcoes cargo1 = new Funcoes();

        cargo1.setFuncao("Atendente");

        Funcoes cargo2 = new Funcoes();

        cargo2.setFuncao("Estoquista");

        Funcoes cargo3 = new Funcoes();

        cargo3.setFuncao("Operador de caixa");

        cargos.adicionar(cargo1);
        cargos.adicionar(cargo2);
        cargos.adicionar(cargo3);
    }
}