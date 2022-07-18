public class Conditions {
    public static void main(String[] args){

//        Less than: a < b
//        Less than or equal to: a <= b
//        Greater than: a > b
//        Greater than or equal to: a >= b
//        Equal to a == b
//        Not Equal to: a != b

        //Java has the following conditional statements:

//        Use if to specify a block of code to be executed, if a specified condition is true
//        Use else to specify a block of code to be executed, if the same condition is false
//        Use else if to specify a new condition to test, if the first condition is false
//        Use switch to specify many alternative blocks of code to be executed

        // if (condition1) {
        //  // block of code to be executed if condition1 is true
        // } else if (condition2) {
        //  // block of code to be executed if the condition1 is false and condition2 is true
        // } else {
        //  // block of code to be executed if the condition1 is false and condition2 is false
        // }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        //SHORT HAND IF ELSE
        //There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

        //It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

        //SYNTAX
        //variable = (condition) ? expressionTrue :  expressionFalse;
        int time1 = 20;
        String result = (time1 < 18) ? "Good day." : "Bad Day.";
        System.out.println(result);

    }
}
