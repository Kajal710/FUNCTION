import java.util.Scanner;

public class SumTwooutput {
    public static int Add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=Add(a, b);
        System.out.println(sum);
        sc.close();
    }
    
}
