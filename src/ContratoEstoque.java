public interface ContratoEstoque {

    public void cadastra (Produto p);

    public void remove(Integer cod);

    public void atualiza (Integer cod_att, Float pre);

    public void estoque ();
}
