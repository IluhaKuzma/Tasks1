package second;

import java.math.BigInteger;
import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {

        System.out.println("ВВЕДИТЕ ДВА ЧИСЛА:");

        BigInteger num1 = scan();
        BigInteger num2 = scan();

        BigInteger gcd = findGCD(num1, num2);
        BigInteger lcm = findLCM(num1, num2, gcd);

        System.out.println("НАИБОЛЬШИЙ ОБЩИЙ ДЕЛИТЕЛЬ: " + gcd);
        System.out.println("НАИМЕНЬШЕЕ ОБЩЕЕ КРАТНОЕ: " + lcm);

    }

    public static BigInteger scan () {

        Scanner reader = new Scanner(System.in);

        Integer num = null;
        BigInteger bi = null;

        try {
            num = reader.nextInt();

        bi = BigInteger.valueOf(num);

        } catch (Exception e) {
            System.err.println("ОШИБКА ВВОДА!!!");
        }
        return bi;

    }

    public static BigInteger findGCD (BigInteger i1, BigInteger i2) {

        BigInteger gcd1 = i1.gcd(i2);

        return gcd1;
    }

    public static BigInteger findLCM (BigInteger i1, BigInteger i2, BigInteger gcd) {

        return (i1.multiply(i2)).divide(gcd);
    }
}