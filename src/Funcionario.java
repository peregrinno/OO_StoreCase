class Funcionario {
    private int id_funcionario;
    private String nome;
    private String cpf;
    private String data_de_nascimento;
    private String endereco;
    private String funcao;

    public void setIdfuncionario(int id_funcionario){
        this.id_funcionario = id_funcionario;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Integer getIdfuncionario(){
        return id_funcionario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setData_de_nascimento(String data){
        this.data_de_nascimento = data;
    }

    public String getData_de_nascimento(){
        return data_de_nascimento;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public String getFuncao(){
        return funcao;
    }

}