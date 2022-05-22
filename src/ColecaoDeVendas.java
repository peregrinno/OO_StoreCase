import java.util.*;
public class ColecaoDeVendas implements ContratoDeVendas {

    ArrayList<Vendas> minhasVendas = new ArrayList<Vendas>();

    @Override
    public void nova_venda(Vendas v) {
        minhasVendas.add(v);
        System.out.println("Venda realizada com Sucesso\n");
    }

    @Override
    public void relatorio_venda() {
        Integer cont = 1;
        System.out.println("+--------- RELATÓRIO DE VENDAS ----------+");
        for (int i=0; i<minhasVendas.size(); i++) {
            System.out.println("VENDA #" + cont++ +"\n"+
            "CLIENTE.: " + minhasVendas.get(i).getCliente() + "\n" +
            "DECRIÇÃO: \n" + minhasVendas.get(i).getProdutos_venda() +
            "\n TOTAL...: " + minhasVendas.get(i).getTotal_venda() + "\n" +
            "=========================");
        }
        System.out.println("+-------------------------------------+");
        
    }

    @Override
    public void procura_venda() {
       
        
    }
    
}
