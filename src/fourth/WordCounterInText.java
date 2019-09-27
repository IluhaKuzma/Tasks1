package fourth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounterInText {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String word = null;
        String sentence = null;
        ArrayList<String> list = new ArrayList<String>();
        StringTokenizer tokenizer;

        try {
            System.out.println("ВВЕДИТЕ СЛОВО:");
            word = reader.nextLine().toUpperCase();
            System.out.println("ВВЕДИТЕ ТЕКСТ:");

            do {
                sentence = reader.nextLine();
                tokenizer = new StringTokenizer(sentence, " \t\n\r.,\\/;:");

                while (tokenizer.hasMoreTokens()) {
                    sentence = tokenizer.nextToken();
                    list.add(sentence.toUpperCase());
                }
            }
            while ( ! (sentence.equalsIgnoreCase("q")) );

        } catch (Exception e) {
            System.err.println("ОШИБКА ВВОДА!!!");
        }

        System.out.println("ЧАСТОТА УПОТРЕБЛЕНИЯ СЛОВА: " + Collections.frequency(list, word));

    }
}
