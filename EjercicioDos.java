import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int x = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int y = scanner.nextInt();

        if(x > y ){
            System.out.println("El numero " +x+ " Es mayor");
        }else System.out.println("El numero "+y+ " Es mayor");
    }
}
