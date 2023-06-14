package Practice;
import java.util.*;
public class addEvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("the sum is"+sum);
    }
}
