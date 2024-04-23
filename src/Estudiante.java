public class Estudiante extends Persona {
    private int añoIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String gmail, String direccion, int añoIngreso,
                      double cuotaMensual, String carrera) {
        super(dni,nombre,apellido,gmail,direccion);
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }
    public double getCuotaMensual(){return cuotaMensual;}
    @Override
    public String toString() {
        return super.toString() + "Estudiante{" +
                "añoIngreso=" + añoIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
