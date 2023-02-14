public class SentenciaSwitchCase {
    public static void main(String[] args) {

        byte num = 3;

        switch (num){
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;
            case 2:
                System.out.println("El num es dos");
                break;
            case 3:
                System.out.println("El num es tres");
                break;
            default:
                System.out.println("Numero desconocido");
        }

        String nombre = "nicolas";

        switch (nombre){
            case "admin":
                System.out.println("Hola, bienvenido admin! ");
                break;
            case "nicolas":
                System.out.println("Hola nicolas!");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
