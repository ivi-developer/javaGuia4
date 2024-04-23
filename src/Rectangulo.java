public class Rectangulo extends Figura{
    public Rectangulo(){super();}
    public Rectangulo(String color,double alto, double largo){super(color, 0, alto, largo);}
    @Override
    public double calcularArea(){return alto*largo;}
    @Override
    public double calcularPerimetro(){return 2*(alto+largo);}
    @Override
    public String toString(){return super.toString();}
}
