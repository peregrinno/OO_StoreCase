import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        boolean status_loja = true;
        Integer entrada1;
        
       // boolean status_adm = true;
        //Scanner menu_adm = new Scanner(System.in);

        
        while (status_loja == true) {
            //entrada_menu
            Scanner entrada_menu_inicial = new Scanner(System.in);

            //Novo objeto para utilitarios
            Utilitarios util = new Utilitarios();

            //Chama metodo para mostrar menu
            System.out.print(util.mostrar_menu_inicial());
            
            entrada1 = entrada_menu_inicial.nextInt();

            switch (entrada1) {
                case 0:
                    System.out.println("Saindo, obrigado por usar nosso sistema!");
                    status_loja = false;
                    break;
                case 1:
                    //Novo objeto da Colecao de estoque
                    ContratoEstoque estoque = new ColecaoDeEstoque();

                    Scanner entrada_menu_estoque = new Scanner(System.in);
                    String ent_menu_estoque;
                    boolean status_estoque = true;

                    while(status_estoque == true){
                        util.menu_estoque();

                        ent_menu_estoque = entrada_menu_estoque.next();

                        switch(ent_menu_estoque){
                            case "0":
                                System.out.println("Voltando para o menu...");
                                status_estoque = false;
                                break;
                            case "1":
                                estoque.estoque();
                                break;
                            case "2":
                                //Novo objeto de Produtos
                                Produto produto = new Produto();

                                Scanner dados_produto = new Scanner(System.in);

                                System.out.println("CADASTRO NOVO PRODUTO\n");
                                System.out.print("CATEGORIA: ");
                                produto.setCategoria(dados_produto.nextLine());
                                System.out.print("MODELO DO APARELHO: ");
                                produto.setModelo(dados_produto.nextLine());
                                System.out.print("TIPO DE "+ produto.getCategoria()+": ");
                                produto.setTipo(dados_produto.nextLine());
                                //produto.setTipo(dados_produto.next());
                                System.out.print("VALOR: ");
                                produto.setPreco(dados_produto.nextFloat());

                                estoque.cadastra(produto);
                        
                                break;
                            case "3":
                                Scanner cod_remove = new Scanner(System.in);
                                System.out.println("REMOÇÂO DE ITEM");
                                System.out.print("Informe o codigo do item: \n -> ");
                                Integer cod = cod_remove.nextInt();
                                estoque.remove(cod);
                                break;
                            case "4":
                                Scanner ent_att = new Scanner(System.in);
                                System.out.println("EDIÇÃO DE PREÇO");
                                System.out.print("Informe o codigo do item: \n -> ");
                                Integer cod_att = ent_att.nextInt();
                                System.out.print("Informe o novo preço: \n -> ");
                                Float pre_att = ent_att.nextFloat();
                                estoque.atualiza(cod_att, pre_att);
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
    }
}