import java.util.ArrayList;

public class Pedido extends Produto{
    
     Data data;
     ArrayList<Carrinhoitem>carrinho;

    public Pedido(String nome, int id, int quantidade, float valor,  Data data,  ArrayList<Carrinhoitem>carrinho ){
        super(id, nome, valor, quantidade );
        this.data = data;
        this.carrinho = new ArrayList<>(carrinho);
    }

    public void exibirRelatorio(){
        float valortotal = 0;
        System.out.println("Relatorio de compra, Data: " + data.toString());
        System.out.println("Mercadoria:");
        for(int i=0;i<carrinho.size();i++){
            System.out.println("-----------------");
            carrinho.get(i).exibirInfoProd();
            System.out.println("Valor total por item: " + carrinho.get(i).valorTotal());
            valortotal = valortotal + carrinho.get(i).valorTotal();
        }
        System.out.println("Valor total da compra: " + valortotal);
    }
    
}
