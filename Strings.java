import java.lang.management.GarbageCollectorMXBean;
import java.util.Locale;

public class Strings {

    public static void main(String[] args){

        System.out.println("Hello world");
        String message = new String("Welcome");
        System.out.println(message);
        //But in Java there is a shorter way to initialize a String

        String message2 = "Welcome to Java World!!"; //This look like a primitive type because
        // we're not using the new operator but this is just a shorthand to initialize a string variable
        System.out.println(message2);

        //Strings are reference type in java

        //We can concatenate or join a string with another string using '+' operator
        System.out.println("Hello" + "World!!");

        //because string is a class it has members that we can access using the '.' operator
        String greeting = "Welcome to programming World!!";
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.endsWith("!!")); //true
        System.out.println(greeting.endsWith("2")); //false
        System.out.println(greeting.startsWith("W")); // true
        System.out.println(greeting.startsWith("w")); //false
        System.out.println(greeting.length()); //get the no. of characters(including spaces)
        System.out.println(greeting.indexOf("e")); //return the first occurrence of the character(if character not present in the string return -1)
        System.out.println(greeting.replace("!", "*")); // all the occurrences of ! will be replaced by *. [Note-> This method does  not modify our original string, it returns a new string]
        //Remember -> ** In java strings are immutable, we can't mutate them we can not change them so any
        // method that modify a string will always return a new string object **
        String newMessage = " How are you?  ";
        System.out.println(newMessage.trim()); // get rid of extra white spaces that can be at the "beginning" or the "end" of a string

        //For more methods refer the below link
        // https://www.w3schools.com/java/java_ref_string.asp









    }
}
