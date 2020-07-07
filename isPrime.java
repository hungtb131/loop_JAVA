package loopjava;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you wanna check :");
        int number = sc.nextInt();
        if(number<2)
            System.out.println( number + " "+ "This number is not Prime");
        else {
            int i = 2;
            boolean checkprime =  true;
            while (i <= Math.sqrt(number)){
                if (number%i ==0){
                    checkprime = false;
                    break;
                }
                i++;
            }
            if (checkprime){
                System.out.println( number +" "+ "This number is a Prime" );
            }
            else {
                System.out.println( number +" " + "This number is not a Prime");
            }
            }

    }
}
