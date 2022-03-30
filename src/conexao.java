import java.sql.*;

public class conexao {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    conexao(){
        url = "jdbc:postgresql://localhost:5432/StoreCase";
        username = "postgres";
        password = "123456";

        try {

            Class.forName("org.postgres.Driver");
            connection = DriverManager.getConnection(url, username,password);
            System.out.println("Conexão Realizada com Sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

