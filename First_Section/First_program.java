import java.util.Scanner;

public class First_program {
    public static void main(String[] args) {
        System.out.println("Enter the Number :-");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
            System.out.println("The Given  number is +ve number"+number);

        } else if (number<0) {
            System.out.println("The  Number  is -ve Number:-  " +number);


        }
        else {
            System.out.println("the number is zero "+number);

        }
    }
}
