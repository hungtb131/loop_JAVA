package loopjava;

import java.util.Scanner;

public class interestMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment mount: ");
        double money = input.nextDouble();
        System.out.println("Enter number of month : ");
        int month = input.nextInt();
        System.out.println("Enter the enual interest  rate in percentage : ");
        double interes_rate = input.nextDouble();
        double total_interest = 0;
        //for (int i =0;i<month;i++){
            total_interest = money * (interes_rate/100)/12 *month;

        //}
        System.out.println("Total interest  : " + total_interest);
    }
}
