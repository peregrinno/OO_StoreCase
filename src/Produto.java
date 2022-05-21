class Produto {
    private String categoria;
    private String modelo;
    private String tipo;
    private Double preco;
    private Integer quantidade;

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

    public void setPreco (Double preco){
        this.preco = preco;
    }

    public Double getPreco(){
        return preco;
    }
    
    public void setQuant(Integer quant){
        this.quantidade = quant;
    }

    public Integer getQuant(){
        return quantidade;
    }

    public String toString(){
        String item;
        item = String.format("%s ", this.categoria) + 
                String.format(" PARA %s,", this.modelo) + 
                String.format(" TIPO: %s | ", this.tipo) ;
        return (item);
    }


}
