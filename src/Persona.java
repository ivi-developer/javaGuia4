public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String gmail;
    private String direccion;

    public Persona() {

    }

    public Persona(String dni, String nombre, String apellido, String gmail, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.gmail = gmail;
        this.direccion = direccion;
    }
    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", gmail='" + gmail + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
