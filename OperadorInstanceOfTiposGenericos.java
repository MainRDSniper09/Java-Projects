public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String .... que tal!";

        Number num = 7;

        double decimal = 45.45;

        boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;

        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;

        System.out.println("texto es del tipo integer = " + b1);

        b1 = num instanceof Integer;

        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;

        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;

        System.out.println("num es del tipo Object = " + b1);
        
        /*b1 = decimal instanceof Number; //en teoria es true, pero no se porque no sirve

        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean; // este tambien es true pero no se porque no sirve

        System.out.println("b1 es del tipo Boolean = " + b1);
         */

    }
}
