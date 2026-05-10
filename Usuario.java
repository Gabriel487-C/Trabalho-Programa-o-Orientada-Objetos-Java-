

public class Usuario{
    String nome;
    String cpf;
    String senha;
    int id;
    int nivelDeAcesso;


    public String getNome() {
        return nome;
    }
   
   
    public void setNome(String nome) {
        this.nome = nome;
    }
   
   
    public String getCpf() {
        return cpf;
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


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String nomenclaturaAcesso(int nivelDeAcesso){

        switch (nivelDeAcesso) {
            
            case 1:
                return "Funcionario";
            
            case 2:
                return "Gerente";
            
            case 3:
                return "Master";    
        }

        return "Sem acesso";
         
    }

    public void exibirInfo(){
    
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Id: " + id);
        System.out.println("senha: " + senha);
        System.out.println("nivel de Acesso: " + nomenclaturaAcesso(nivelDeAcesso)); 
        System.out.println("----------------------------");
     
   }
    
}