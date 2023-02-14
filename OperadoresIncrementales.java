public class OperadoresIncrementales {
    public static void main(String[] args) {
        //Pre incremento
        int i = 1, j = ++i; // i = i + 1

        System.out.println(j);
        System.out.println(i);

        //Post incremento
        i = 2;
        j = i++;
        System.out.println(j);
        System.out.println(i);

        //Pre decremento
        i = 3;
        j = --i; // i = i -1 = 2
        System.out.println(i);
        System.out.println(j);

        //Post decremento
        i = 4;
        j = i--;
        System.out.println(i);
        System.out.println(j);

        System.out.println(++j);
        System.out.println(j++);
        System.out.println(j);
    }
}
