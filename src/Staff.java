public class Staff extends Persona {
    private double salario;
    private String turno;

    public Staff(String dni, String nombre, String apellido, String gmail, String direccion,
                 double salario, String turno) {
        super(dni,nombre,apellido,gmail,direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double salarioAnual() {
        return (salario*12);
    }

    @Override
    public String toString() {
        return super.toString() + "Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
