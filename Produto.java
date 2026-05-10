public class Produto {
    int id;
    String nome;
    float valor;
    
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

   
    public Produto(int id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    
    public void exibirInfoProd(){
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
        System.out.println("id: " + id);
    }
    
}
