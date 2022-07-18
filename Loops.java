public class Loops {
    public static void main(String[] args){
        // While Loop
            //Syntax
                // while (condition) {
                    // code block to be executed
                // }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do/While Loop
            // The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
            // Syntax
                //do {
                    // code block to be execute
                // }
                //while (condition);
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);

        //the loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:

        //FOR LOOP
            // When we know exactly how many times we want to loop through a block of code, use the for loop instead of a while loop:
            // SYNTAX
                // for (statement 1; statement 2; statement 3) {
                     // code block to be executed
                // }
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        //For-Each Loop
            //"for-each" loop, is used exclusively to loop through elements in an array:
            //SYNTAX
                // for (type variableName : arrayName) {
                     // code block to be executed
                // }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }




    }

}
