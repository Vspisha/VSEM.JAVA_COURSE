package chu.edu.TEST;

import java.util.Arrays;
import java.util.List;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class CommonPrefix
 * @since 19.04.2021 - 18.00
 **/
public class CommonPrefix {


        public static String prefix(String[] array) {
            // your code is here
            if (array.length == 0) return "";
            String prefix = array[0];
            for (int i = 1; i < array.length; i++) {
                while (array[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.equals("")) return "";
                }
            }
            return prefix;
        }

        public static void main(String[] args) {
            String[] array = {"abc", "abcd", "abfce", "abcac"} ;

            System.out.println(prefix(array));  // ab

            String[] array2 = {"abc", "abcd", "abce", "abcac"} ;

            System.out.println(prefix(array2)); // abc

        }
    }

