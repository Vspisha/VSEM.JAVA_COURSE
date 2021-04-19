package chu.edu.TEST;

import java.util.Arrays;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Duplicates
 * @since 19.04.2021 - 17.59
 **/
public class Duplicates {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result=true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}

