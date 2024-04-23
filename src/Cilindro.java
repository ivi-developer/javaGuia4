public class Cilindro extends Circulo {
    public Cilindro(){super();}
    public Cilindro(String color,double radio,double alto){
        super(color,radio);
        this.alto=alto;
    }
    public double getAltura(){return alto;}
    public double calcularVolumen(){
        return Math.PI*Math.pow(getRadio(),2)*getAltura();
    }
    @Override
    public double calcularArea(){
        return Math.PI*2*getRadio()*getAltura()+2*super.calcularArea();
    }
    @Override
    public String toString(){
        return super.toString() + "Cilindro{" +
                " ,volumen=" + calcularVolumen()+
                '}';
    }
}
