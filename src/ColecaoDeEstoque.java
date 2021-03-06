import java.util.*;

public class ColecaoDeEstoque implements ContratoEstoque{


    ArrayList<Produto> meusProdutos = new ArrayList<Produto>();


    public void cadastra(Produto p){ 
        meusProdutos.add(p);
        System.out.println("Produto adcionado com sucesso! ");
    }

    public void remove(Integer cod){
        if (cod <= 0){
            System.out.println("Código inválido, informe algo acima de 0");
        } else if (cod > meusProdutos.size()){
            System.out.println("Código inválido, informe algo abaixo de "+ meusProdutos.size());
        } else {
            meusProdutos.remove(meusProdutos.get(cod - 1));
            System.out.println("Produto removido com Sucesso!");
        }
    }
 
    public void atualiza(Integer cod_att, Double pre_att){
        if (cod_att <= 0){
            System.out.println("Código inválido, informe algo acima de 0");
        } else if (cod_att > meusProdutos.size()){
            System.out.println("Código inválido, informe algo abaixo de "+ meusProdutos.size());
        } else {
            meusProdutos.get(cod_att - 1).setPreco(pre_att);
            System.out.println("Metodo atualização produto");
        }
    }

    public void estoque(){
        Integer cont = 1;
        System.out.println("+--------- INVENTÁRIO ATUAL ----------+");
        for (int i=0; i<meusProdutos.size(); i++){
            System.out.println("PRODUTO #" + cont++ +"\n"+
            "CATEGORIA.: " + meusProdutos.get(i).getCategoria() + "\n" +
            "MODELO....: " + meusProdutos.get(i).getModelo() + "\n" +
            "TIPO......: " + meusProdutos.get(i).getTipo() + "\n" +
            "PREÇO.....: " + meusProdutos.get(i).getPreco() + "\n" + 
            "QUANTIDADE: " + meusProdutos.get(i).getQuant() + "\n"+
            "=========================");
        }
        System.out.println("+-------------------------------------+");
    }

    public boolean tem_estoque(){
        if (meusProdutos.size() > 0){
            return true;
        } else {
            return false;
        }
    }

    public Double desconta_estoque(Integer cod, Integer quant){
        meusProdutos.get(cod).setQuant(meusProdutos.get(cod).getQuant() - quant);
        return meusProdutos.get(cod).getPreco() * quant;
    }

    public String procura_item(Integer cod){
        return meusProdutos.get(cod).toString();
    }
}
