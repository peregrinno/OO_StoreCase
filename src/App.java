class Pelicula {
    int codigo_id_pelicula;
    String modelo;
    String tipo;
}
class Capinha{
    int codigo_id_capinha;
    String modelo;
    String tipo;
}

class Carregador{
    int codigo_id_carregador;
    String tipo;
    String modelo;
}

class Fone{
    int codigo_id_fone;
    String tipo;
    String modelo;
}

class Funcionario{
    int id_funcionario;
    String nome;
    int cpf;
    int data_nasc;
    String endereco;
    String funcao;
}

class main{
    public static void main (String [] args) {
        Pelicula pel;
        Capinha cap;
        Carregador car;
        Funcionario fun;

        pel = new Pelicula();
        car = new Carregador();
        cap = new Capinha();
        fun = new Funcionario();

        pel.codigo_id_pelicula = 001;
        car.codigo_id_carregador = 001;
        cap.codigo_id_capinha = 001;
        fun.id_funcionario = 001;

        
           //pel1.codigo_id_pelicula = 123;
           //pel1.tipo = "3D";
           //pel1.modelo = "M52 5G";
           //System.out.println("Produto: "+ pel1.codigo_id_pelicula+"\nModelo: "+pel1.modelo+"\nTipo: "+pel1.tipo);
    }

}