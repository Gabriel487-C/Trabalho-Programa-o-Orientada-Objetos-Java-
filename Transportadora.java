import java.util.ArrayList;
import java.util.HashMap;

public class Transportadora {
    String nome;
    String cnpj;
    int id;
    HashMap<Fornecedor, ArrayList<Produto>> produtosTransp = new HashMap<>();
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }
   
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
   
    public Transportadora(String nome, String cnpj, int id) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.id = id;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Transportadora(int id, String nome, String cnpj, HashMap<Fornecedor, ArrayList<Produto>> produtosTransp) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtosTransp = produtosTransp;
    }

    public void acrescentarRota(Fornecedor forn, int idProduto){

        for(int i = 0; i < forn.listaprodutos.size(); i++){
            
            Produto p = forn.getListaprodutos().get(i);

            if(idProduto == p.getId()){
                
                produtosTransp.putIfAbsent(forn, new ArrayList<Produto>());

                produtosTransp.get(forn).add(p);
                return;
            }
        }

        System.out.println("Nao foi possivel achar o produto por ID");
        return;
    }
   
    public void mostrarProdutosTransportados(){

        for(HashMap.Entry<Fornecedor, ArrayList<Produto>> item : produtosTransp.entrySet()){
    
            Fornecedor fornecedor = item.getKey();
    
            ArrayList<Produto> produtos = item.getValue();
    
            System.out.println("--------------------------------");
            System.out.println("Fornecedor: " + fornecedor.getNome());
    
            for(Produto p : produtos){
    
                System.out.println( "ID: " + p.getId() + " Nome: " + p.getNome());
                    
            }
        }
    }
    
    
   

}
