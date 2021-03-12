package chu.edu.module1;
/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Harry
 * @since 12.03.2021 - 16.12
 **/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {
    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("D:\\SLOVAC\\Java course\\harry.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");
        String[] words = text.split(" +");
        for (int i = 0; i < 100; i++) {
        }

        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 12) {
                counter++;
            }
        }

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        String[] distincts = stringOfDistincts.split(" ");
        Arrays.sort(distincts);
        System.out.println("Number of unique words : " + distincts.length);
        System.out.println("Unique words in alphabetical order :");
        for (int i = 0; i < 100; i++) {

            System.out.println(distincts[i]);

        }
    }
}

