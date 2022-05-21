public class Vendas {
    private String produtos_venda = " ";
    private Double total_venda;
    private String cliente;


    public void setProdutos_venda(String produtos_venda) {
        this.produtos_venda = this.produtos_venda + "\n" + produtos_venda;
    }

    public String getProdutos_venda() {
        return this.produtos_venda;
    }

    public void setTotal_venda (Double total_venda){
        this.total_venda = total_venda;
    }

    public Double getTotal_venda(){
        return total_venda;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public String getCliente(){
        return cliente;
    }

}
