/*
54321
4321
321
21
1
*/
import java.util.Scanner;
public class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}