package exercises;

import java.util.Arrays;

public class ShowCaseString {

    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = new String("HELLO woRld!");

        //equality (value!!!)
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals ignore case: " + str1.equalsIgnoreCase(str2));

        //length of a string
        System.out.println("this is str1 length: " + str1.length());

        //concatenation
        String str3 = str1 + "     " + str2;
        System.out.println("concat result 1:" + str3);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str1).append("     ").append(str2).append(3.0);

        System.out.println("concat using string builder: " + stringBuilder.toString());

        System.out.println("string builder use of reverse: " + stringBuilder.reverse());

        StringBuilder stringBuilder1 = new StringBuilder();

        stringBuilder1.append("abcdefg");

        stringBuilder1.deleteCharAt(3);
        System.out.println("after deletion: " + stringBuilder1.toString());


        String str4 = "xyzazbcz";

        char ch1 = str4.charAt(2);
        System.out.println("character at position 2: " + ch1);

        // [0 2)
        System.out.println("substring position 0,2: " + str4.substring(0, 2));
        System.out.println("substring from position 3: " + str4.substring(3));

        System.out.println("after replacing z with 1: " + str4.replace('z', '1'));
        //immutable / imutabil
        System.out.println(str4);

        str4 = str4.replace('z', '1');
        System.out.println(str4);

        System.out.println("str1 to uppercase: " + str1.toUpperCase());
        System.out.println("str2 to lowercase: " + str2.toLowerCase());

        String str5 = "            Hello, world!            ";
        System.out.println("str5 trimmed: " + str5.trim());

        //how to split a string
        String str6 = "masina vapor elicopter motor";

        String[] strArray = str6.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        //indexOf
        System.out.println("Index of start position of elicopter: " + str6.indexOf("elicopter"));
        System.out.println("Index of start position of avion: " + str6.indexOf("avion"));
        System.out.println("Index of start position of character a: " + str6.indexOf('a'));
        System.out.println("Index of last position of character a: " + str6.lastIndexOf('a'));

        System.out.println("Index of last position of character 9: " + str6.indexOf('9'));


        //contains
        System.out.println("Does str6 contain vapor? " + str6.contains("vapor"));
        System.out.println("Does str6 contain vapor? " + str6.contains("va454545or"));


        char[] charArray = str6.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        System.out.println("al 6lea element din arrayul charArray: " + charArray[6]);


        //Check if a string is a palindrome
        String ex1 = "abcddcba";

        StringBuilder sb = new StringBuilder(ex1);

        String reverse = sb.reverse().toString();

        if (ex1.equals(reverse)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }


        //check if string is anagram

        // listen
        // silent

        String s1 = "listen";
        String s2 = "silent";

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println("s1 and s2 anagrams? " + Arrays.equals(charArray1, charArray2));


    }
}
