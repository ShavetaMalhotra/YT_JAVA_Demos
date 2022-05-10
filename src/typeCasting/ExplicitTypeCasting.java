package typeCasting;

class ExplicitTypeCasting {
    public static void main(String[] args) {
        //Integer types
        long l = 987454535l; //8 bytes
        int i = (int)2147483648L;//4 bytes - 2147483647
        System.out.println(i);

        short s = (short)2147483647; //2 bytes
        System.out.println(s);

        byte b = (byte)32000;


        //Decimal Values
        double d = 12.45; //8 bytes
        float fl = (float)12.45; //4  bytes
        System.out.println(fl);

    }
}
