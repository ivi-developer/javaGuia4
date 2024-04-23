import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        do {
            System.out.printf("Ingrese ejercicio\n");
            switch(tec.nextInt()){
                case 1:
                    punto1();
                case 2:
                    punto2();
                break;
                case 3:
                    punto3();
                    break;
            }
            System.out.printf("n para cortar\n");
        }while(tec.next().charAt(0)!='n');
    }
    public static void punto1(){
        Cilindro cilindro=new Cilindro("cyan",5.7,8);
        System.out.printf(cilindro.toString());
    }
    public static void punto2() {
        Estudiante pablo = new Estudiante("43246008","Pablo","Walter","pewq@gmail.com",
                "Bayley 2254",2020,10000,"Programación");
        Estudiante ivan = new Estudiante("43246009","Ivan","Ialonardi","iaig@gmail.com",
                "Bayley 2254",2022,10000,"Programación");
        Estudiante lau = new Estudiante("43246010","Lautaro","Roldán","lnra@gmail.com",
                "Bayley 2254",2019,10000,"Programación");
        Estudiante nacho = new Estudiante("43246011","Ignacio","Luengo","ijl@gmail.com",
                "Bayley 2254",2019,10000,"Programación");

        Staff staff1=new Staff("12345678","staff1","staff2","staff1@mail.com",
                "call1",100000,"maniana");
        Staff staff2=new Staff("12345678","staff2","staff2","staff1@mail.com",
                "call1",100000,"maniana");
        Staff staff3=new Staff("12345678","staff3","staff2","staff1@mail.com",
                "call1",100000,"maniana");
        Staff staff4=new Staff("12345678","staff4","staff2","staff1@mail.com",
                "call1",100000,"maniana");
        TodasLasPersonas personas = new TodasLasPersonas();
        personas.agregar(pablo);
        personas.agregar(lau);
        personas.agregar(ivan);
        personas.agregar(nacho);
        personas.agregar(staff1);
        personas.agregar(staff2);
        personas.agregar(staff3);
        personas.agregar(staff4);
        System.out.println(personas.mostrarPersonas());
        System.out.println("Las ganancias mensuales persividad por cuota estudiantil: "+personas.ganancias());

    }
    public static void punto3(){
        Cuadrado cuadrado=new Cuadrado("amarillo", 10);
        System.out.println(cuadrado.toString());
        Circulo circulo=new Circulo("verde", 5);
        System.out.println(circulo.toString());
        Rectangulo rectangulo=new Rectangulo("rojo",5,10);
        System.out.println(rectangulo.toString());
    }
}