import java.sql.*;

class Conexao {
    private String url;
    private String username;
    private String password;
    private Connection con;

    Conexao(){
        url = "jdbc:postgresql://localhost:5432/StoreCase";
        username = "postgres";
        password = "123456";

        try {

            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, username,password);
            System.out.println("Conexão Realizada com Sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    public int executaPostgres(String sql){
        try {
           Statement stm = con.createStatement();
           int res = stm.executeUpdate(sql);
           con.close();
           return res;
        } catch (Exception e) {
           e.printStackTrace();
        }
        return 0;
      }
  }
