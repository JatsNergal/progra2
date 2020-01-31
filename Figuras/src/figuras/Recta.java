package figuras;

public class Recta {
    private Punto p1;
    private Punto p2;
    
    public Recta(){
        p1 = new Punto(0,0);
        p2 = new Punto(1,1);
    }
    public Recta(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Punto getP1(){
        return p1;
    }
    public Punto getP2(){
        return p2;
    }
    public void setP1(Punto p1){
        this.p1 = p1;
    }
    public void setP2(Punto p2){
        this.p2 = p2;
    }
    public double pendiente(){
        return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
    }
    private double ordenadaOrigen(){
       double m = pendiente();
       return (-1*m*p1.getX()+p1.getY());
    }
    public double distancia(Punto p){
        double m = pendiente(); 
        double b = ordenadaOrigen();
        return Math.abs((m*p.getX()-1*p.getY()+b)/Math.sqrt(Math.pow(m,2)+1));
    }
    public String toString(){
        double m = pendiente();
        return "Y= "+m+"X+ "+ordenadaOrigen();
    }
}
