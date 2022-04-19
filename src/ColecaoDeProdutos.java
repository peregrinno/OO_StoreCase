import java.util.*;
public class ColecaoDeProdutos {
    ArrayList<Produto> meusProdutos = new ArrayList<>();

    public void adicionar (Produto p){
        meusProdutos.add(p);
        System.out.println("Teste adcionar a coleção OK");
    }

    public void remover(Produto p){
        meusProdutos.remove(p);
    }

    public void procurar(Produto p){
        for(int i = 0; i < meusProdutos.size(); i++){
            if(meusProdutos.contains(p)){
                System.out.println("Produto encontrado!" + "\n" + p.id_produto + "\n" +
                                    "Categoria: " + p.categoria_produto + "\n" +
                                    "Modelo: " + p.modelo + "\n" +
                                    "Tipo: " + p.tipo + "\n" + 
                                    "Preço: " + p.valor_produto);
            } else {
            System.out.println("Produto não encontrado.");
            }
        }
    }
}
