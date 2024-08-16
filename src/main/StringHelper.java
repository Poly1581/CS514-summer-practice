package main;

/** A class that contains several methods for manipulating strings */
public class StringHelper {

    /**
     * Returns the number of vowels (letters a, e, i, o, u)
     * in a given string.
     * @param message
     * @return the number of vowels
     */
    public static int countVowels(String message) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < message.length(); i++) {
            for (char v : vowels) {
                if (message.charAt(i) == v) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Returns the message encrypted using "Ceasar cipher"
     * with the given shift amount.
     *
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not upper
     * or lower case letters the method returns null.
     *
     * Example: (abc, 2) -> cde
     * 'a' was shifted by two characters (became 'c'),
     * 'b' became 'd', 'c' became 'e'.
     * @param message
     * @param shift
     * @return
     * @author Prof. Rollins
     */
    public static String encrypt(String message, int shift) {
        String encrypted = "";
        for(int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            char e = (char) ((int) 'a' + (((int) c) - ((int) 'a') + shift % 26));
            encrypted += e;
        }
        return encrypted;
    }

    /** Main method: runs methods of class StringHelper */
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original string: " + s);
        System.out.println("Number of vowels: " + StringHelper.countVowels(s));
        System.out.println("After encrypting: " + StringHelper.encrypt(s, 3));
    }

}
