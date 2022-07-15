public class Variables {
    public static void main(String[] args){
        int age = 30;
        System.out.println(age);
        age = 35;
        System.out.println(age); 
        
        //Declearing Multiple variable in line

        int year=2022, month=7,date=15;
        //But It's always better to declear one variable on each line
        
        //We can't do this
        //System.out.println(year,month, date);

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);


        //We can also copy the value of one variable into another

        int myAge = 20;
        int hisAge = myAge;
        System.out.println( hisAge);


    }
}
