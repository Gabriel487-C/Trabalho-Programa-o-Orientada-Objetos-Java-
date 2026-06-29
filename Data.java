import java.io.Serializable;

public class Data implements Serializable {
    int dia;
    int mes;
    int ano;
   
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public Data(int dia, int mes, int ano) {
       
        if(dia < 1 || dia > 31){
            throw new IllegalArgumentException ("Dia Invalido!!");
        }

        if(mes < 1 || mes > 12){
            throw new IllegalArgumentException("Mes Invalido!!");
        }

        if(ano < 2020 || ano > 2026){
            throw new IllegalArgumentException("Ano Invalido!!");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
   
    


    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + ano;
    }

    
}
