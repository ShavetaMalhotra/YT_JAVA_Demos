package typeCasting;

public class ImplicitCasting {
    public static void main(String[] args) {
        byte b=100;
        short s =129;
        int i =9000;
        long l = 1899945;

        short sh = 100; //2 bytes
        int x = 129; // 4bytes
        long ll = 900000;

        float fl = 12.45f; //4 bytes
        double d = 12.45f; //8 bytes

        char ch = 'a'; //ASCII
        int y = 'a';

        System.out.println(y);

        float flt = 100; //100.0
        System.out.print(flt);

    }
}
