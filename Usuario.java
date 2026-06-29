import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    String nome;
    String cpf;
    String senha;
    int id;
    int nivelDeAcesso;
    ArrayList<Carrinhoitem> carrinho = new ArrayList<>();
    ArrayList<Pedido> pedido = new ArrayList<>();
    ArrayList<Pedido> pedidoPendente = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Pedido> getPedidoPendente() {
        return pedidoPendente;
    }

    public void setPedidoPendente(ArrayList<Pedido> pedidoPendente) {
        this.pedidoPendente = pedidoPendente;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {

        this.nivelDeAcesso = nivelDeAcesso;
    }

    public Usuario(String nome, String cpf, int id, int nivelDeAcesso, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.nivelDeAcesso = nivelDeAcesso;
        this.senha = senha;
    }

    public Usuario(String nome, String cpf, int id, int nivelDeAcesso, String senha, ArrayList<Carrinhoitem> carrinho,
            ArrayList<Pedido> pedido) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.nivelDeAcesso = nivelDeAcesso;
        this.senha = senha;
        this.carrinho = carrinho;
        this.pedido = pedido;
    }

    public ArrayList<Carrinhoitem> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Carrinhoitem> carrinho) {
        this.carrinho = carrinho;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String nomenclaturaAcesso(int nivelDeAcesso) {

        switch (nivelDeAcesso) {

            case 1:
                return "Funcionario";

            case 2:
                return "Gerente";

            case 3:
                return "Master";

            case 4:
                return "Cliente";
        }

        return "Sem acesso";

    }

    public void exibirInfo() {

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Id: " + id);
        System.out.println("senha: " + senha);
        System.out.println("nivel de Acesso: " + nomenclaturaAcesso(nivelDeAcesso));
        System.out.println("----------------------------");

    }

    public void exibirCarrinho(){
        System.out.println("----------------------------");
        System.out.println("Carrinho: ");
        
        for(int i = 0; i < carrinho.size(); i++){
            carrinho.get(i).exibirInfoProd();
        }
    }

    public float valorTotalcarrinho(){
        System.out.println("----------------------------");
        float valortotalcompra = 0; 
           for(int i = 0; i < carrinho.size(); i++){
            valortotalcompra += carrinho.get(i).valorTotal();
        }
        return valortotalcompra;
    }

    public void exibirHistorico(){
        System.out.println("----------------------------");
        System.out.println("Pedidos: ");
        
        for(int i = 0; i < pedido.size(); i++){
            pedido.get(i).exibirRelatorio();
        }
    }

}