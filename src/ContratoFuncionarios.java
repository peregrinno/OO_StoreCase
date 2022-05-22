public interface ContratoFuncionarios {
    
    public void admissao(Funcionario f);

    public void demissao(Integer cod);

    public void procurar(Funcionario f);

    public void quadro();

    public boolean tem_funcionarios();
    
}
