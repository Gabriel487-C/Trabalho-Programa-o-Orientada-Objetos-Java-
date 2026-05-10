import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        
        Sistema sistema = new Sistema();

        Usuario a1 = new Usuario("Gabriel", "03629794050", 1, 1, "123");
        Usuario a2 = new Usuario("Guilherme", "03627894012", 2, 2, "124");
        Usuario a3 = new Usuario("Daniel", "03622794450", 3, 3, "321");

        ArrayList<Usuario> Logins = new ArrayList<>();
        Logins.add(a1);
        Logins.add(a3);
        Logins.add(a2);
        
        Produto p1 = new Produto(1, "carvao", 12);
        Produto p2 = new Produto(2, "cafe", 32);
        Produto p3 = new Produto(3, "suco", 24);

        Produto p4 = new Produto(4, "ferro", 5);
        Produto p5 = new Produto(5, "chumbo", 6);
        Produto p6 = new Produto(6, "aluminio", 12);
        Produto p7 = new Produto(7, "vidro", 14);
        
        Produto p8 = new Produto(8, "cimento", 32);
        Produto p9 = new Produto(9, "areia", 18);
        Produto p10 = new Produto(10, "tinta branca", 45);
        Produto p11 = new Produto(11, "massa corrida", 27);
        Produto p12 = new Produto(12, "verniz", 38);
        Produto p13 = new Produto(13, "selador", 22);
        Produto p14 = new Produto(14, "pincel", 12);
        Produto p15 = new Produto(15, "rolo de pintura", 19);
        Produto p16 = new Produto(16, "thinner", 29);
        Produto p17 = new Produto(17, "lixa", 6);

        
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

        System.out.println("---------------------------");
        System.out.println("Sistema E-Commerce OOP");
        int op = 1;
        int tentativa = 0;

        while (op != -1) {
            
        if(tentativa == 3){
           System.out.println("Sistema Bloqueado !"); 
           System.exit(0);
        }
        
        System.out.println("Login: ");
        String log = scanner.nextLine();

        System.out.println("Senha: ");
        String password = scanner.nextLine();

        Usuario usuario = sistema.retornarUsuario(password, log, Logins);

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
                   sistema.cadastrarProdutos(todosProdutos);
                   break;
            case 8:
                   sistema.exibirProdutos(todosProdutos);
                   break;
            case 9:
                   sistema.alterarProdutos(todosProdutos);
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
                     sistema.excluiProduto(todosProdutos);
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
            default:
                break;
        }


      }

      scanner.close();
    }


   
}
