import java.util.*;
public class ColecaoDeProdutos {
    ArrayList<Produto> meusProdutos = new ArrayList<>();

    public void adicionar (Produto p){
        meusProdutos.add(p);
    }

    public void remover(Produto p){
        meusProdutos.remove(p);
    }

    public void procurar(Produto p){
        for(int i = 0; i < meusProdutos.size(); i++){
            if(meusProdutos.contains(p)){
                System.out.println("Produto encontrado!" + "\n" + p.getIdproduto() + "\n" +
                                    "Categoria: " + p.getCategoria() + "\n" +
                                    "Modelo: " + p.getModelo() + "\n" +
                                    "Tipo: " + p.getTipo() + "\n" + 
                                    "Preço: " + p.getPreco());
            } else {
            System.out.println("Produto não encontrado.");
            }
        }
    }
}
