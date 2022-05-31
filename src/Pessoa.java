public class Pessoa {
    private String nome;
    private String cpf;
    private String data_de_nascimento;
    private String endereco;

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
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


}
