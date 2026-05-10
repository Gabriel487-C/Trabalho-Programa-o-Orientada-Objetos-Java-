import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sistema {

    Scanner scanner = new Scanner(System.in);

     public Usuario retornarUsuario(String password, String log, ArrayList<Usuario>login){
         
        for(int i = 0; i < login.size(); i++){

            if(password.equals(login.get(i).getSenha()) && log.equals(login.get(i).getNome())){
                return login.get(i);
            }

        }

        return null;

    }

    public Usuario criarNovoUsuario(ArrayList<Usuario>usuarios){
        System.out.println("----------------------------");
        System.out.println("Criacao de novo usuario");
        System.out.println("Digite o nome do usuario: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        System.out.println("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        int conferenciaId = conferirId(usuarios, id);
        
        if(conferenciaId == 0){
            System.out.println("ID ja existente !!");
            return null;
        }
        

        System.out.println("Digite o nivel de acesso: ");
        int nivelDeAcesso = scanner.nextInt();
        scanner.nextLine();

        Usuario usuario = new Usuario(nome, cpf,id,nivelDeAcesso,senha);
        return usuario;
    }

    public void exibirUsuarios(ArrayList<Usuario>usuarios){
        System.out.println("----------------------------");
        System.out.println("Usuarios: ");

        for(int i = 0; i < usuarios.size(); i++){
           System.out.println("Nome: " + usuarios.get(i).getNome());
           System.out.println("CPF: " + usuarios.get(i).getCpf());
           System.out.println("Id: " + usuarios.get(i).getId());
           System.out.println("senha: " + usuarios.get(i).getSenha());
           System.out.println("nivel de Acesso: " + usuarios.get(i).nomenclaturaAcesso(usuarios.get(i).getNivelDeAcesso())); 
           System.out.println("----------------------------");
        }
    }

    public int conferirId(ArrayList<Usuario>usuarios, int id){

        for(int i = 0; i < usuarios.size(); i++){

            if(id == usuarios.get(i).getId()){
                return 0;
            }
            
        }

        return 1;
    }

    public int conferirIdTrans(ArrayList<Transportadora>transportadoras, int id){

        for(int i = 0; i < transportadoras.size(); i++){

            if(id == transportadoras.get(i).getId()){
                return 0;
            }
            
        }

        return 1;
    }


    public int conferirIdProd(ArrayList<Produto>produtos, int id){

        for(int i = 0; i < produtos.size(); i++){

            if(id == produtos.get(i).getId()){
                return 0;
            }
            
        }

        return 1;
    }

    public int conferirIdForn(ArrayList<Fornecedor>forn, int id){

        for(int i = 0; i < forn.size(); i++){

            if(id == forn.get(i).getId()){
                return 0;
            }
            
        }

        return 1;
    }


    public ArrayList<Usuario> alterarUsuario(ArrayList<Usuario>usuarios){
        System.out.println("----------------------------");
        System.out.println("Alterar Dados Usuarios");
        System.out.println("Digite a ID: ");
        int idUsu = scanner.nextInt();
        scanner.nextLine();
        Boolean Idencontrado = false;

        for(int i = 0; i < usuarios.size(); i++){

            if(idUsu == usuarios.get(i).getId()){
                Idencontrado = true;
                usuarios.remove(i);
                break;
            }
        }

        if(Idencontrado == false){

            System.out.println("Cadastro Nao encontrado !");

            return usuarios;
        }
         
        
        Usuario novousuario = criarNovoUsuario(usuarios);
         
        usuarios.add(novousuario);

        System.out.println("Cadastro Atualizado com sucesso !");

        return usuarios;

    }

    public void cadastrarTransportadora(ArrayList<Transportadora>listatranportadora){
        System.out.println("----------------------------------------");
        System.out.println("Cadastro de transportadora");
        System.out.println("Digite o nome da tranportadora: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o CNPJ: ");
        String cnpj = scanner.nextLine();
        System.out.println("Digite a ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        int conferenciaId = conferirIdTrans(listatranportadora, id);
        
        if(conferenciaId == 0){
            System.out.println("ID ja existente !!");
            return;
        }


        Transportadora t1 = new Transportadora(nome, cnpj, id);
        listatranportadora.add(t1);
        return;
    }

    public void exibirTranportadoras(ArrayList<Transportadora>listatranportadora){
        System.out.println("----------------------------------------");
        System.out.println("Transportadora");

        for(int i = 0; i < listatranportadora.size(); i++){
            System.out.println("Nome: " + listatranportadora.get(i).getNome());
            System.out.println("CNPJ: " + listatranportadora.get(i).getCnpj());
            listatranportadora.get(i).mostrarProdutosTransportados();
            System.out.println("----------------------------------------");
        }
    }

    public ArrayList<Transportadora> alterarTransportadora(ArrayList<Transportadora>transportadoras){
        System.out.println("----------------------------");
        System.out.println("Alterar Dados Transportadora");
        System.out.println("Digite a ID: ");
        int idUsu = scanner.nextInt();
        scanner.nextLine();
        Boolean Idencontrado = false;

        for(int i = 0; i < transportadoras.size(); i++){

            if(idUsu == transportadoras.get(i).getId()){
                Idencontrado = true;
                HashMap<Fornecedor,ArrayList<Produto>>backup = new HashMap<>(transportadoras.get(i).produtosTransp);
                transportadoras.remove(i);
                cadastrarTransportadora(transportadoras);
                transportadoras.get(transportadoras.size() - 1).produtosTransp = backup;
                break;
            }
        }

        if(Idencontrado == false){

            System.out.println("Cadastro Nao encontrado !");

            return transportadoras;
        }

        System.out.println("Cadastro Atualizado com sucesso !");

        return transportadoras;

    }

    public void cadastrarProdutos(ArrayList<Produto>produtos){
        System.out.println("----------------------------");
        System.out.println("Criacao de novo produto");
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor do produto: ");
        float valor = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        int conferenciaId = conferirIdProd(produtos, id);
        
        if(conferenciaId == 0){
            System.out.println("ID ja existente !!");
            return;
        }
        

       Produto novProduto = new Produto(id, nome, valor);
       produtos.add(novProduto);
    }
    
    public void exibirProdutos(ArrayList<Produto>Prod){
        System.out.println("----------------------------------------");
        System.out.println("Produtos");

        for(int i = 0; i < Prod.size(); i++){
            System.out.println("Nome: " + Prod.get(i).getNome());
            System.out.println("Valor:  " + Prod.get(i).getValor());
            System.out.println("Id: " + Prod.get(i).getId());
            System.out.println("----------------------------------------");
        }
    }

    public ArrayList<Produto> alterarProdutos(ArrayList<Produto>prod){
        System.out.println("----------------------------");
        System.out.println("Alterar Dados Produtos");
        System.out.println("Digite a ID: ");
        int idUsu = scanner.nextInt();
        scanner.nextLine();
        Boolean Idencontrado = false;

        for(int i = 0; i < prod.size(); i++){

            if(idUsu == prod.get(i).getId()){
                Idencontrado = true;
                prod.remove(i);
                cadastrarProdutos(prod);
                break;
            }
        }

        if(Idencontrado == false){

            System.out.println("Cadastro Nao encontrado !");

            return prod;
        }

        System.out.println("Cadastro Atualizado com sucesso !");

        return prod;

    }

    public void consultarIdProd(ArrayList<Produto>prod){
        System.out.println("----------------------------------------");
        System.out.println("Consultar produto por ID");
        System.out.println("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        for(int i = 0; i < prod.size(); i++){
           
            if(id == prod.get(i).getId()){
                System.out.println("Nome: " + prod.get(i).getNome());
                System.out.println("Valor: " + prod.get(i).getValor());
                System.out.println("ID: " + prod.get(i).getId());
                return;
            }

            
        }
        System.out.println("Produto nao encontrado");
    }

    public void consultarIdUsuario(ArrayList<Usuario>log){
        System.out.println("----------------------------------------");
        System.out.println("Consultar Usuario por ID");
        System.out.println("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        for(int i = 0; i < log.size(); i++){
           
            if(id == log.get(i).getId()){
                System.out.println("Nome: " + log.get(i).getNome());
                System.out.println("CPF: " + log.get(i).getCpf());
                System.out.println("ID: " + log.get(i).getId());
                System.out.println("Nivel de acesso: " + log.get(i).nomenclaturaAcesso(log.get(i).getNivelDeAcesso()));
                return;
            }

            
        }
        System.out.println("Usuario nao encontrado");
    }

    public void consultarIdFornecedor(ArrayList<Fornecedor>forn){
        System.out.println("----------------------------------------");
        System.out.println("Consultar fornecedor por ID");
        System.out.println("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        for(int i = 0; i < forn.size(); i++){
           
            if(id == forn.get(i).getId()){
                System.out.println("Nome: " + forn.get(i).getNome());
                System.out.println("CPF: " + forn.get(i).getCpf());
                System.out.println("ID: " + forn.get(i).getId());
                System.out.println("Nivel de acesso: " + forn.get(i).nomenclaturaAcesso(forn.get(i).getNivelDeAcesso()));
                System.out.println("----------------------------------------");
                return;
            }

            
        }
        System.out.println("Fornecedor nao encontrado");
        return;
    }

    public void consultarIdTransportadora(ArrayList<Transportadora>transp){
        System.out.println("----------------------------------------");
        System.out.println("Consultar transportadora por ID");
        System.out.println("Digite o ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  

        for(int i = 0; i < transp.size(); i++){
           
            if(id == transp.get(i).getId()){
               
                System.out.println("Nome: " + transp.get(i).getNome());
                System.out.println("CNPJ: " + transp.get(i).getCnpj());
                transp.get(i).mostrarProdutosTransportados();
                System.out.println("----------------------------------------");
                return;
                }
                
            }

            System.out.println("Transportadora nao encontrado");
        }
    
        public void criarNovofornecedor(ArrayList<Fornecedor>forn){
            System.out.println("----------------------------");
            System.out.println("Criacao de novo Fornecedor");
            System.out.println("Digite o nome do Fornecedor: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o CPF: ");
            String cpf = scanner.nextLine();
            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();
            System.out.println("Digite o ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            int conferenciaId = conferirIdForn(forn, id);
            
            if(conferenciaId == 0){
                System.out.println("ID ja existente !!");
                return;
            }
            
    
            System.out.println("Digite o nivel de acesso: ");
            int nivelDeAcesso = scanner.nextInt();
            scanner.nextLine();
    
            Fornecedor fornecedornovo = new Fornecedor(nome, cpf,id,nivelDeAcesso,senha);
            forn.add(fornecedornovo);
            return;
        } 


        
        public void exibirFornecedores(ArrayList<Fornecedor>forn){
            System.out.println("----------------------------");
            System.out.println("Fornecedores: ");
            for(int i = 0; i < forn.size(); i++){
                System.out.println("Nome: " + forn.get(i).getNome());
                System.out.println("CPF: " + forn.get(i).getCpf());
                System.out.println("Id: " + forn.get(i).getId());
                System.out.println("senha: " + forn.get(i).getSenha());
                System.out.println("nivel de Acesso: " +forn.get(i).nomenclaturaAcesso(forn.get(i).getNivelDeAcesso())); 
                System.out.println("Produtos: ");
                for(int j = 0; j<forn.get(i).listaprodutos.size();j++){
                    System.out.println("Nome: " + forn.get(i).listaprodutos.get(j).getNome());
                    System.out.println("Valor:  " + forn.get(i).listaprodutos.get(j).getValor());
                    System.out.println("Id: " + forn.get(i).listaprodutos.get(j).getId());
                    System.out.println("----------------------------------------");
                }
                System.out.println("----------------------------");
            }
        }


        public void alterarFornecedor(ArrayList<Fornecedor>forn){
            System.out.println("----------------------------");
            System.out.println("Alterar Dados Fornecedores");
            System.out.println("Digite a ID: ");
            int idUsu = scanner.nextInt();
            scanner.nextLine();
            Boolean Idencontrado = false;
    
            for(int i = 0; i < forn.size(); i++){
    
                if(idUsu == forn.get(i).getId()){
                    Idencontrado = true;
                    ArrayList<Produto>backupP = new ArrayList<>();
                    backupP.addAll(forn.get(i).getListaprodutos());
                    forn.remove(i);
                    criarNovofornecedor(forn);
                    forn.get(forn.size() -1).setListaprodutos(backupP);
                    break;
                }
            }
    
            if(Idencontrado == false){
    
                System.out.println("Cadastro Nao encontrado !");
    
                return;
            }
             
    
            System.out.println("Cadastro Atualizado com sucesso !");
    
            return;
    
        }
        public void acrescentarProdutoAfornecedor(ArrayList<Produto>prod, ArrayList<Fornecedor>forn){
            System.out.println("----------------------------");
            System.out.println("Acrescentar produto a fornecedor");
            System.out.println("Digite o ID do produto: ");
            int idprod = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o ID do Fornecedor: ");
            int idForn = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < prod.size(); i++){

                if(idprod == prod.get(i).getId()){

                    Produto novo = prod.get(i);

                    for(int j = 0; j < forn.size(); j++){

                        if(idForn == forn.get(j).getId()){

                            forn.get(j).listaprodutos.add(novo);
                            System.out.println("Produto acrescentado com sucesso !");
                            return;
                        }
                    }
                }
            }
            System.out.println("Produto ou Fornecedor nao encontrado");
        } 

        public void excluiProduto(ArrayList<Produto>prod){
            System.out.println("----------------------------");
            System.out.println("Excluir Produto");
            System.out.println("Digite o ID do produto: ");
            int idprod = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < prod.size(); i++){

                if(idprod == prod.get(i).getId()){
                    prod.remove(i);
                    System.out.println("Produto removido com sucesso !");
                    return;
                }
            }

            System.out.println("Produto nao encontrado");
        }
        
        public void excluiFornecedor(ArrayList<Fornecedor>forn){
            System.out.println("----------------------------");
            System.out.println("Excluir Fornecedor");
            System.out.println("Digite o ID do Fornecedor: ");
            int idprod = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < forn.size(); i++){

                if(idprod == forn.get(i).getId()){
                    forn.remove(i);
                    System.out.println("Fornecedor removido com sucesso !");
                    return;
                }
            }

            System.out.println("Fornecedor nao encontrado");
        }

        public void excluiTransportadora(ArrayList<Transportadora>transp){
            System.out.println("----------------------------");
            System.out.println("Excluir Transportadora");
            System.out.println("Digite o ID do Transportadora: ");
            int idprod = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < transp.size(); i++){

                if(idprod == transp.get(i).getId()){
                    transp.remove(i);
                    System.out.println("Transportadora removido com sucesso !");
                    return;
                }
            }

            System.out.println("Transportadora nao encontrado");
        }

        public void excluiUsuario(ArrayList<Usuario>Usuario){
            System.out.println("----------------------------");
            System.out.println("Excluir Usuario");
            System.out.println("Digite o ID do Usuario: ");
            int idprod = scanner.nextInt();
            scanner.nextLine();

            for(int i = 0; i < Usuario.size(); i++){

                if(idprod == Usuario.get(i).getId()){
                    Usuario.remove(i);
                    System.out.println("Usuario removido com sucesso !");
                    return;
                }
            }

            System.out.println("Usuario nao encontrado");
        }

}
