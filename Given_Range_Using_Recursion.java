package PrepInsta_100_Program;

public class Given_Range_Using_Recursion {
    public  static  int prem(int n1,int n2){
        if (n1==n2){
            return n1;
        }
       int sum= prem(n1+1,n2);
        sum+=n1;
        return  sum;

    }

    public static void main(String[] args) {
        int n1=12;
        int n2=15;
       int result= prem(n1,n2);
        System.out.println(result);


    }
}
