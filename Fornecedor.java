import java.util.ArrayList;


public class Fornecedor extends Usuario{
    
    ArrayList<Produto>listaprodutos = new ArrayList<>();
   

    public Fornecedor (String nome, String cpf, int id, int nivelDeAcesso, String senha){
        super(nome, cpf, id, nivelDeAcesso, senha);
    }

    public ArrayList<Produto> getListaprodutos() {
        return listaprodutos;
    }

    public void setListaprodutos(ArrayList<Produto> listaprodutos) {
        this.listaprodutos = listaprodutos;
    }

    
    public void acrescentarProdutoALista(Produto prod){
        listaprodutos.add(prod);
    }

    public void acrescentarProdutoALista(ArrayList<Produto> prod){
        listaprodutos.addAll(prod);
    }

   @Override
   public void exibirInfo(){
    
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Id: " + id);
        System.out.println("senha: " + senha);
        System.out.println("nivel de Acesso: " + nomenclaturaAcesso(nivelDeAcesso)); 
        System.out.println("----------------------------");
        System.out.println("Produtos: ");
        for(int i= 0; i < listaprodutos.size();i++){
            listaprodutos.get(i).exibirInfoProd();
        }
   }
}
