package guru.qa;


public class FirstApp {
    public static void main(String[] args) {
        char a = 'a';
        byte aByte = 5;
        short aShort = 10;
        int aInt = 19;
        long aLong = 12000;
        float aFloat = 5.111F;
        double aDouble = 67.235D;
        String name = "Anuar";

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(aByte + aInt);
        System.out.println(aInt - aByte);
        System.out.println(aInt * aByte);
        System.out.println(aInt / aByte);
        System.out.println(aInt % aByte);

        if (aShort > aInt) {
            System.out.println(aShort + " > " + aInt);
        }else if (aShort < aInt) {
            System.out.println(aShort + " < " + aInt);
        }else if (aShort != aInt) {
            System.out.println(aShort + " not equal " + aInt);
        }else {
            System.out.println(aShort + " = " + aInt);
        }

        int b = max + 5000;
        int c = min - 5000;
        System.out.println(b);
        System.out.println(c);

    }
}
