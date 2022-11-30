import java.util.*;

public class Nameoutput {
    public static void Name(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Name(name);
        sc.close();
    }
    
}
