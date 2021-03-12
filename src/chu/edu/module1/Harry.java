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
        text = text.replaceAll("[^A-Za-z ']", ""); // delete garbage
        String[] words = text.split(" +");

        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        String[] distincts = stringOfDistincts.split(" ");
        Arrays.sort(distincts); //sorting in alphabetical order
        System.out.println("Number of unique words : " + distincts.length);
        System.out.println("Unique words in alphabetical order :");
        for (int i = 0; i < 100; i++) {

            System.out.println(distincts[i]);
           // FIRST 100 WORDS
            /*
            'Alohomora
            'Atta
            'Cause
            'Course
            'Dumbledore
            'Harry's
            'Jordan
            'Mr
            'NMat
            'Oh
            'Pig
            'Quidditch'
            'Scuse
            'Snot
            'Up'
            'Yes
            'You
            'YouKnowWho'
            'cause
            'cept
            'f'
            'gar'
            'hocus
            'm'
            'please'
            's'
            'smatter
            'there's
            'til
            'to
            'undred
            'wand
            AAAAAAAAAARGH
            ALBUS
            ALL
            ALLEY
            ALLOWED
            AM
            AND
            ANYTHING
            AT
            Aaah
            Aargh
            Abbott
            Abou'
            About
            Absolutely
            According
            Adalbert
            Add
            Adrian
            Africa
            African
            After
            Against
            Ages
            Agrippa
            Ah
            Aha
            Ahead
            Ahem
            Ahern
            Alas
            Alberic
            Albus
            Algie
            Alicia
            All
            Alley
            Although
            Always
            Am
            An'
            And
            Angelina
            Another
            AntiCheating
            AntiDark
            Anyone
            Anythin'
            Anything
            Anyway
            Apothecary
            Are
            Aren't
            Argus
            Around
            Arsenius
            Arts
            As
            Asked
            Astronomy
            At
            Ate
            August
            Aunt
            Auntie
            BC
            BED
            BEHIND
             */

        }
    }
}

