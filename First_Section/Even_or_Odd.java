package First_Section;

import java.util.Scanner;

public class Even_or_Odd {
    public  static   void even(int number){
        if (number%2==0){
            System.out.println("The number is Even Number "+ number);
        }
        if (number%2!=0){
            System.out.println("The Number is  odd Number");
        }

    }
    public static void main(String[] args) {
//        System.out.println("Enter the Number");
//        Scanner sc=new Scanner(System.in);
//        int number= sc.nextInt();
//
//        if (number%2==0){
//            System.out.println("The number is Even Number "+ number);
//        }
//        if (number%2!=0){
//            System.out.println("The Number is  odd Number");
//        }
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        even(number);

    }
}
