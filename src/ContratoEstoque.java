public interface ContratoEstoque {

    public void cadastra (Produto p);

    public void remove(Integer cod);

    public void atualiza (Integer cod_att, Double pre);

    public void estoque ();

    public boolean tem_estoque();

    public Double desconta_estoque(Integer cod, Integer quanti);

    public String procura_item(Integer cod);

}
