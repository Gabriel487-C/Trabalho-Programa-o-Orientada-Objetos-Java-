

public class Carrinhoitem extends Produto {
   

    public Carrinhoitem(int id, String nome, float valor, int quantidade){
        super(id, nome, valor, quantidade);
    }

   
    @Override
    public void exibirInfoProd(){
        System.out.println("------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("id: " + id);
        System.out.println("Quantidade: " + quantidade);

        
        if(quantidade < 1){
            System.out.println("Item Esgotado");
       }
    }

    public float valorTotal(){
        return quantidade * valor;
    }
}
