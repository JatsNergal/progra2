
package calendario;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
        dia = 01;
        mes = 01;
        anio = 1900;
    }
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAnio(int ano){
        this.anio = anio;
    }
    
    public void bisiesto(){
        if((anio%4)==0){
            System.out.println("El año:" + anio + "es bisiesto"); 
	}else{
            System.out.println("El año:" + anio + "no es bisiesto"); 
	}
    }
    
    public int diaMes(){
        return 0;
    }
    
    private void valida(){
    
    }
    
    public void corta(){
        System.out.println(dia + "-" + mes + "-"+anio); 
    }
    
    public int diasTranscurridos(){
        return 0;
    }
    
    public int diaSemana(){
        return 0;
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
     return "";
    }
}
