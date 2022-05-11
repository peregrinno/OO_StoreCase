import java.util.*;
// Zé Felipe e Luan do brega
public class App {
    public static void main(String[] args) throws Exception {
        boolean status_loja = true;
        String entrada1;
        
       // boolean status_adm = true;
        //Scanner menu_adm = new Scanner(System.in);

        //entrada_menu
        Scanner entrada_menu_inicial = new Scanner(System.in);
        while (status_loja == true) {
            //Novo objeto para utilitarios
            Utilitarios util = new Utilitarios();

            //Chama metodo para mostrar menu
            System.out.print(util.mostrar_menu_inicial());
            
            entrada1 = entrada_menu_inicial.nextLine();

            switch (entrada1) {
                case "0":
                    System.out.println("Saindo, obrigado por usar nosso sistema!");
                    status_loja = false;
                    break;
                case "1":
                    //Novo objeto de Produtos
                    Produto produto = new Produto();

                    //Novo objeto da Colecao de estoque
                    ContratoEstoque estoque = new ColecaoDeEstoque();

                    Scanner entrada_menu_estoque = new Scanner(System.in);
                    String ent_menu_estoque;
                    boolean status_estoque = true;

                    while(status_estoque == true){

                     estoque.mostra_menu2();

                     ent_menu_estoque = entrada_menu_estoque.nextLine();
                     switch(ent_menu_estoque){
                         case "1":
                           System.out.println("Estoque atual");
                           status_estoque = false;
                           break;
                         case "2":

                           Scanner dados_produto = new Scanner(System.in);
                           Scanner dados_flt = new Scanner(System.in);

                           System.out.println("CADASTRO NOVO PRODUTOz\n");
                           System.out.print("CATEGORIA: ");
                           produto.setCategoria(dados_produto.nextLine());
                           System.out.print("MODELO DO APARELHO: ");
                           produto.setModelo(dados_produto.nextLine());
                           System.out.print("TIPO DE "+ produto.getCategoria()+": ");
                           produto.setTipo(dados_produto.nextLine());
                           System.out.print("VALOR: ");
                           produto.setPreco(dados_flt.nextFloat());

                           estoque.cadastra(produto);
                           status_estoque = false;
                           dados_produto.close();
                           dados_flt.close();
                           break;
                         case "3":
                           estoque.remove(produto);
                           status_estoque = false;
                           break;
                         case "4":
                           estoque.atualiza(produto);
                           status_estoque = false;
                           break;
                        default:
                           System.out.println("Entrada incorreta");
                     }
                    }
    
                    break;
                    /*
                case "2":

                    //Novo objeto da classe caixa

                    caixa.mostra_menu2();

                    break;
                    */
                    /*
                case "3":
                    
                    //Novo obejto da classe funcionario

                    rh.mostra_menu2();

                    break;
                    */
                    /*
                case "4":
                    
                    //Novo objeto da classe administração
                    while(status_adm == true){
                        contratoCrud adm = new Adm();

                        adm.mostra_menu2();
                        entrada2 = menu_adm.nextLine();
                        
                        switch(entrada2){

                            case "0":
                                System.out.println("Saindo");
                                status_adm = false;
                                break;
                            
                            case "1":
                                System.out.println("Relatório de vendas");
                                break;
                            
                            case "2":
                                System.out.println("Cargos");
                                break;
                            
                            case "3":
                                System.out.println("Produtos + vendidos");
                                break;
                            
                            default:
                                System.out.println("Caso default");
                                break;
                        }
                    }
                    break;
                    */
                default:
                    System.out.println("Entrada invalida");
                    break;
            }
        }

        entrada_menu_inicial.close(); 
   
    }
}