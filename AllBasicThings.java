// import java.util.Scanner;

public class AllBasicThings {
    public static void main(String[] args) {
        // final double PI; 
        // PI = 3.14;
        // System.out.println(PI);
        // Scanner input = new Scanner(System.in);
        // System.out.println("enter a number");
        // int a = input.nextInt();
        // System.out.println("Your number is: "+a);
        // System.out.println("enter a word");
        // input.nextLine();
        // String word = input.nextLine();
        // System.out.println(word);

        // input.close();
        // done
//-------------------------------------------------------------------------
        int newArrey[] = new int[5];
        newArrey[0] = 1;
        newArrey[1] =22;
        newArrey[2] =22;
        newArrey[3] =22;
        // --------------------------------------------
        // int[] newArrey = {1,2,4,5};
        System.out.println("the number at arrey 1 is: "+ newArrey[1]);
        // System.err.println("\n");
//----------------------------------------------------------------
        bmw blueCar = new bmw("bruh");

        blueCar.speed = 30;
        blueCar.accilerate();
        System.out.println("The cars speed is: " + blueCar.speed);
        System.out.println("The cars year is: " + blueCar.year);
        System.out.println("The cars here is: " + blueCar.here);
        blueCar.sound();


    }
    
}




