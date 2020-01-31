package figuras;
public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;
    public Triangulo(){
        p1 = new Punto(0,0);
        p2 = new Punto(1,1);
        p3 = new Punto(2,2);
    }
    public Triangulo(Punto p1, Punto p2, Punto p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public Punto getP1(){
        return p1;
    }
    public Punto getP2(){
        return p2;
    }
    public Punto getP3(){
        return p3;
    }
    public void setP1(Punto p1){
        this.p1 = p1;
    }
    public void setP2(Punto p2){
        this.p2 = p2;
    }
    public void setP3(Punto p3){
        this.p2 = p2;
    }
    public double calcularPerimetro(){
        return p1.distancia(p2)+p2.distancia(p3)+p3.distancia(p1);
    }
    public double calcularArea(){
        Recta r1 = new Recta(p1,p2);
        return ((p1.distancia(p2)*r1.distancia(p3))/2);
    }
}
