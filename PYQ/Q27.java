/*Illustrate the usage of the following methods related to String with appropriate (6)
 sample code.
 (i) find()(ii)substring() (iii) replace()*/

//indexOf() is used to find the position of a character or substring inside a string.
public class FindExample {
    public static void main(String[] args) {
        String str = "Hello World";

        int pos = str.indexOf("World");   // find substring
        System.out.println("Position of 'World' = " + pos);
    }
}
//substring() is used to extract a part of a string.
public class SubstringExample {
    public static void main(String[] args) {
        String str = "Programmer";

        String sub1 = str.substring(0, 7);   // from index 0 to 6
        System.out.println("Substring: " + sub1);
    }
}
//replace() is used to replace characters or substrings inside a string.
public class ReplaceExample {
    public static void main(String[] args) {
        String str = "Java is fun";

        String newStr = str.replace("fun", "powerful");
        System.out.println("After replace: " + newStr);
    }
}
