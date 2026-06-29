import java.io.Serializable;
import java.util.ArrayList;

public class Lojaestoque implements Serializable {
    
    ArrayList<Carrinhoitem>estoqueLoja;

    public ArrayList<Carrinhoitem> getEstoqueLoja() {
        return estoqueLoja;
    }

    public void setEstoqueLoja(ArrayList<Carrinhoitem> estoqueLoja) {
        this.estoqueLoja = estoqueLoja;
    }


    public Lojaestoque(ArrayList<Produto>produtos){
        estoqueLoja = new ArrayList<>();
        for(int i = 0; i < produtos.size(); i++ ){
           estoqueLoja.add(new Carrinhoitem(produtos.get(i).getId(),produtos.get(i).getNome(),produtos.get(i).getValor(),produtos.get(i).getQuantidade()));
        }
    }

    public Boolean validaRetiradaDoItem(int qnt, int idbuscaritem){
       for(int i=0;i<estoqueLoja.size();i++){
         if(idbuscaritem == estoqueLoja.get(i).getId()){
            if(qnt <= estoqueLoja.get(i).getQuantidade()){
                return true;
            }
            else{
                return false;
            }
         }
       }
       return false;
    }

    public void deduzirQnt(int qnt, int idbuscaritem){
        for(int i=0;i<estoqueLoja.size();i++){
            if(idbuscaritem == estoqueLoja.get(i).getId()){
               int novaquantia = estoqueLoja.get(i).getQuantidade() - qnt;
               estoqueLoja.get(i).setQuantidade(novaquantia);
            }
          }
          
    }

    public void incrementarQnt(int qnt, int idbuscaritem){
         for(int i=0;i<estoqueLoja.size();i++){
            if(idbuscaritem == estoqueLoja.get(i).getId()){
               int novaquantia = estoqueLoja.get(i).getQuantidade() + qnt;
               estoqueLoja.get(i).setQuantidade(novaquantia);
            }
          }
    }
}
