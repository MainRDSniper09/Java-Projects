public class ejemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String estudiante = "Juan Nicolas Barreto";

        String detalle = curso + " con el estudiante " + estudiante;
        System.out.println(detalle);

        int numeroA = 10, numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con ").concat(estudiante);
        System.out.println(detalle2);
    }
}
