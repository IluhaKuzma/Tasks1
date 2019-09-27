package first;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeOrCompound {

    public static void main(String[] args) {

        controlAndPrint( scan() );
    }

    public static Integer scan () {

        System.out.println("ВВЕДИТЕ ЧИСЛО: ");
        Scanner reader = new Scanner(System.in);
        Integer i = 0;

        try {
            i = reader.nextInt();
            reader.close();
        } catch (Exception e) {
            System.err.println("ОШИБКА ВВОДА!!!");
            System.exit(1);
        }
        return i;
    }

    public static void controlAndPrint (Integer i) {

        if (i <= 1) {
            System.out.println(i + " НЕ ЯВЛЯЕТСЯ ПРОСТЫМ ИЛИ СОСТАВНЫМ");
            System.exit(1);
        }

        System.out.print( (i%2 == 0) ? i + " ЧЕТНОЕ" : i + " НЕЧЕТНОЕ" );

        BigInteger big = BigInteger.valueOf(i);
        boolean isPrime = big.isProbablePrime(100);
        System.out.println( (isPrime) ? " И ПРОСТОЕ" : " И СОСТАВНОЕ");
    }

}