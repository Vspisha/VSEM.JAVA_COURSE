package chu.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

import static jdk.nashorn.internal.objects.NativeMath.max;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Laboratory1
 * @since 15.03.2021 - 17.59
 **/
public class Laboratory1 {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("D:\\SLOVAC\\Java course\\harry.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");
        String[] words = text.split(" +");

        // 1 Задание
        String longestWord = "";
        for (String s1 : words) {
            if (s1.length() > longestWord.length()) {
                longestWord = s1;
            }
        }

        //2 Задание
        String Lines = new String(Files.readAllBytes(Paths.get("D:\\SLOVAC\\Java course\\harry.txt")));
        String[] myLines = Lines.split("\\n");
        Lines = Lines.replaceAll("[^A-Za-z ']", "");
        int counter = 0;
        for (int i = 0; i < myLines.length; i++) {
            if (myLines[i].contains("Harry")) {
                counter++;
            }

        }

        // 3 Задание
        String stringOfDistincts = "";
        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");
        for (int i = 0; i < 6000; i++) {
            // System.out.println(distincts[i]);
        }

        // 4 Задание
        int counterC = 0;
        for (int i = 0; i < distincts.length; i++) {
            if (distincts[i].startsWith("C") || distincts[i].startsWith("C")) {
                counterC++;
            }
        }

        //5 Задание.
        int[] hash = new int[distincts.length];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = distincts[i].hashCode();
        //System.out.println(distincts[i].hashCode());

        }
        // 6. Count the intersections of hashes.
        Arrays.sort(hash);
        int counterHashes = 0;
        for (int i = 0; i < hash.length - 1; i++) {
            if (hash[i] == hash[i+1]) {
                counterHashes++;
            }
        }

        System.out.println("The longest word is: " + longestWord); //The longest word is: interestinglooking
        System.out.println("Lines with the word Harry  " + counter);//Lines with the word Harry  1326
         System.out.println("Number of distinct words: " + distincts.length); //6000 distincts words
         System.out.println("Number of distinct words begin from the letter C: " + counterC);
         System.out.println("Number of Hash matches : " + counterHashes); // Number of Hash matches : 0
         // Number of distinct words begin from the letter C: 80

    }
}
