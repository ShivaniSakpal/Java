import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = s.nextInt();
        int rem,sum,n1;
        sum=0;
        while(n>0)
        {
            rem = n%10;
            sum=rem+(sum*10);
            n=n/10;   
        }
        System.out.println("Reverse of the number is : " + sum);
    }
}