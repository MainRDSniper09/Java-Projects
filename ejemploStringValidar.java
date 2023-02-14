public class ejemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println(esNulo);

        if (esNulo) {
            curso = " ";//"Programacion java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println(esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println(esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println(esBlanco);

        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }
}
