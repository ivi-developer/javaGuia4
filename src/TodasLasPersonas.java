import java.util.ArrayList;

public class TodasLasPersonas {
    private ArrayList<Persona> personas;
    public TodasLasPersonas(){
        personas=new ArrayList<>();
    }
    public void agregar(Persona persona){
        personas.add(persona);
    }

    public Persona devolverPersona(Persona persona){
        Persona aux = new Persona();
        for(int i=0;i< personas.size();i++){
            if(persona.getDni() == personas.get(i).getDni()) {
                aux = personas.get(i);
            }
        }
        return aux;
    }
    public double ganancias(){
        double ganancia=0;
        for(int i=0;i< personas.size();i++){
            if(personas.get(i)instanceof Estudiante){
                ganancia+= ((Estudiante) personas.get(i)).getCuotaMensual();
            }
        }
        return ganancia;
    }
    public String mostrarPersonas(){
        StringBuilder sb =new StringBuilder();
        for(int i=0;i< personas.size();i++){
            sb.append(personas.get(i).toString()+"\n");
        }
        return sb.toString();
    }


}
