package loopjava;

import java.util.Scanner;

public class max_common {
    public static void main(String[] args) {
        int a,b;
        Scanner sc =  new Scanner(System.in);
    System.out.print("Enter a : ");
    a = sc.nextInt();
    System.out.print("Enter b : ");
    b = sc.nextInt();
    a = Math.abs(a);
    b = Math.abs(b);
    if (a==0||b==0){
        System.out.println("No Greatest common factor");
        while (a!=b){
            if(a>b){
                a = a - b;
            }
            else{
                b = b -a;
            }
        }

    }
        System.out.println("The Greatest common factor is : " + b);
    }

}
