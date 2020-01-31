package figuras;

public class Punto {
    private double x;
    private double y;
    
    public Punto(){
        x=y=1;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;     
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public Punto puntoMedio(Punto p){
        double xm,ym;
        xm = (x + p.getX()/2);
        ym = (y + p.getY()/2);
        return new Punto (xm, ym);
    }
     public double distancia(Punto p){
        return Math.sqrt(Math.pow((p.getX()-x),2)+Math.pow((p.getY()-y),2));       
    }
     
}
