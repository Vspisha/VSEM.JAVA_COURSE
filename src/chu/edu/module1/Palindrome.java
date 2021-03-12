package chu.edu.module1;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Palindrome
 * @since 12.03.2021 - 15.54
 **/
public class Palindrome {
    // for
    public static boolean isPalindrom1(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
        text = text.toLowerCase();
        boolean result = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }


    //buid a reverse string
    public static boolean isPalindrom2(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
        text = text.toLowerCase();
        boolean result = true;
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed.equals(text);
    }


    // use string builder
    public static boolean isPalindrom3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        return (reversed.equals(text));
    }


    public static void main(String[] args) {
        String text = "Мох у азиата и за ухом";
        System.out.println("The first way :");
        System.out.println(text + " - is a palindome -  " + isPalindrom1(text));
        System.out.println("The second way :");
        System.out.println(text + " - is a palindome -  " + isPalindrom2(text));
        System.out.println("The third way :");
        System.out.println(text + " - is a palindome -  " + isPalindrom3(text));

      /*  The first way :
        Мох у азиата и за ухом - is a palindome -  true
        The second way :
        Мох у азиата и за ухом - is a palindome -  true
        The third way :
        Мох у азиата и за ухом - is a palindome -  true */

    }
}

