
package calendario;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    
    public Fecha(){
        dia = 01;
        mes = 01;
        ano = 1900;
    }
    
    public Fecha(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void bisiesto(){
    
    }
    
    public int diaMes(){
    
    }
    
    private void valida(){
    
    }
    
    public void corta(){
    
    }
    
    public int diasTranscurridos(){
    
    }
    
    public int diaSemana(){
    
    }
    
    public void larga(){
    
    }
    
    public void fechaTras(long dias){
    
    }
    
    public void siguiente(){
    
    }
    
    public void anterior(){
    
    }
    
    public String toString(){
    
    }
}
