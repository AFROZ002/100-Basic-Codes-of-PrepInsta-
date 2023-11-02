package PrepInsta_100_Program;

public class Natural_Sum_Using_Recursion {
    public  static  int  print(int n1){
        if (n1==0){
            return 0;
        }

      int sum=  print(n1-1);
        sum+=n1;
//        System.out.println(sum);
         return  sum;

    }
    public static void main(String[] args) {
        int n1=5;
      int result=  print(n1);
        System.out.println(result);

    }
}
