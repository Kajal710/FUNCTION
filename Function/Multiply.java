import java.util.Scanner;

public class Multiply {
    public static int Mul(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = Mul(a,b);
        System.out.println(product);
        sc.close();
        
    }
    
}
