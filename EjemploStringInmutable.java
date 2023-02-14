public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String estudiante = "Juan Nicolas Barreto";

        String resultado = curso.concat(estudiante);
        System.out.println(curso);
        System.out.println(resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
        return c + " con " + estudiante;
        });

        System.out.println(resultado2);
        System.out.println(curso);
        String resultado3 = resultado.replace("a","A");
        System.out.println(resultado);
        System.out.println(resultado3);


    }
}