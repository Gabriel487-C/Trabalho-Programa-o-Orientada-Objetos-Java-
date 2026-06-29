import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Sistema sistema = new Sistema();

        

        Usuario a1 = new Usuario("Gabriel", "03629794050", 1, 1, "123");
        Usuario a2 = new Usuario("Guilherme", "03627894012", 2, 2, "124");
        Usuario a3 = new Usuario("Daniel", "03622794450", 3, 3, "321");
        Usuario a4 = new Usuario("Roberto", "05822124450", 4, 4, "1a2");
        Usuario a5 = new Usuario("Rogerio", "05822124679", 5, 4, "1a3");
        
        

        ArrayList<Usuario> Logins = new ArrayList<>();
        Logins.add(a1);
        Logins.add(a3);
        Logins.add(a2);
        Logins.add(a4);
        Logins.add(a5);
        
        Produto p1 = new Produto(1, "Teclado Mecanico", 120.0f, 2);
        Produto p2 = new Produto(2, "Mouse Gamer", 75.0f, 1);
        Produto p3 = new Produto(3, "Monitor 24 Polegadas", 899.0f, 1);

        Produto p4 = new Produto(4, "Headset USB", 150.0f, 3);
        Produto p5 = new Produto(5, "Webcam Full HD", 220.0f, 1);
        Produto p6 = new Produto(6, "SSD 1TB", 450.0f, 2);
        Produto p7 = new Produto(7, "Memoria RAM 16GB", 280.0f, 4);
        
        Produto p8 = new Produto(8, "Notebook Gamer", 4500.0f, 1);
        Produto p9 = new Produto(9, "Processador Ryzen 7 7700X", 1899.0f, 2);
        Produto p10 = new Produto(10, "Placa de Video RTX 4060", 2599.0f, 1);
        Produto p11 = new Produto(11, "Fonte 750W 80 Plus Gold", 549.0f, 3);
        Produto p12 = new Produto(12, "Gabinete Mid Tower", 399.0f, 2);
        Produto p13 = new Produto(13, "Placa Mae B650", 1099.0f, 2);
        Produto p14 = new Produto(14, "Cooler para Processador", 189.0f, 5);
        Produto p15 = new Produto(15, "HD Externo 2TB", 429.0f, 4);
        Produto p16 = new Produto(16, "Pendrive 128GB", 89.0f, 10);
        Produto p17 = new Produto(17, "Roteador Wi-Fi 6", 499.0f, 3);
        
        ArrayList<Produto> produtos1 = new ArrayList<>();
        ArrayList<Produto> produtos2 = new ArrayList<>();
        ArrayList<Produto> produtos3 = new ArrayList<>();
        ArrayList<Produto> todosProdutos = new ArrayList<>();

        produtos1.add(p1);
        produtos1.add(p2);
        produtos1.add(p3);
        produtos1.add(p15);
        produtos1.add(p14);
        produtos1.add(p13);
        produtos1.add(p17);


        produtos2.add(p7);
        produtos2.add(p6);
        produtos2.add(p8);
        produtos2.add(p13);
        produtos2.add(p14);
        produtos2.add(p15);
        produtos2.add(p16);

        produtos3.add(p5);
        produtos3.add(p4);
        produtos3.add(p8);
        produtos3.add(p9);
        produtos3.add(p10);
        produtos3.add(p11);
        produtos3.add(p12);
        


        todosProdutos.addAll(produtos1);
        todosProdutos.addAll(produtos2);
        todosProdutos.addAll(produtos3);
        
        Fornecedor f1 = new Fornecedor("rafael", "03629798012", 15, 1, "123");
        Fornecedor f2 = new Fornecedor("Roque", "13632198012", 16, 1, "1234");
        Fornecedor f3 = new Fornecedor("Roberto", "03629798145", 17, 1, "1235");

        f1.acrescentarProdutoALista(produtos1);
        f2.acrescentarProdutoALista(produtos2);
        f3.acrescentarProdutoALista(produtos3);
        
        HashMap<Fornecedor, ArrayList<Produto>>fornecedorProduto1 = new HashMap<>();
        HashMap<Fornecedor, ArrayList<Produto>>fornecedorProduto2 = new HashMap<>();
        HashMap<Fornecedor, ArrayList<Produto>>fornecedorProduto3 = new HashMap<>();

        fornecedorProduto1.put(f1, produtos1);
        fornecedorProduto2.put(f2, produtos2);
        fornecedorProduto3.put(f3, produtos3);
        
        Transportadora t1 = new Transportadora(1, "Rapido Garibaldi", "9237954050", fornecedorProduto1);
        Transportadora t2 = new Transportadora(2,"Expresso sao miguel", "9237955102", fornecedorProduto2);
        Transportadora t3 = new Transportadora(3,"Rapido Igrejinha", "9237105231", fornecedorProduto3);

        ArrayList<Transportadora> listaTranportadoras = new ArrayList<>();

        listaTranportadoras.add(t1);
        listaTranportadoras.add(t2);
        listaTranportadoras.add(t3);

        ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();

        listaFornecedores.add(f1);
        listaFornecedores.add(f2);
        listaFornecedores.add(f3);

        Scanner scanner = new Scanner(System.in);

        ArrayList<Carrinhoitem> carrinho = new ArrayList<>();

        carrinho.add(new Carrinhoitem(1, "Teclado Mecanico", 120.0f, 2));
        carrinho.add(new Carrinhoitem(2, "Mouse Gamer", 75.0f, 1));
        carrinho.add(new Carrinhoitem(3, "Monitor 24 Polegadas", 899.0f, 1));
        carrinho.add(new Carrinhoitem(4, "Headset USB", 150.0f, 3));
        carrinho.add(new Carrinhoitem(5, "Webcam Full HD", 220.0f, 1));
        carrinho.add(new Carrinhoitem(6, "SSD 1TB", 450.0f, 2));
        carrinho.add(new Carrinhoitem(7, "Memoria RAM 16GB", 280.0f, 4));
        carrinho.add(new Carrinhoitem(8, "Notebook Gamer", 4500.0f, 1));
        carrinho.add(new Carrinhoitem(9, "Processador Ryzen 7 7700X", 1899.0f, 2));
        carrinho.add(new Carrinhoitem(10, "Placa de Video RTX 4060", 2599.0f, 1));
        carrinho.add(new Carrinhoitem(11, "Fonte 750W 80 Plus Gold", 549.0f, 3));
        carrinho.add(new Carrinhoitem(12, "Gabinete Mid Tower", 399.0f, 2));
        carrinho.add(new Carrinhoitem(13, "Placa Mae B650", 1099.0f, 2));
        carrinho.add(new Carrinhoitem(14, "Cooler para Processador", 189.0f, 5));
        carrinho.add(new Carrinhoitem(15, "HD Externo 2TB", 429.0f, 4));
        carrinho.add(new Carrinhoitem(16, "Pendrive 128GB", 89.0f, 10));
        carrinho.add(new Carrinhoitem(17, "Roteador Wi-Fi 6", 499.0f, 3));
        
        ArrayList<Carrinhoitem> carrinho1 = new ArrayList<>();
        ArrayList<Carrinhoitem> carrinho2 = new ArrayList<>();
        

        carrinho1.add(new Carrinhoitem(1, "Teclado Mecanico", 120.0f, 2));
        carrinho1.add(new Carrinhoitem(2, "Mouse Gamer", 75.0f, 1));
        carrinho1.add(new Carrinhoitem(3, "Monitor 24 Polegadas", 899.0f, 1));
        carrinho1.add(new Carrinhoitem(4, "Headset USB", 150.0f, 3));
        carrinho1.add(new Carrinhoitem(5, "Webcam Full HD", 220.0f, 1));
        carrinho1.add(new Carrinhoitem(6, "SSD 1TB", 450.0f, 2));
        
        Data data1 = new Data(12, 12, 2024);
        Data data2 = new Data(10, 11, 2024);

        Pedido pedido1 = new Pedido("ped1", 15221, 0, sistema.calculaValor(carrinho1), data1, carrinho1);
       
        Logins.get(4).getPedido().add(pedido1);
        Logins.get(4).getPedidoPendente().add(pedido1);
        
        carrinho2.add(new Carrinhoitem(7, "Memoria RAM 16GB", 280.0f, 4));
        carrinho2.add(new Carrinhoitem(8, "Notebook Gamer", 4500.0f, 1));
        carrinho2.add(new Carrinhoitem(9, "Processador Ryzen 7 7700X", 1899.0f, 2));
        carrinho2.add(new Carrinhoitem(10, "Placa de Video RTX 4060", 2599.0f, 1));
        carrinho2.add(new Carrinhoitem(11, "Fonte 750W 80 Plus Gold", 549.0f, 3));
        carrinho2.add(new Carrinhoitem(12, "Gabinete Mid Tower", 399.0f, 2));
        carrinho2.add(new Carrinhoitem(13, "Placa Mae B650", 1099.0f, 2));
        carrinho2.add(new Carrinhoitem(14, "Cooler para Processador", 189.0f, 5));
        carrinho2.add(new Carrinhoitem(15, "HD Externo 2TB", 429.0f, 4));

        Pedido pedido2 = new Pedido("ped2", 15231, 0, sistema.calculaValor(carrinho2), data2, carrinho2);
        
        Logins.get(3).getPedido().add(pedido2);
        Logins.get(3).getPedidoPendente().add(pedido2);

        Lojaestoque estoque = new Lojaestoque(todosProdutos);

       
        estoque.setEstoqueLoja(CarregarItens.carregar("estoque.dat"));
        Logins = CarregarItens.carregar("logins.dat");
        listaTranportadoras = CarregarItens.carregar("transportadoras.dat");
        listaFornecedores = CarregarItens.carregar("fornecedores.dat");
        todosProdutos = CarregarItens.carregar("produtos.dat");
        
        System.out.println("---------------------------");
        System.out.println("Sistema E-Commerce OOP");
        int op = 1;
        int tentativa = 0;
        Usuario usuario = null;

        while (op != -1) {
            
        if(tentativa == 3){
           System.out.println("Sistema Bloqueado !"); 
           System.exit(0);
        }
        
        System.out.println("Login: ");
        String log = scanner.nextLine();

        System.out.println("Senha: ");
        String password = scanner.nextLine();

        usuario = sistema.retornarUsuario(password, log, Logins);

        if(usuario != null){
            System.out.println("Login Realizado com Sucesso !!\n");
            System.out.println("Bem vindo " + usuario.getNome() + "!!");
            System.out.println("Nivel de acesso: " + usuario.nomenclaturaAcesso(usuario.nivelDeAcesso));
            
            op = -1;
        }
        else{
            tentativa++;
            System.out.println("Senha ou login incorreto !!");
            System.out.println("Tente novamente - Tentativa " + tentativa + "/3" );
           
        }
    
      }
      
      int op2 = 1;
      
      if(usuario.nivelDeAcesso == 1 || usuario.nivelDeAcesso == 2){

       while(op2 != 0){
       
        System.out.println("----------------------------");
        System.out.println("Menu");
        System.out.println("1 - Cadastrar novo usuario");
        System.out.println("2 - Exibir Usuarios");
        System.out.println("3 - Alterar Cadastro");
        System.out.println("4 - Cadastrar Transportadora");
        System.out.println("5 - Exibir Transportadoras");
        System.out.println("6 - Alterar Cadastro Transportadora");
        System.out.println("7 - Cadastrar Produto");
        System.out.println("8 - Exibir Produtos");
        System.out.println("9 - Alterar Produto");
        System.out.println("10 - Consultar produto por ID");
        System.out.println("11 - consultar Usuario por ID");
        System.out.println("12 - consultar fornecedor por ID");
        System.out.println("13 - consultar tranportadoras por ID");
        System.out.println("14 - Cadastrar Fornecedor");
        System.out.println("15 - Exibir Fornecedores");
        System.out.println("16 - Alterar Fornecedor");
        System.out.println("17 - Acrescentar Produto a fornecedor");
        System.out.println("18 - Excluir produto");
        System.out.println("19 - Excluir Fornecedor");
        System.out.println("20 - Excluir Transportadora");
        System.out.println("21 - Excluir Usuario");
        System.out.println("22 - Acrescentar Rota a Transportadora");
        System.out.println("23 - Exibir Cargas");
        System.out.println("0 - encerrar programa");
        op2 = scanner.nextInt();
        scanner.nextLine();

        switch (op2) {
            
            
            case 1:
                Usuario novo = sistema.criarNovoUsuario(Logins);

                if(novo != null){
                    Logins.add(novo);
                    System.out.println("Usuario cadastrado com Sucesso !");
                }
                else{
                    System.out.println("Falha ao cadastrar usuario !");
                }
                break;
            
            case 2:
                   sistema.exibirUsuarios(Logins); 
                   break;
            case 3:
                   sistema.alterarUsuario(Logins);
                   break;
            case 4:
                   sistema.cadastrarTransportadora(listaTranportadoras);
                   break;
            case 5:
                   sistema.exibirTranportadoras(listaTranportadoras);
                   break;
            case 6:
                   sistema.alterarTransportadora(listaTranportadoras);
                   break;
            case 7:
                   sistema.cadastrarProdutos(todosProdutos, estoque);
                   break;
            case 8:
                   sistema.exibirProdutos(todosProdutos);
                   break;
            case 9:
                   sistema.alterarProdutos(todosProdutos, estoque);
                   break;
            case 10:
                   sistema.consultarIdProd(todosProdutos);
                   break;
            case 11:
                   sistema.consultarIdUsuario(Logins);
                   break;
            case 12:
                   sistema.consultarIdFornecedor(listaFornecedores);
                   break;
            case 13:
                   sistema.consultarIdTransportadora(listaTranportadoras);
                   break;
            case 14:
                   sistema.criarNovofornecedor(listaFornecedores);
                   break;
            case 15:
                    sistema.exibirFornecedores(listaFornecedores); 
                    break;
            case 16:
                     sistema.alterarFornecedor(listaFornecedores); 
                     break;
            case 17:
                     sistema.acrescentarProdutoAfornecedor(todosProdutos, listaFornecedores);
                     break;   
            case 18:
                     sistema.excluiProduto(todosProdutos, estoque.getEstoqueLoja());
                     break;
            case 19:
                     sistema.excluiFornecedor(listaFornecedores);
                     break;
            case 20:
                     sistema.excluiTransportadora(listaTranportadoras);
                     break;
            case 21:
                      sistema.excluiUsuario(Logins);
                      break;           
            case 22:
                      sistema.acrescentarRota(Logins, listaTranportadoras);
                      break;    
            case 23:
                      sistema.exibirCargas(listaTranportadoras);           
                      break;   
                     
            default:
                break;
        }


      }

      
     }
     else if(usuario.nivelDeAcesso == 4){

       while(op2 != 0){
          
         System.out.println("----------------------------");
         System.out.println("1 - Consultar Produto por ID");    
         System.out.println("2 - Consultar Produto por Nome");
         System.out.println("3 - Adicionar Produto ao Carrinho");
         System.out.println("4 - Exibir todos itens em estoque");
         System.out.println("5 - Excluir produto do carrinho por posicao");
         System.out.println("6 - Exibir historico de compras"); 
         System.out.println("7 - Consultar Carrinho");
         System.out.println("8 - Efetivar Compra");
         System.out.println("0 - encerrar programa");
         op2 = scanner.nextInt();
         scanner.nextLine();

         switch(op2){
              
              case 1:
                  sistema.buscaritemporIdCompras(estoque.getEstoqueLoja());
                  break;
              
              case 2:
                  sistema.buscarItemPorNome(estoque.getEstoqueLoja());
                  break;
              
              case 3:
                  sistema.addprodCarrinho(estoque,usuario);
                  break;
              
              case 4:
                  sistema.mostrarTodosOsitens(estoque);
                  break;

              case 5:
                  sistema.excluirItemCarrinho(estoque, usuario);
                  break;       
              
              case 6: 
                   usuario.exibirHistorico();
                   break; 

              case 7:
                   usuario.exibirCarrinho();      
                   break;  
              
              case 8:
                   sistema.efetivarCompra(usuario);
                   break;       
              
              default:
                  break;            
         }
       }
     }

     else if(usuario.nivelDeAcesso == 3){
       while(op2 != 0){
           System.out.println("----------------------------");
           System.out.println("1 - Repor Mercadoria");
           
           op2 = scanner.nextInt();
           scanner.nextLine();
  
           switch(op2){
              case 1:
                 sistema.reporMercadorias(estoque.getEstoqueLoja(), todosProdutos);    

       }
      }
     }
     scanner.close(); 
     CarregarItens.salvar(estoque.getEstoqueLoja(), "estoque.dat");
     CarregarItens.salvar(Logins, "logins.dat");
     CarregarItens.salvar(listaTranportadoras, "transportadoras.dat");
     CarregarItens.salvar(listaFornecedores, "fornecedores.dat");
     CarregarItens.salvar(todosProdutos, "produtos.dat"); 
    
   }

}
