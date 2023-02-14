import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la cantida de gasolina");
        double Gas = scanner.nextDouble();
        if (Gas == 70){
            System.out.println("Estanque lleno");
        } else if (Gas >= 60 && Gas <= 70) {
            System.out.println("Estanque casi lleno");
        } else if (Gas >= 40 && Gas <= 60){
            System.out.println("Estanque a 3/4");
        } else if (Gas >= 35 && Gas <= 40){
            System.out.println("Medio tanque");
        } else if (Gas >= 20 && Gas <= 35){
            System.out.println("Suficiente");
        } else if (Gas >= 1 && Gas <= 20){
            System.out.println("Insuficiente");
        }

    }
}
