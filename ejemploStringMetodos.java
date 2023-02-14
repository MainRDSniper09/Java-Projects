public class ejemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Juan";

        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.equals("Juan"));
        System.out.println(nombre.equals("juan"));
        System.out.println(nombre.equalsIgnoreCase("juan"));
        System.out.println(nombre.compareTo("Juan"));
        System.out.println(nombre.compareTo("Nicolas"));

        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(1));
        System.out.println(nombre.charAt(2));
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.substring(1));
        System.out.println(nombre.substring(1,3));
        System.out.println(nombre.substring(1, 4));

        String trabalengua = "trabalenguas";
        System.out.println(trabalengua.replace("a","."));
        System.out.println(trabalengua.indexOf('a'));
        System.out.println(trabalengua.lastIndexOf('a'));
        System.out.println(trabalengua.lastIndexOf('z'));
        System.out.println(trabalengua.contains("t"));
        System.out.println(trabalengua.startsWith("t"));
        System.out.println(trabalengua.endsWith("s"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());

    }
}
