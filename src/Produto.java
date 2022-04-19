import java.rmi.server.RemoteRef;

import org.postgresql.util.PGBinaryObject;

class Produto {
    int id_produto;
    String categoria_produto;
    String modelo;
    String tipo;
    Double valor_produto;

    public void setIdproduto(Integer id){
        this.id_produto = id;
    }

    public Integer getIdproduto(){
        return id_produto;
    }

    public void setCategoria (String categoria){
        this.categoria_produto = categoria;
    }

    public String getCategoria(){
        return categoria_produto;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setPreco (Double preco){
        this.valor_produto = preco;
    }

    public Double getPreco(){
        return valor_produto;
    }

    public String imprimir(){
        return "Produto encontrado!" + "\n" + id_produto + "\n" +
                "Categoria: " + categoria_produto + "\n" +
                "Modelo: " + modelo + "\n" +
                "Tipo: " + tipo + "\n" + 
                "Preço: " + valor_produto;
    }
}
