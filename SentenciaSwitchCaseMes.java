public class SentenciaSwitchCaseMes {
    public static void main(String[] args) {

        int mes = 12;
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default: nombreMes = "Indefinido";
        }

        System.out.println("nombreMes = " + nombreMes);

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
