class Produto {
    private String categoria;
    private String modelo;
    private String tipo;
    private Float preco;

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

}
