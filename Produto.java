import java.io.Serializable;

public class Produto implements Serializable {
    int id;
    String nome;
    float valor;
    int quantidade;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getValor() {
        return valor;
    }
   
    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
   
    public Produto(int id, String nome, float valor, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    
    public void exibirInfoProd(){
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("id: " + id);
        System.out.println("Quantidade: " + quantidade);

        if(quantidade < 1){
             System.out.println("Item Esgotado");
        }
    }

    public void decrementarQnt(int quantiaASubtrair){
       
        if(quantidade - quantiaASubtrair < 0){
            System.out.println("Quantidade insuficiente!!");
            return;
        }
        else{
        
        setQuantidade(quantidade - quantiaASubtrair);
        }
    }

    public void acrescentarQnt(int quantiaAdd){
        setQuantidade(quantiaAdd + quantidade);
    }




    
}
