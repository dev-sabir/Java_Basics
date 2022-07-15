import java.util.Date;

public class Types {

    public static void main(String[] args){
        
        // There're mainly two categories of types in java
        //A. Primitive -> For storing simple values
        //B. Reference -> For storing complex objects

        // PRIMITIVE TYPES
        // TYPE         Bytes       Range
        
        //For storing whole numbers
        // byte         1           [-128, 127]
        // short        2           [-32k, 32k]
        // int          4           [-2B,2B] B=billion
        // long         8           Even Larger

        //For Storing Decimal number
        //float         4
        //double        8

        //For storing single character
        // char         2           A,B,c,...

        //For storing boolean value
        //bool

        //Examples

        byte age = 30;
        int viewsCount = 123456789;
        //in java to make number more readable(i.e. 123,45,478) we can use '_' (123_45_678)
        
        //int viewsCount2= 3_123_456_789;
        // the above value is out of int scope so it will raise error
        //Even if we do this
        //long viewsCoint2 = 3_123_456_789; //The error will be still there 
        //reason for getting this(even after adding long) error is that by default Java sees these numbers as integers so even though we 
        //have defined the type of this variable as long java compiler sees this value as an integer and thinks this value is too large for an integer
        //To solve this problem we need to add an L as a suffix like this
        
        long viewsCount2 = 3_123_456_789L; //we can also use lower case l instead of UpperCase L

        //in case of decimal numbers by default java assumes it to be double

        float price = 10.99F; //float price = 10.99 will raise error
        
        double p = 102020.33;
        
        char letter = 'A';
        //char letter2 = "A"; ERROR-> char will be in single quotes
        String name = "Mohd Sabir"; //Sequence of character should be in  double quotes
        //String  name2 = 'Mohd Sabir'; ERROR-> String must be in double quotes

        boolean isEligible = false;
        System.out.println(isEligible);

        //REFERENCE TYPE
        //All the other type other than primitive type are reference type

        //Example
        byte agee = 30;
        Date now = new Date();
        //Primitive types don't have members(we can't do something like age.xyz() ) but reference type have
        now.getTime();
        System.out.println(now);

        //The main differences between the primitive and reference types when declaring
        //primitive types we don't need to allocate memory, memory is allocated and release
        // by java Runtime environment but when dealing with reference types we should always
        //allocate memory now we don't have to release this memory Java Runtime Environment will
        //automatically take care of that

        //Reference types are copied by the references whereas primitive types are copied by their value and
        //these values are completely independent of each other
    }
    
}
