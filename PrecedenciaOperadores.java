public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double Promedio = (i + j + k)/3d;

        System.out.println("Promedio = " + Promedio);

        Promedio = (i + j + k) /3d * 10;

        System.out.println("Promedio = " + Promedio);

        Promedio = ++i + j-- + k /3d * 10;

        System.out.println("Promedio = " + Promedio);
    }
}
