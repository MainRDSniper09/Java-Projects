import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si es verdadero: si es falso;
        String variable = 7 == 7 ? "si es verdadero" : "si es falso" ;
        System.out.println(variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencia = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas: ");
        matematicas = sc.nextDouble();

        System.out.println("Ingrese la nota de ciencia: ");
        ciencia = sc.nextDouble();

        System.out.println("Ingrese la nota de historia: ");
        historia = sc.nextDouble();

        promedio = (matematicas + ciencia + historia)/3;
        System.out.println(promedio);

        estado = promedio >= 5.49 ? "aprobado" : "rechazado" ;

        System.out.println(estado);

        /*if (promedio >= 5.49){
            estado = "aprobado";
        }else {
            estado = "rechazado";
        }*/

    }
}
