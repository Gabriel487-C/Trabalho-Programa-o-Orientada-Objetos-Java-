import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarregarItens {
    
    public static <T> void salvar(ArrayList<T> lista, String arquivo){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))){

            out.writeObject(lista);
            System.out.println("Salvo!");
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> ArrayList<T> carregar(String arquivo){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))){

            return (ArrayList<T>)in.readObject();
        } catch(Exception e){
            return new ArrayList<>();
        }
    }
}
