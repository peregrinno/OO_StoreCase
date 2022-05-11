class Produto {
    private int id_produto;
    private String categoria;
    private String modelo;
    private String tipo;
    private Float preco;

    public void setIdproduto(Integer id){
        this.id_produto = id;
    }

    public Integer getIdproduto(){
        return id_produto;
    }

    public void setCategoria (String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
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

    public void setPreco (Float preco){
        this.preco = preco;
    }

    public Float getPreco(){
        return preco;
    }

    public String imprimir(){
        return "Produto encontrado!" + "\n" + id_produto + "\n" +
                "Categoria: " + categoria + "\n" +
                "Modelo: " + modelo + "\n" +
                "Tipo: " + tipo + "\n" + 
                "Preço: " + preco;
    }
}
