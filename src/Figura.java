public abstract class Figura {
    protected String color;
    protected double radio;
    protected double alto;
    protected double largo;
    protected abstract double calcularArea();
    protected abstract double calcularPerimetro();
    protected Figura(){}
    protected Figura(String color,double radio,double alto,double largo){
        this.color=color;
        this.alto=alto;
        this.largo=largo;
        this.radio=radio;
    }
    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", radio=" + radio +
                ", alto=" + alto +
                ", largo=" + largo + ", area="+calcularArea()+" ,perimetro="+calcularPerimetro()+
                '}';
    }
}
