import java.util.SplittableRandom;
public class Cuadrado extends Figura{
    public Cuadrado(){super();}
    public Cuadrado(String color,double alto){super(color,0,alto,0);}
    @Override
    public double calcularPerimetro(){return alto*4;}
    @Override
    public double calcularArea(){return Math.pow(alto,2);}
    @Override
    public String toString() {
        return super.toString();
    }
}
