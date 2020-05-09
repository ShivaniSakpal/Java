import java.util.Scanner;
import java.util.Arrays;
public class DigitToArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,temp;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        String num = Integer.toString(n);
        int l = num.length();
        int a[]=new int[l];
        while(n>0)
        {
            temp=n%10;
            a[(l-1)]=temp;
            n=n/10;
            l--;
        }
        
        System.out.println("Array : " + Arrays.toString(a));
    }
}