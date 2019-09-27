package fifth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Palindromes {

    public static void main(String[] args) {

        printPalindromes(scan());

    }
    public static int scan () {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВЕДИТЕ ПРЕДЕЛ ПОСЛЕДОВАТЕЛЬНОСТИ ЧИСЕЛ:");

        int lim = 0;
        try {
            lim = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.err.println("ОШИБКА ВВОДА!!!");
            System.exit(1);
        }
        return lim;

    }

    public static void printPalindromes (int lim) {

        ArrayList<Integer> list = new ArrayList();

        for (double i = 0; i < lim; i++) {
            if ( ((i/11)%1 == 0) && (i != 0))
                list.add( (int)i );
        }
        for (int i2: list)
            System.out.print(i2 + "; ");
    }
}