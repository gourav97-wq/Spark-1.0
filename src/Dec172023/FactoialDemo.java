package Dec172023;
import java.util.Scanner;
public class FactoialDemo {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("enter the number.....");
        int n=sd.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }


}
