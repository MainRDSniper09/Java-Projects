import java.util.Scanner;

public class PrimerEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura: ");

        String nombre = sc.nextLine();
        System.out.println("Ingrese el primer precio del producto: ");

        double primerPrecio = sc.nextDouble();
        System.out.println("Ingrese el segundo precio del producto: ");

        double segundoPrecio = sc.nextDouble();

        double sum = primerPrecio + segundoPrecio;

        double op = sum * 0.19;

        double total = op + sum;

        String detalle = "La suma total de los dos productos " + nombre +  " es "  + sum +  " y aplicando el impuesto seria un total de " + op +  " El resultado final seria es: " + total ;

        System.out.println(detalle);
    }
}