public class Circulo extends Figura {
    public Circulo(){super();}
    public Circulo(String color,double radio){super(color, radio, 0, 0);}
    @Override
    public double calcularArea(){return Math.pow(radio,2)*Math.PI;}//
    @Override
    public double calcularPerimetro(){return Math.PI*2*radio;}
    public double getRadio(){return radio;}
    @Override
    public String toString(){return super.toString();}
}
