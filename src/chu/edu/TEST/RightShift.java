package chu.edu.TEST;


import java.util.Arrays;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class RightShift
 * @since 19.04.2021 - 17.59
 **/
public class RightShift {
        public static int[] rightShift(int[] array, int step){
            int[] Array = new int[array.length];
            int Index = 0;
            int Step = 0;
            if (step >= array.length){
                Step = step % array.length;
            } else {
                Step = step;
            }

            for (int i = 0; i < array.length; i++) {
                Index = i+Step;
                if (i+Step >= array.length){
                    Index = i+Step - array.length;
                }
                Array[Index] = array[i];
            }
            return Array;
        }


    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}


